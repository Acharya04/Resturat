package com.example.resturat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.resturat.databinding.ActivityFoodStudioBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
public class FoodStudio extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Fragment fragment=null;
    FragmentManager fragmentManager=null;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityFoodStudioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFoodStudioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarFoodStudio.toolbar);
        binding.appBarFoodStudio.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager=getSupportFragmentManager();
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                fragment=new com.example.resturat.Mail();
                transaction.replace(R.id.content1,fragment);
                transaction.commit();
            }
        });
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        fragment=new com.example.resturat.Home();
        transaction.replace(R.id.content1,fragment);
        transaction.commit();


        DrawerLayout drawer = binding.drawerLayout;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, binding.appBarFoodStudio.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void onBackPressed() {
        super.onBackPressed();
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        fragment=new Home();
        transaction.replace(R.id.content1,fragment);
        transaction.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.food_studio, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_food_studio);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public boolean onNavigationItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            fragment=new Home();

        }
        else if(id==R.id.nav_gallery)
        {
            fragment=new MainCourse();
        }
        else if(id==R.id.nav_about)
        {
            fragment=new About_us();
        }
        else if(id==R.id.nav_Contact)
        {
            fragment=new Contact();
        }
        else if(id==R.id.nav_tools)
        {
            fragment=new Ratings();
        }
        else if(id==R.id.nav_slideshow)
        {
            fragment=new Recepie();
        }
        else if(id==R.id.nav_share)
        {
            fragment=new Event();
        }
        else if(id==R.id.nav_logout)
        {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        }
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();

        transaction.replace(R.id.content1,fragment);
        transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    return true;
    }
}