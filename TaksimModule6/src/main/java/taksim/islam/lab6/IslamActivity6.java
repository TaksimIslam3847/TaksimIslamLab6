package taksim.islam.lab6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class IslamActivity6 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    TaksimFragment taksimFragment = new TaksimFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.person:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
                return true;
            case R.id.taksim:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, taksimFragment).commit();
                return true;
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, secondFragment).commit();
                return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, thirdFragment).commit();
                return true;
        }
        return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void toast(View view) {
        progressBar = findViewById(R.id.progressBar);
        int counter=0;
        int z = (counter+1);
        if (counter == 1){
            Toast.makeText(this,"Taksim"+z,Toast.LENGTH_SHORT).show();
            counter++;
        }
        else if (counter == 2){
            Toast.makeText(this,"Taksim"+z,Toast.LENGTH_SHORT).show();
            counter++;
        }else if (counter == 3){
            Toast.makeText(this,"Taksim"+z,Toast.LENGTH_SHORT).show();
            counter++;
        }
        else if (counter == 4){
            Toast.makeText(this,"Taksim"+z,Toast.LENGTH_SHORT).show();
            counter++;
        }
        else if (counter == 5){
            progressBar.setVisibility(View.GONE);
            counter++;
        } else if (counter == 6) {
            counter++;
        } else if (counter == 7) {
            counter++;
        } else if (counter ==8) {
                System.exit(0);
        }
    }
}