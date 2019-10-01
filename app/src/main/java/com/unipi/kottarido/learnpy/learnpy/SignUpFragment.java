package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;

public class SignUpFragment extends Fragment {

    //Log TAGS
    public static final String TAG = "SignUpFragment";
    private static final String SIGN_UP_SUCCEED = "Succeed Sign in";
    public static final String SIGN_UP_FAILED = "Failed Sign in";
    public static final String ACCOUNT_CREATED = "Account created";

    //preference file
    public static final String PREF_FILE = "hared preferences";
    public static final String PREF_USER_KEY = "pref user key";

    // orizw to instance tou firebase Auth
    private FirebaseAuth mAuth;
    // orizw instance gia realtimedatabe
    private FirebaseDatabase database;
    private DatabaseReference databaseRef;

    //sheared preferences gia na apothikeuei ton user
    private SharedPreferences sharedPreferences;
    private EditText UsernameText;
    private EditText EmailText;
    private EditText PasswordText;
    private Button SignUpButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_up_fragment_layout,container,false);
        Log.d(TAG,"onCreateView: started");

        // kanw initialize to instance tis FirebaseAuth
        // i getInstance entoli epistrefei to instance tou user pou einai sindedemenos stin efarmogi
        // an den einai kapios user sindedemenos apo auti tin siskeui epistrefei null
        // instantiate to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        // meso tou instance pou dimiourgisame
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        databaseRef  = database.getReference();

        //vriskw ta views tou layout
        UsernameText = view.findViewById(R.id.UsernameText_SignUp);
        EmailText = view.findViewById(R.id.EmailText_SignUp);
        PasswordText = view.findViewById(R.id.PasswordText_SignUp);
        SignUpButton = view.findViewById(R.id.SignUpButton_SignUp);

        //sto patima tou signUp button
        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = UsernameText.getText().toString();
                String email = EmailText.getText().toString();
                String password = PasswordText.getText().toString();

                // kalw tin methodo gia signUp
                SignUpMethod(username, email, password);
            }
        });

        return view;
    }

    //create account method
    // to username einai final gt to pernaw os parametro se ali method
    private void SignUpMethod(final String username, final String email, String password){

        //dimiourgei xristi me email kai password sto firebase auth
        // ** otan dimiourgite enas user ginete automata kai o current user mexri na kanei logout
        // otan oloklirothei i diadikasia tis egrafis trexei to onComplete event pou elnxei
        // an itan epitixis i oxi! an itan epitixis kanei enimerosi sto username tou xristi
        // afou enimerosei to username tou xristei ton katagrafei kai stin realtime database
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()){
                            Log.d(SIGN_UP_FAILED,"Sign Up Failed "+task.getException());
                            Toast.makeText(getActivity(),"Invalid Email Or Password \n password must be at least 4 characters" , Toast.LENGTH_LONG).show();
                        }
                        else {
                            Log.d(SIGN_UP_SUCCEED,"Sing up Successful"+ task.isSuccessful());
                            updateUI(username);

                            // dimiourgei antikimeno tou user
                            DataHelper.saveUserProfileToFB(getActivity(), new User(email));
                            DataHelper.saveUserProfileToSP(getActivity(),new User(email));

                            //enimeronei ton user oti egine epitixis egkrafi
                            Toast.makeText(getActivity(),"Account created!",Toast.LENGTH_SHORT).show();
                            Log.d(ACCOUNT_CREATED,"Account Created");
                        }
                    }
                });
    }

    //methodos gia enimerosi tou username tou xristi pou molis egrafei sto sistima!
   private void updateUI(String username){
       final FirebaseUser user = mAuth.getCurrentUser();
       if (user != null) {
           UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                   .setDisplayName(username)
                   .build();

           user.updateProfile(profileUpdates)
                   .addOnCompleteListener(new OnCompleteListener<Void>() {
                       @Override
                       public void onComplete(@NonNull Task<Void> task) {
                           if (task.isSuccessful())
                               Log.d("TESTING", "Profile updated successful");
                           //pigenei sto main acctivity i sto setUpProfile
                           startActivity(new Intent(getActivity(), SetUpProfileActivity.class));
                           getActivity().finish();
                       }
                   });
       }
   }
}
