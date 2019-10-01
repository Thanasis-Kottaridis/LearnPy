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

public class PractiseRecyclerViewAdapter extends RecyclerView.Adapter<PractiseRecyclerViewAdapter.ViewHolder> {

    // lista pou periexei ta practice test tis efarmogis
        private List<CourseCategory> mCategories;

    // listener gia to patima kapiou test
    private OnTestItemClickListener listener;

    public PractiseRecyclerViewAdapter(List<CourseCategory> mCategories) {
        this.mCategories = mCategories;
    }


    // lew sto recycle view poio tha einai to layout gia kathe item
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
        CourseCategory category = mCategories.get(i);

        holder.testTitle.setText(category.getCategoryName());
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView testTitle;
        private ImageView testImage;
        private Button testButton;

        public ViewHolder(@NonNull View view) {
            super(view);

            testTitle = view.findViewById(R.id.practice_test_title);
            testImage = view.findViewById(R.id.practice_test_image);
            testButton = view.findViewById(R.id.start_practicing_button);

            // event sto onclick tou item
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION) {
                        listener.onTestItemClick(mCategories.get(pos));
                    }
                }
            });

            testButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION) {
                        listener.onTestItemClick(mCategories.get(pos));
                    }
                }
            });

        }
    }

    //setter gia ta mPractiseTests
    public void setmCategories(List<CourseCategory> mCategories) {
        this.mCategories= mCategories;
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnTestItemClickListener{
        void onTestItemClick(CourseCategory mCategoris);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnTestItemClickListener(OnTestItemClickListener listener){
        this.listener = listener;
    }
}
