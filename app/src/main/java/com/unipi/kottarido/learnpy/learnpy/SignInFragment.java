package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class SignInFragment extends Fragment {

    //Log TAGS
    public static final String TAG = "SignInFragment";
    private static final String SIGN_IN_SUCCEED = "Succeed Sign in";
    public static final String SIGN_IN_FAILED = "Failed Sign in";

    //orizw to antikimeno to user
    private List<User> users;

    // orizw to instance tou firebase Auth
    private FirebaseAuth mAuth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    //layout views
    private EditText EmailText;
    private EditText PasswordText;
    private Button LogInButton;
    private TextView CreateAccount;
    private TextView ForgotPassword;
    private ImageView FacebookImage;
    private ImageView GoogleImage;
    private ImageView InstagramImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_in_fragment_layout,container,false);
        Log.d(TAG,"onCreateView: started");


        // kanw initialize to instance tis FirebaseAuth
        // i getInstance entoli epistrefei to instance tou user pou einai sindedemenos stin efarmogi
        // an den einai kapios user sindedemenos apo auti tin siskeui epistrefei null
        mAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        //fortonei olous tou users
        DatabaseReference userRef = databaseReference.child("Users");
        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                users= new ArrayList<>();

                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    User user = ds.getValue(User.class);
                    users.add(user);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        //elenxos an o user einai eidi sindedemenos diladi current user != null
        if(mAuth.getCurrentUser() != null){
            //fortonei ton sindedemeno user apo ta SP
            User SignedInUser = DataHelper.loadUserProfileFromSP(getActivity());
            //elenxos an o user exei kanei setUp to profile tou
            if (SignedInUser.getUserType() != null && !SignedInUser.getUserType().getTitle().equals("Admin")) {
                //tote paei sto mainActivity;
                startActivity(new Intent(getActivity(), MainActivity.class));
                getActivity().finish();
            }
            else if(SignedInUser.getUserType() != null){
                //tote paei sto Admin Activity;
                startActivity(new Intent(getActivity(), AdminActivity.class));
                getActivity().finish();
            }
            else {
                //tote paei sto SetUp Activity;
                startActivity(new Intent(getActivity(), SetUpProfileActivity.class));
                getActivity().finish();
            }
        }

        //vriskei ta views apo ta id tous
        EmailText = view.findViewById(R.id.EmailText_LogIn);
        PasswordText = view.findViewById(R.id.PasswordText_LogIn);
        LogInButton = view.findViewById(R.id.continue_button);
        CreateAccount = view.findViewById(R.id.CreateAccount_LogIn);
        ForgotPassword = view.findViewById(R.id.ForgotPassword_LogIn);
        FacebookImage = view.findViewById(R.id.FacebookImage_LogIn);
        GoogleImage = view.findViewById(R.id.GoogleImage_LogIn);
        InstagramImage = view.findViewById(R.id.InstagramImage_LogIn);

        //sto onClick tou LogIn
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = EmailText.getText().toString();
                String password = PasswordText.getText().toString();

                SignInMethod(email , password);
            }
        });


        //sto onClick tou Create Account
        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to fragment method called
                //me auti tin entoli tou lew kalese tin setViewPager tis MainActivity
                // kai vale san currnetItem tou viewPager to item 1
                ((AuthenticationActivity)getActivity()).setViewPager(1);
            }
        });
        return view;
    }

    // method gia tin pragmatopoiisi tou LogIn
    private void SignInMethod(final String email, String password){

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
            // otan oloklirothei i diadikasia tautopoiisis twn stixion tou xristi sth firebase
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                // an i eisagogi einai epitixis
                //foronei to antikimeno tou user apo tin firebase
                //kai to apothikeuei sta sharedPreferences
                //kai metaferete stin main
                if(task.isSuccessful()){
                    //sign in succeed
                    Log.d(SIGN_IN_SUCCEED, "SignInWithEmail: Succeed!");
                    //enimeronei ta sheared pref oti sindethike kenourios user
                    User SignedInUser = null;

                    //psaxnei mesa stous users gia ton sindedemeno user
                    for (User user : users){
                        if (user.getEmail().equals(email)) {
                            SignedInUser = user;
                            SignedInUser.initialiseUser();
                        }
                    }

                    DataHelper.saveUserProfileToSP(getActivity(),SignedInUser);


                    // elenxei an o user pou sindethike exei kanei setup to profile tou
                    if (SignedInUser.getUserType() != null && SignedInUser.getUserPreferences() != null && SignedInUser.getUserLevels() != null && !SignedInUser.getUserType().getTitle().equals("Admin")) {
                        //tote paei sto mainActivity;
                        startActivity(new Intent(getActivity(), MainActivity.class));
                        getActivity().finish();
                    }
                    else if(SignedInUser.getUserType() != null && SignedInUser.getUserPreferences() != null && SignedInUser.getUserLevels() != null){
                        //tote paei sto Admin Activity;
                        startActivity(new Intent(getActivity(), AdminActivity.class));
                        getActivity().finish();
                    }
                    else {
                        //tote paei sto SetUp Activity;
                        startActivity(new Intent(getActivity(), SetUpProfileActivity.class));
                        getActivity().finish();
                    }
                }
                //an i eisagogi einai anepitixis
                else {
                    // emfanizei message ston user
                    Log.w(SIGN_IN_FAILED, "signInWithEmail:failed", task.getException());
                    Toast.makeText(getActivity(), "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
