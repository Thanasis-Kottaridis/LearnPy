package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SetUpProfileCategoryAdapter extends RecyclerView.Adapter<SetUpProfileCategoryAdapter.SetUpCategoryHolder> {


    private UserCategories[] userCategories;

    //o listener tou interface
    private OnItemClickListener listener;

    // constructor tis class
    public  SetUpProfileCategoryAdapter(UserCategories[] userCategories){
        this.userCategories= userCategories;
    }

    //setter tou my song
    public void setUserCategories(UserCategories[] userCategories) {
        this.userCategories = userCategories;
    }

    @NonNull
    @Override
    public SetUpCategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // vriskw to view tou item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.set_up_user_category_item, viewGroup, false);
        return new SetUpCategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetUpCategoryHolder holder, int i) {
        UserCategories category = userCategories[i];
        holder.setUpCategoryImage.setImageResource(category.getImage());
        holder.setUpCategoryHeading.setText(category.getTitle());
        holder.setUpCategoryDescription.setText(category.getDescription());

        if (category.isSelected()){
            holder.CheckCategory.setImageResource(R.drawable.ic_check_circle_selected);
        }
        else {
            holder.CheckCategory.setImageResource(R.drawable.ic_check_circle);
        }
    }

    @Override
    public int getItemCount() {
        return userCategories.length;
    }

    class SetUpCategoryHolder extends RecyclerView.ViewHolder{
        private ImageView setUpCategoryImage;
        private ImageView CheckCategory;
        private TextView setUpCategoryHeading;
        private TextView setUpCategoryDescription;


        public SetUpCategoryHolder(@NonNull View view) {
            super(view);

            setUpCategoryImage = view.findViewById(R.id.setUpCategoryImage);
            CheckCategory = view.findViewById(R.id.CheckCategory);
            setUpCategoryHeading = view.findViewById(R.id.setUpCategoryHeading);
            setUpCategoryDescription = view.findViewById(R.id.setUpCategoryDescription);

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
