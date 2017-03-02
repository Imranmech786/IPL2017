package com.ipl2017.imran.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ipl2017.imran.Model.Team;
import com.ipl2017.imran.R;
import com.ipl2017.imran.Adapter.TeamAdapter;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {

    private final String android_version_names[] = {
            "Mumbai Indians",
            "RSP",
            "Gujarat Lions",
            "RCB",
            "KKR",
            "Delhi Dardevils",
            "KXIP",
            "SRH",

    };

    private final int android_image_urls[] = {
            R.drawable.mumind1, R.drawable.pune1, R.drawable.gujarat1,
            R.drawable.bangaluru, R.drawable.kolkataknightriders1, R.drawable.dd, R.drawable.punjab1,
            R.drawable.hyderabad1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_team);
        initViews();
    }
    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Team> androidVersions = prepareData();
        TeamAdapter adapter = new TeamAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList<Team> prepareData(){

        ArrayList<Team> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            Team androidVersion = new Team();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}