package com.unipi.kottarido.learnpy.learnpy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UploadCoursesToFB {

    private List<Courses> courses;

    public UploadCoursesToFB(){
        //
        //ARXIKOPOIO TTA COURCES
        //
        courses = new ArrayList<>();
        //
        //kanei add sto sistima tin itroduction to python course
        //

        List<Chapter> chapters = new ArrayList<>();
        Chapter chapter1 = new Chapter(1,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        Chapter chapter2 = new Chapter(2,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        Chapter chapter3 = new Chapter(3,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        Chapter chapter4 = new Chapter(4,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        Chapter chapter5 = new Chapter(5,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        Chapter chapter6 = new Chapter(6,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        Chapter chapter7 = new Chapter(7,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        Chapter chapter8 = new Chapter(8,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        Chapter chapter9 = new Chapter(9,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        Chapter chapter10 = new Chapter(10,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        Courses course = new Courses("Introduction To Python",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);
        courses.add(course);

         //vazei tin arithmetic in python


        List<Chapter> chapters2 = new ArrayList<>();
        Chapter chapter21 = new Chapter(1,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        Chapter chapter22 = new Chapter(2,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        Chapter chapter23 = new Chapter(3,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        Chapter chapter24 = new Chapter(4,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        Chapter chapter25 = new Chapter(5,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        Chapter chapter26 = new Chapter(6,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        Chapter chapter27 = new Chapter(7,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        Chapter chapter28 = new Chapter(8,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        Chapter chapter29 = new Chapter(9,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        Chapter chapter210 = new Chapter(10,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        Courses course2 = new Courses("Introduction To Python",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

         //vazei tin variable basics

        List<Chapter> chapters3 = new ArrayList<>();
        Chapter chapter31 = new Chapter(1,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        Chapter chapter32 = new Chapter(2,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        Chapter chapter33 = new Chapter(3,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        Chapter chapter34 = new Chapter(4,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        Chapter chapter35 = new Chapter(5,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        Chapter chapter36 = new Chapter(6,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        Chapter chapter37 = new Chapter(7,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        Chapter chapter38 = new Chapter(8,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        Chapter chapter39 = new Chapter(9,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        Chapter chapter310 = new Chapter(10,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        Courses course3 = new Courses("Introduction To Python",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        List<Chapter> chapters4 = new ArrayList<>();
        Chapter chapter41 = new Chapter(1,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        Chapter chapter42 = new Chapter(2,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        Chapter chapter43 = new Chapter(3,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        Chapter chapter44 = new Chapter(4,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        Chapter chapter45 = new Chapter(5,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        Chapter chapter46 = new Chapter(6,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        Chapter chapter47 = new Chapter(7,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        Chapter chapter48 = new Chapter(8,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        Chapter chapter49 = new Chapter(9,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        Chapter chapter410 = new Chapter(10,new Tuple("Introduction To Python",4),"(Introduction to python - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        Courses course4 = new Courses("Introduction To Python",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        List<Chapter> chapters5 = new ArrayList<>();
        Chapter chapter51 = new Chapter(1,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        Chapter chapter52 = new Chapter(2,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        Chapter chapter53 = new Chapter(3,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        Chapter chapter54 = new Chapter(4,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        Chapter chapter55 = new Chapter(5,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        Chapter chapter56 = new Chapter(6,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        Chapter chapter57 = new Chapter(7,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        Chapter chapter58 = new Chapter(8,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        Chapter chapter59 = new Chapter(9,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        Chapter chapter510 = new Chapter(10,new Tuple("Introduction To Python",5),"(Introduction to python - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        Courses course5 = new Courses("Introduction To Python",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Data Analisis - Big Data category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Data Analisis - Big Data",1),"(Data Analysis - Big Data - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Data Analysis - Big Data",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Data Analysis - Big Data",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Data Analysis - Big Data",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Data Analysis - Big Data",4),"(Data Analysis - Big Data - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Data Analysis - Big Data",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Data Analysis - Big Data",5),"(Data Analysis - Big Data - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Data Analysis - Big Data",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Machine Learning category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Machine Learning",1),"(Machine Learning - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Machine Learning",1),"(Machine Learning - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Machine Learning",1),"(Machine Learning - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Machine Learning",1),"(Machine Learning- lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Machine Learning",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Machine Learning",2),"(Machine Learning - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Machine Learning",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Machine Learning",3),"(Machine Learning - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Machine Learning",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Machine Learning",4),"(Machine Learning - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Machine Learning",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Machine Learning",5),"(Machine Learning - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Machine Learning",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Web Development - Django category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Web Development - Django",1),"(Web Development - Django - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Web Development - Django",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Web Development - Django",2),"(Web Development - Django - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Web Development - Django",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Web Development - Django",3),"(Web Development - Django - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Web Development - Django",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Web Development - Django",4),"(Web Development - Django - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Web Development - Django",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Web Development - Django",5),"(Web Development - Django - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Web Development - Django",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Desktop And GUI Applications category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Desktop And GUI Applications",1),"(Desktop And GUI Applications- lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Desktop And GUI Applications",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Desktop And GUI Applications",2),"(Desktop And GUI Applications - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Desktop And GUI Applications",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Desktop And GUI Applications",3),"(Desktop And GUI Applications - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Desktop And GUI Applications",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Desktop And GUI Applications",4),"(Desktop And GUI Applications - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Desktop And GUI Applications",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Desktop And GUI Applications",5),"(Desktop And GUI Applications - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Desktop And GUI Applications",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Scientific And Numeric Applications category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications- lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications- lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Scientific And Numeric Applications",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Scientific And Numeric Applications",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Scientific And Numeric Applications",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Scientific And Numeric Applications",4),"(Scientific And Numeric Applications - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Scientific And Numeric Applications",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Scientific And Numeric Applications",5),"(Scientific And Numeric Applications - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Scientific And Numeric Applications",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Software Development category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Software Development",1),"(Software Development - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Software Development",1),"(Software Development - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Software Development",1),"(Software Development - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Software Development",1),"(Software Development - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Software Development",1),"(Software Development - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Software Development",1),"(Software Development - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Software Development",1),"(Software Development - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Software Development",1),"(Software Development - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Software Development",1),"(Software Development - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Software Development",1),"(Software Development - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Software Development",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Software Development",2),"(Software Development - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Software Development",2),"(Software Development - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Software Development",2),"(Software Development - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Software Development",2),"(Software Development - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Software Development",2),"(Software Development - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Software Development",2),"(Software Development - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Software Development",2),"(Software Development - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Software Development",2),"(Software Development - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Software Development",2),"(Software Development - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Software Development",2),"(Software Development - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Software Development",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Software Development",3),"(Software Development - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Software Development",3),"(Software Development - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Software Development",3),"(Software Development - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Software Development",3),"(Software Development - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Software Development",3),"(Software Development - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Software Development",3),"(Software Development - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Software Development",3),"(Software Development - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Software Development",3),"(Software Development - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Software Development",3),"(Software Development - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Software Development",3),"(Software Development - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Software Development",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Software Development",4),"(Software Development - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Software Development",4),"(Software Development - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Software Development",4),"(Software Development - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Software Development",4),"(Software Development - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Software Development",4),"(Software Development - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Software Development",4),"(Software Development - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Software Development",4),"(Software Development - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Software Development",4),"(Software Development - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Software Development",4),"(Software Development - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Software Development",4),"(Software Development - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Software Development",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Software Development",5),"(Software Development - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Software Development",5),"(Software Development - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Software Development",5),"(Software Development - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Software Development",5),"(Software Development - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Software Development",5),"(Software Development - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Software Development",5),"(Software Development - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Software Development",5),"(Software Development - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Software Development",5),"(Software Development - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Software Development",5),"(Software Development - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Software Development",5),"(Software Development - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Software Development",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima tin Security And Cryptography category
        //

        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Security And Cryptography",1),"(Security And Cryptography - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Security And Cryptography",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Security And Cryptography",2),"(Security And Cryptography - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Security And Cryptography",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Security And Cryptography",3),"(Security And Cryptography - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Security And Cryptography",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Security And Cryptography",4),"(Security And Cryptography - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Security And Cryptography",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Security And Cryptography",5),"(Security And Cryptography - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Security And Cryptography",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima ta cource tou Games And 3D Graphics category
        //


        //
        //kanei add sto sistima tin itroduction to python course
        //

        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Games And 3D Graphics",1),"(Games And 3D Graphics - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Games And 3D Graphics",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Games And 3D Graphics",2),"(Games And 3D Graphics - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Games And 3D Graphics",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Games And 3D Graphics",3),"(Games And 3D Graphics - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Games And 3D Graphics",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics- lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Games And 3D Graphics",4),"(Games And 3D Graphics - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Games And 3D Graphics",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Games And 3D Graphics",5),"(Games And 3D Graphics - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Games And 3D Graphics",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);

        //
        //kanei add sto sistima ta courses tou Scripting And Web Scripting category
        //


        chapters = new ArrayList<>();
        chapter1 = new Chapter(1,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting- lvl 1)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter2 = new Chapter(2,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting- lvl 1)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter3 = new Chapter(3,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting- lvl 1)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter4 = new Chapter(4,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter5 = new Chapter(5,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter6 = new Chapter(6,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter7 = new Chapter(7,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter8 = new Chapter(8,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter9 = new Chapter(9,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter10 = new Chapter(10,new Tuple("Scripting And Web Scripting",1),"(Scripting And Web Scripting - lvl 1) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);

        // ftiaxnw to course
        course = new Courses("Scripting And Web Scripting",1,"Introduction To Python",R.drawable.py_practise_icon,chapters);
        DataHelper.uploadCourse(course);

        //vazei tin arithmetic in python


        chapters2 = new ArrayList<>();
        chapter21 = new Chapter(1,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter22 = new Chapter(2,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter23 = new Chapter(3,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter24 = new Chapter(4,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter25 = new Chapter(5,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter26 = new Chapter(6,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter27 = new Chapter(7,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter28 = new Chapter(8,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter29 = new Chapter(9,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter210 = new Chapter(10,new Tuple("Scripting And Web Scripting",2),"(Scripting And Web Scripting - lvl 2) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters2.add(chapter21);
        chapters2.add(chapter22);
        chapters2.add(chapter23);
        chapters2.add(chapter24);
        chapters2.add(chapter25);
        chapters2.add(chapter26);
        chapters2.add(chapter27);
        chapters2.add(chapter28);
        chapters2.add(chapter29);
        chapters2.add(chapter210);

        // ftiaxnw to course
        course2 = new Courses("Scripting And Web Scripting",2,"Arithmetic In Python",R.drawable.py_practise_icon,chapters2);
        DataHelper.uploadCourse(course2);

        //vazei tin variable basics

        chapters3 = new ArrayList<>();
        chapter31 = new Chapter(1,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter32 = new Chapter(2,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter33 = new Chapter(3,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter34 = new Chapter(4,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter35 = new Chapter(5,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter36 = new Chapter(6,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter37 = new Chapter(7,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter38 = new Chapter(8,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter39 = new Chapter(9,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter310 = new Chapter(10,new Tuple("Scripting And Web Scripting",3),"(Scripting And Web Scripting - lvl 3) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters3.add(chapter31);
        chapters3.add(chapter32);
        chapters3.add(chapter33);
        chapters3.add(chapter34);
        chapters3.add(chapter35);
        chapters3.add(chapter36);
        chapters3.add(chapter37);
        chapters3.add(chapter38);
        chapters3.add(chapter39);
        chapters3.add(chapter310);

        // ftiaxnw to course
        course3 = new Courses("Scripting And Web Scripting",3,"Variable Basics",R.drawable.py_practise_icon,chapters3);
        DataHelper.uploadCourse(course3);


        //vazei to datatypes in python


        chapters4 = new ArrayList<>();
        chapter41 = new Chapter(1,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter42 = new Chapter(2,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter43 = new Chapter(3,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter44 = new Chapter(4,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter45 = new Chapter(5,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter46 = new Chapter(6,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter47 = new Chapter(7,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter48 = new Chapter(8,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter49 = new Chapter(9,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter410 = new Chapter(10,new Tuple("Scripting And Web Scripting",4),"(Scripting And Web Scripting - lvl 4) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters4.add(chapter41);
        chapters4.add(chapter42);
        chapters4.add(chapter43);
        chapters4.add(chapter44);
        chapters4.add(chapter45);
        chapters4.add(chapter46);
        chapters4.add(chapter47);
        chapters4.add(chapter48);
        chapters4.add(chapter49);
        chapters4.add(chapter410);

        // ftiaxnw to course
        course4 = new Courses("Scripting And Web Scripting",4,"Datatypes In Python",R.drawable.py_practise_icon,chapters4);
        DataHelper.uploadCourse(course4);


        // vazei tin operating data types


        chapters5 = new ArrayList<>();
        chapter51 = new Chapter(1,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5)'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
                true, Arrays.asList(new String[]{"2","4","42"}), "42");

        chapter52 = new Chapter(2,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5)Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");

        chapter53 = new Chapter(3,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5)You can also use python as calculator! To add two numbers, just use '+'.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
                true, Arrays.asList(new String[]{"10","107","17"}),"17");

        chapter54 = new Chapter(4,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5)You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");

        chapter55 = new Chapter(5,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5) To divide (and conquer) you can use '/'. ",false , "0.5" ,
                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");

        chapter56 = new Chapter(6,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5) Like on a calculator, parentheses can be used to prioritize calculations.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter6%2Fchapter6_code.html?alt=media&token=41f9618a-15b1-4b5b-81f7-8eee0ef66329",
                true ,Arrays.asList(new String[]{"9","6","7"}),"9");

        chapter57 = new Chapter(7,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5)","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter7%2Fchapter7_code.html?alt=media&token=53d84b09-6b7c-4229-bdb2-c17071344216",
                true,Arrays.asList(new String[]{"9","6","7"}),"7" );

        chapter58 = new Chapter(8,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5) Python ignores lines starting with a '#', so they can be used to add notes or comments to the code.",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter8%2Fchapter8_code.html?alt=media&token=eaf460ef-f4e0-4ef8-8bb4-d7e2b3653d96",
                true,Arrays.asList(new String[] {"# Adding 3 and 5 equals 8 \n8","Adding 3 and 5 equals 8 \n8","8"}),"8");

        chapter59 = new Chapter(9,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5) A '#' can also be used in the middle of a line. In this case Python ignores everything on the line after the '#'",
                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter9%2Fchapter9_code.html?alt=media&token=3e6cd1dc-7db0-43cf-a774-888f27ebf8cf",
                true, Arrays.asList(new String[]{"42 \n2","42","2"}),"42 \n2");

        chapter510 = new Chapter(10,new Tuple("Scripting And Web Scripting",5),"(Scripting And Web Scripting - lvl 5) ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter10%2Fchapter10_code.html?alt=media&token=9aacb2ca-b7e2-4eb8-9579-aacf4467b0bc",
                true,Arrays.asList(new String[]{"17","10","27"}),"17");

        chapters5.add(chapter51);
        chapters5.add(chapter52);
        chapters5.add(chapter53);
        chapters5.add(chapter54);
        chapters5.add(chapter55);
        chapters5.add(chapter56);
        chapters5.add(chapter57);
        chapters5.add(chapter58);
        chapters5.add(chapter59);
        chapters5.add(chapter510);

        // ftiaxnw to course
        course5 = new Courses("Scripting And Web Scripting",5,"Datatypes In Python",R.drawable.py_practise_icon,chapters5);
        DataHelper.uploadCourse(course5);
    }
}
