package com.example.fbclone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.fbclone.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;
    NavHostFragment navHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
        NavController navController = navHostFragment.getNavController();


        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if(itemId == R.id.navigation_home){
                navController.navigate(R.id.navigation_home);
            }else if (itemId == R.id.navigation_friends) {
                navController.navigate(R.id.navigation_friends);
            } else if (itemId == R.id.navigation_video) {
                navController.navigate(R.id.navigation_video);
            } else if (itemId == R.id.navigation_notification) {
                navController.navigate(R.id.navigation_notification);
            }else if (itemId == R.id.navigation_profile){
                navController.navigate(R.id.navigation_profile);
            }
            return true;
        });



    }
}