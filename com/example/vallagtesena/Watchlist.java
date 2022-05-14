package com.example.vallagtesena;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Watchlist extends AppCompatActivity {
    Button seriesFragment,goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchlist);
        seriesFragment=findViewById(R.id.series_frag);

        seriesFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Watchlist.this, series_watchlist.class);
                startActivity(i);
            }
        });
        goback=findViewById(R.id.go_back);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(Watchlist.this, homepage.class);
                startActivity(intent);
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.bottom_nav_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.home:
                Intent w = new Intent(Watchlist.this, homepage.class);
                startActivity(w);
                break;
            case R.id.suggestions:
                Intent d = new Intent(Watchlist.this, suggestions.class);
                startActivity(d);
                break;
            case R.id.nav_tv:
                Intent a = new Intent(Watchlist.this, wishlist.class);
                startActivity(a);
                break;
        }
        return super.onOptionsItemSelected(item);
    }




}

