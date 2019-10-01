package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CoursesRecyclerViewAdapter extends RecyclerView.Adapter<CoursesRecyclerViewAdapter.ViewHolder> {
    //user category level
    private int userCategoryLevel;

    // lista pou periexei ta courses tis katigorias
    private List<Courses> mCourses;

    // listener gia to patima kapiou test
    private OnTestItemClickListener listener;

    // constructor

    public CoursesRecyclerViewAdapter(List<Courses> mCourses, int userCategoryLevel) {
        this.mCourses = mCourses;
        this.userCategoryLevel = userCategoryLevel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.practise_test_recyclerview_item , viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        // vriskw poio item thelw na provalw
        Courses course = mCourses.get(i);

        holder.courseTitle.setText(course.getTitle());
        // if user level is lower tha the course level
        // puts in course the lock icon
        if(course.getLevel() > userCategoryLevel)
            holder.courseImage.setImageResource(R.drawable.lock_icon);
        else
            holder.courseImage.setImageResource(R.drawable.py_practise_icon);
    }

    @Override
    public int getItemCount() {
        return mCourses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView courseTitle;
        private ImageView courseImage;
        private Button courseButton;

        public ViewHolder(@NonNull View view) {
            super(view);

            courseTitle = view.findViewById(R.id.practice_test_title);
            courseImage = view.findViewById(R.id.practice_test_image);
            courseButton = view.findViewById(R.id.start_practicing_button);

            // event sto onclick tou item
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION) {
                        listener.onTestItemClick(mCourses.get(pos));
                    }
                }
            });

            courseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION) {
                        listener.onTestItemClick(mCourses.get(pos));
                    }
                }
            });

        }
    }

    // SETTER GIA TA COURSES
    public void setmCourses(List<Courses> mCourses) {
        this.mCourses = mCourses;
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnTestItemClickListener{
        void onTestItemClick(Courses mCourse);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnTestItemClickListener(OnTestItemClickListener listener){
        this.listener = listener;
    }
}
