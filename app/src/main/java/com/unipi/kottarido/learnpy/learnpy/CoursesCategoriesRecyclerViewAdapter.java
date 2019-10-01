package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CoursesCategoriesRecyclerViewAdapter extends RecyclerView.Adapter<CoursesCategoriesRecyclerViewAdapter.ViewHolder> {

    // lista pou periexei tis courses tis efarmogis
    private List<CourseCategory> mCourseCategories;
    private Context context;

    // listener gia to patima kapias enotitas
    private OnItemClickListener listener;

    //constructor tou adapter
    public CoursesCategoriesRecyclerViewAdapter(Context context, List<CourseCategory> mCourseCategories) {
        this.context = context;
        this.mCourseCategories = mCourseCategories;
    }


    @NonNull// lew sto recycle view poio tha einai to layout gia kathe item
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.courses_recyclerview_item , viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        // vriskw poio item thelw na provalw
        CourseCategory category = mCourseCategories.get(i);

        holder.courseTitle.setText(category.getCategoryName());
        //metatrepei to url apo string se eikona meso tou glide
        Glide.with(context)
                .asBitmap()
                .load(mCourseCategories.get(i).getCategoryIconURL())
                .into(holder.courseCategoryTumbnail);
    }

    @Override
    public int getItemCount() {
        return mCourseCategories.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView courseTitle;
        private ImageView courseCategoryTumbnail;

        public ViewHolder(@NonNull View view) {
            super(view);

            courseTitle = view.findViewById(R.id.course_title);
            courseCategoryTumbnail = view.findViewById(R.id.course_thumbnail);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION){
                        listener.onItemClick(mCourseCategories.get(pos));
                    }
                }
            });
        }
    }

    public void setmCourses(List<CourseCategory> mCourseCategories) {
        this.mCourseCategories = mCourseCategories;
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnItemClickListener{
        void onItemClick(CourseCategory category);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }
}

