package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UpdateTodaysChallRVAdapter extends RecyclerView.Adapter<UpdateTodaysChallRVAdapter.ViewHolder> {

    private List<Courses> courses;

    // listener gia to patima kapias enotitas
    private OnItemClickListener listener;

        public UpdateTodaysChallRVAdapter(List<Courses> courses) {
        this.courses = courses;
    }

    public void setCources(List<Courses> cources) {
        this.courses = cources;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.update_todays_chall_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
            Courses course = courses.get(i);
            holder.CourseThumbnail.setImageResource(course.getThumbnail());
            holder.CourseTitle.setText(course.getTitle());
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView CourseThumbnail;
        private TextView CourseTitle;

        public ViewHolder(@NonNull View view) {
            super(view);

            CourseThumbnail = itemView.findViewById(R.id.course_thumbnail_update_tc_item);
            CourseTitle = itemView.findViewById(R.id.course_title_update_tc_item);

            // sto patima tou view
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION){
                        listener.onItemClick(courses.get(pos));
                    }
                }
            });

        }
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnItemClickListener{
        void onItemClick(Courses course);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

}
