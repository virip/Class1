package com.example.developer.class1.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.developer.class1.R;
import com.example.developer.class1.activities.ScrollingActivity;

/**
 * Created by developer on 3/12/16.
 */
public class Fragment1 extends Fragment{
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup root, Bundle savedInstanceState){
        View rootView = layoutInflater.inflate(R.layout.activity_main, root, false);
        TextView txt;
        txt = (TextView)rootView.findViewById(R.id.txt1);
        txt.setText(getArguments().getString("texto"));
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ScrollingActivity.class);
                startActivity(intent);

            }
        });

        return rootView;
    }
}
