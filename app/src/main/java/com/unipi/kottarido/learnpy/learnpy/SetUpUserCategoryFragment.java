package com.unipi.kottarido.learnpy.learnpy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SetUpUserCategoryFragment extends Fragment {

    //antikimeno sindedemenou xristi
    private User user;

    // array me tis katigories xriston tis efarmogis
    private UserCategories[] userCategories;

    //gia to recycle view
    private RecyclerView setUpCategoryView;
    private RecyclerView.Adapter setUpCategoryAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.set_up_profile_category_fragment,container,false);

        //fortonei apo SP ton user pou einai sindedemenos
        user = DataHelper.loadUserProfileFromSP(getActivity());

        // dimiougei ta antikimena ton katigoriwn!
        userCategories = new UserCategories[4];
        userCategories[0] = new UserCategories(R.drawable.student,"Student","You learning for educational purposes in order to get more familiar with python",true);
        userCategories[1] = new UserCategories(R.drawable.teacher,"Teacher","Your purpose is to gide students and amateurs in order to learn and improve their python skils",false);
        userCategories[2] = new UserCategories(R.drawable.professional,"Professional Developer","You are an advanced python developer who loves learning and helping otherd to solve their programing problems",false);
        userCategories[3] = new UserCategories(R.drawable.amateur,"Amateur Developer","Programing is your hobby so you learning python just for fun!",false);

        // vriskoume ta view
        setUpCategoryView = view.findViewById(R.id.set_up_user_category);


        //kanoume desplay ta chat items sto Recycle view!

        mlayoutManager = new LinearLayoutManager(getActivity());
        setUpCategoryView.setLayoutManager(mlayoutManager);

        //ftiaxnoume instance tou adapter pou dimiourgisame
        // kai pername auton ton adater sto view
        //me auton ton tropo tou leme pos na xiristi ta items
        setUpCategoryAdapter = new SetUpProfileCategoryAdapter(userCategories);
        setUpCategoryView.setAdapter(setUpCategoryAdapter);

        //on Recycle view item click event einai to interface pou ftia3ame ston adapter
        //to xirizomaste opos xirizomaste kai ta apla onclick event
        ((SetUpProfileCategoryAdapter)setUpCategoryAdapter).setOnItemClickListener(new SetUpProfileCategoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                for( int i = 0; i < userCategories.length;i++)
                    userCategories[i].setSelected(false);

                userCategories[pos].setSelected(true);
                //stelnei sto setupActivity to category pou epele3e o user
                ((SetUpProfileActivity)getActivity()).setUserCategory(userCategories[pos]);
                //show dialog
                ((SetUpProfileCategoryAdapter)setUpCategoryAdapter).setUserCategories(userCategories);
                setUpCategoryView.setAdapter(setUpCategoryAdapter);
            }
        });
        return view;
    }
}
