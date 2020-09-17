
package com.tutorial.foodsapp.view.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.tutorial.foodsapp.R;
import com.tutorial.foodsapp.Utils;
import com.tutorial.foodsapp.adapter.RecyclerViewHomeAdapter;
import com.tutorial.foodsapp.adapter.ViewPagerHeaderAdapter;
import com.tutorial.foodsapp.model.Categories;
import com.tutorial.foodsapp.model.Meals;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

// TODO 31 implement the HomeView interface at the end
public class HomeActivity extends AppCompatActivity {

    /*
     * TODO 32 Add @BindView Annotation (1)
     *
     * 1. viewPagerHeader
     * 2. recyclerCategory
     *
     */

    /*
     *  TODO 33 Create variable for presenter;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*
         *  TODO 34 bind the ButterKnife (2)
         */

        /*
         *  TODO 35 Declare the presenter
         *  new HomePresenter(this)
         */
    }

    // TODO 36 Overriding the interface

}
