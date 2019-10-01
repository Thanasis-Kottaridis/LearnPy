package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class DataHelper {

    //preference file
    public static final String PREF_FILE = "hared preferences";
    //user profile key
    public static final String PREF_USER_KEY = "pref user key";

    private static  User user;


    private SharedPreferences sharedPreferences;
    // orizw instance gia real time database
    private FirebaseDatabase database;
    private DatabaseReference databaseRef;
    //DIAXIRISI TOU USER STA SHEAREDPREFERENCES!

    //tin kanw static gia na mporw na tin kalesw xoris antikimeno
    //etsi oste na apofigo to instantiate tou helper kathe fora pou thelw na kanw read i write
    // method gia na kanei save-update to user profile stin firebase alla kai sta sheared preferences
    public static void saveUserProfileToFB(Context context, User user){
        // orizw instance gia real time database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseRef = database.getReference();

        //paei stin FB ston node me tous users kai ftiaxnei kenourio kladi me id to email tou user
        DatabaseReference usersRef = databaseRef.child("Users");

        //remove special characters from email
        String email = user.getEmail();
        String userID = "";
        for(int i = 0 ; i<email.length(); i++){
            if(!(email.charAt(i) == '@' || email.charAt(i) == '.' || email.charAt(i) == '_' || email.charAt(i) == '-')){
                userID = userID+email.charAt(i);
            }
        }

        //isagei ton user se neo komvo tou users me id to email tou xoris idikous xaraktires
        usersRef.child(userID).setValue(user);
    }

    public static void saveUserProfileToSP(Context context, User user){
        SharedPreferences sharedPreferences;


        // apothikeuei ton signed in user sta preferences me morfi json
        sharedPreferences = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(user);
        editor.putString(PREF_USER_KEY,json);
        editor.commit();
    }

    //method gia na fortonei to profile tou user apo ta shared preferences
    public static User loadUserProfileFromSP(Context context){
        //fortonei to pref file
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE,Context.MODE_PRIVATE);
        // ftiaxnei ena neo gson obj
        Gson gson = new Gson();
        // diavazei ton user se json morfi pao to pref file
        String json = sharedPreferences.getString(PREF_USER_KEY,null);
        // dilonoume ton tipo tpou tha ginei metatropi tou sting pou diavasa
        Type type = new TypeToken<User>(){}.getType();
        // epistrefi to joson petatrepontas to string sto type pou orisa
        return gson.fromJson(json,type);

    }

    public static User loadUserProfileFromFB(final Context context, String email){


        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseRef = database.getReference();

        //paei stin FB ston node me tous users kai ftiaxnei kenourio kladi me id to email tou user
        DatabaseReference usersRef = databaseRef.child("Users");

        //remove special characters from email
        String userID = "";
        for(int i = 0 ; i<email.length(); i++){
            if(!(email.charAt(i) == '@' || email.charAt(i) == '.' || email.charAt(i) == '_' || email.charAt(i) == '-')){
                userID = userID+email.charAt(i);
            }
        }
         usersRef = usersRef.child(userID);
        //listener gia na fortonei ton user kathe fora pou alazei
        // fortonei to snapshot tis FB kai pernei tin timi tou metatrepontas to se user class
        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //fortonei ton user apo tin FB
                user = dataSnapshot.getValue(User.class);
                //enimeronei kai ta SP
                saveUserProfileToSP(context,user);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return user;
    }

    public static void uploadCourseCategory(CourseCategory courseCategory){
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta course categories

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference databaseRef = database.getReference();
        DatabaseReference Ref = databaseRef.child("CourseCategories").child(courseCategory.getCategoryName().replaceAll("\\s+",""));

        //pame mesa sto Courses tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.setValue(courseCategory);
    }

    public static void uploadCourse(Courses courses){
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta courses

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference databaseRef = database.getReference();
        DatabaseReference Ref = databaseRef.child("courses").child(courses.getCourseCategory().replaceAll("\\s+","")).child(String.valueOf(courses.getLevel()));

        //pame mesa sto Courses tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.setValue(courses);
    }



}
