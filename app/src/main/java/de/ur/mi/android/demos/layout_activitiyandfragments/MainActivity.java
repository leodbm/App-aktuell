package de.ur.mi.android.demos.layout_activitiyandfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    public BottomNavigationView bottomNav;
    public Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.navigation_run);
        initButton();

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.navigation_settings){
            Intent i = new Intent (this, SettingsActivity.class);
            startActivity(i);
            return true;
        }
        else if (item.getItemId() == R.id.navigation_analytics){
            Intent i = new Intent (this, TrackActivity.class);
            startActivity(i);
            return true;
        }
        return false;
    }
    public void initButton(){
        start = findViewById(R.id.start);
        start.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        start.setText(R.string.stopp);

    }
}



