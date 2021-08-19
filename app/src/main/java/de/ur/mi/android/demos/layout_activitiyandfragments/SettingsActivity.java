package de.ur.mi.android.demos.layout_activitiyandfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    private Button language;
    private Button weight;
    private Button height;
    private Button gender;
    public BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initButtons();
        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.navigation_settings);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_run:
                startActivity(new Intent (getApplicationContext(), MainActivity.class));
                overridePendingTransition(0,0);
                return true;
            case R.id.navigation_analytics:
                return true;
            case R.id.navigation_settings:
                return true;
        }
        return false;
    }

    private void initButtons(){
        language = (Button) findViewById(R.id.language);
        language.setOnClickListener(this);
        weight = (Button)findViewById(R.id.weight);
        weight.setOnClickListener(this);
        height = (Button)findViewById(R.id.height);
        height.setOnClickListener(this);
        gender = (Button)findViewById(R.id.gender);
        gender.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        if(v.getId() == R.id.language){
            startActivity(i);
        }
        else if(v.getId() == R.id.weight){

        }
        else if(v.getId() == R.id.height){

        }
        else if(v.getId() == R.id.gender){

        }
    }
}