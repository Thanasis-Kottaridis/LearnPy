package com.unipi.kottarido.learnpy.learnpy;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AddAdminActivity extends AppCompatActivity {

    private List<User> users;

    // gia to help
    private Toolbar toolbar;


    //gia to RecycleView
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    // orizw firbasedatabe gia tous users
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_admin);

        //ftiaxnei to help stin toollbar
        toolbar = findViewById(R.id.add_admin_toolBar);
        setSupportActionBar(toolbar);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        users = new ArrayList<>();

        // pigeni stin firebase sto ref pou einai oi users
        DatabaseReference coursesRef = databaseReference.child("Users");

        // diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
        coursesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // adiazei tin courses
                users = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
                //kai ma sto epistrefei opou kathe children autou tou snapshot einai enas user

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    User m = ds.getValue(User.class);
                    // elengxei an o user den einai admin
                    if(!m.getUserType().getTitle().equals("Admin"))
                        users.add(m);

                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                    ((AddAdminRecyclerViewAdapter) mAdapter).setUsers(users);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = findViewById(R.id.addAdminRecyclerView);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        // o GrigdLayoutManager leei oti se kathe grami tou recycler view tha eixei 2 items
        mlayoutManager = new LinearLayoutManager(this);
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new AddAdminRecyclerViewAdapter(users);
        mView.setAdapter(mAdapter);

        ((AddAdminRecyclerViewAdapter)mAdapter).setItemClickListener(new AddAdminRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(final User user) {
                ShowMessage("Are you sure you wanna make user: "+ user.getEmail()+" administrator?",user);
            }
        });
    }

    public void ShowMessage(String s, final User user){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Add Admin!");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //kanei ton user Admin
                user.getUserType().setDescription("System Administrator");
                user.getUserType().setTitle("Admin");

                //enimeronei ton user stin firebase
                DataHelper.saveUserProfileToFB(getApplicationContext(),user);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setMessage(s);
        builder.show();
    }

    // events gia to help sto toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.help_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_help:
                Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
                intent.putExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/OnlineHelp%2Fadmin_manual.htm?alt=media&token=6a2df902-3b55-4a9a-9afa-f5df16f558f3");
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
