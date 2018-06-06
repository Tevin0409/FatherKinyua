package io.walter.fatherkinyua.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import io.walter.fatherkinyua.Group.GroupActivity;
import io.walter.fatherkinyua.Home.HomeActivity;
import io.walter.fatherkinyua.Profile.ProfileActivity;
import io.walter.fatherkinyua.R;
import io.walter.fatherkinyua.Saved.SavedActivity;


import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }
    public static void enableNavigation(final Context context,BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent=new Intent(context,HomeActivity.class);
                        context.startActivity(intent);
                        break;


                    case R.id.ic_group:
                        Intent intent2 = new Intent(context, GroupActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_saved:
                        Intent intent3 = new Intent(context, SavedActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_profile:
                        Intent intent4 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent4);
                        break;}


                return false;
            }
        });

    }
}
