package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class SetUpUserPreferencesRecyclerViewAdapter extends RecyclerView.Adapter<SetUpUserPreferencesRecyclerViewAdapter.ViewHolder> {

    // to contect tou app
    private Context context;

    // lista pou periexei tis courses tis efarmogis
    private List<CourseCategory> mCoursesCategories;

    // listener gia to patima kapias enotitas
    private OnItemClickListener listener;

    // constructor tis class
    public SetUpUserPreferencesRecyclerViewAdapter(List<CourseCategory> mCoursesCategories, Context context) {
        this.mCoursesCategories = mCoursesCategories;
        this.context = context;
    }

    // setter gia mCourses


    public void setmCoursesCategories(List<CourseCategory> mCoursesCategories) {
        this.mCoursesCategories = mCoursesCategories;
    }

    // lew sto recycle view poio tha einai to layout gia kathe item
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.set_up_user_preferences_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        // vriskw poio item thelw na provalw
        CourseCategory courseCategory = mCoursesCategories.get(i);

        holder.courseCategoryTitle.setText(courseCategory.getCategoryName());
        //metatrepei to url apo string se eikona meso tou glide
        Glide.with(context)
                .asBitmap()
                .load(mCoursesCategories.get(i).getCategoryIconURL())
                .into(holder.courseCategoryTumbnail);
        if (courseCategory.isChecked()){
            holder.checkCourseCategory.setImageResource(R.drawable.ic_check_circle_selected);
        }
        else {
            holder.checkCourseCategory.setImageResource(R.drawable.ic_check_circle);
        }
    }

    @Override
    public int getItemCount() {
        return mCoursesCategories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView courseCategoryTitle;
        private ImageView courseCategoryTumbnail;
        private ImageView checkCourseCategory;


        public ViewHolder(@NonNull View view) {
            super(view);

            courseCategoryTitle = view.findViewById(R.id.course_category_title);
            courseCategoryTumbnail = view.findViewById(R.id.course_category_thumbnail);
            checkCourseCategory = view.findViewById(R.id.course_category_check);

            // onClick event sto item
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();

                    if (listener != null && pos != RecyclerView.NO_POSITION){
                        listener.onItemClick(pos);
                    }
                }
            });
        }
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnItemClickListener{
        void onItemClick(int i);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }
}


