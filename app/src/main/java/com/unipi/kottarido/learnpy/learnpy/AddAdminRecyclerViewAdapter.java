package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AddAdminRecyclerViewAdapter extends RecyclerView.Adapter<AddAdminRecyclerViewAdapter.ViewHolder> {

    private List<User> users;

    // listener gia to patima kapiou user
    private OnItemClickListener listener;

    // constructor tis class


    public AddAdminRecyclerViewAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.add_admin_recycler_view_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        User user = users.get(i);
        holder.UserEmail.setText("Email: "+ user.getEmail());
        holder.UserType.setText("User Type: "+ user.getUserType().getTitle());
        holder.UserScore.setText("Score: "+user.getProfileScore());


    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView UserEmail;
        private TextView UserType;
        private TextView UserScore;

        public ViewHolder(@NonNull View view) {
            super(view);

            UserEmail = itemView.findViewById(R.id.UserEmailTextView);
            UserType = itemView.findViewById(R.id.UserTypeTextView);
            UserScore = itemView.findViewById(R.id.UserScoreTextView);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (listener != null && pos != RecyclerView.NO_POSITION) {
                        listener.onItemClick(users.get(pos));
                    }
                }
            });
        }
    }

    // setter gia tous users

    public void setUsers(List<User> users) {
        this.users = users;
    }

    //gia na ftia3oume event sto onClick tou kathe item tou recycle view
    //prepei na ftia3oume enan listener(interface)

    public interface OnItemClickListener{
        void onItemClick(User user);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }
}
