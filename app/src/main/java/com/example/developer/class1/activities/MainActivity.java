package com.example.developer.class1.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.developer.class1.R;
import com.example.developer.class1.fragments.Fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        if(savedInstanceState==null){
            Fragment1 f1 = new Fragment1();
            Fragment1 f2 = new Fragment1();
            Fragment1 f3 = new Fragment1();
            Bundle args1 = new Bundle();
            Bundle args2 = new Bundle();
            Bundle args3 = new Bundle();
            args1.putString("texto","Hola");
            args2.putString("texto","Bye");
            args3.putString("texto","el agua de coco NO es la mejor");
            f1.setArguments(args1);
            f2.setArguments(args2);
            f3.setArguments(args3);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.main_container, f1, "f1")
                    .add(R.id.main_container, f2, "f2")
                    .add(R.id.main_container, f3, "f3")
                    .commit();
        }
    }
}
