package com.example.idenditycard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<People> peopleList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        buildRecyclerViewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        PeopleAdapter peopleAdapter = new PeopleAdapter(peopleList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(peopleAdapter);


    }

    private void buildRecyclerViewData() {
        peopleList =new ArrayList<>();
        peopleList.add(new People("Microsoft",R.drawable.bill,"Age : 64","Profession : Business"));
        peopleList.add(new People("Amazon",R.drawable.jezz,"Age : 56","Profession : Business"));
        peopleList.add(new People("Masai School",R.drawable.prateek,"Age : 31","Profession : Business"));
        peopleList.add(new People("chairman of Tata Sons",R.drawable.ratan,"Age : 83","Profession : Business"));
        peopleList.add(new People("WIPRO",R.drawable.ajizprem,"Age : 75","Profession : Business"));
        peopleList.add(new People("Berkshire Hathaway",R.drawable.warren,"Age : 90","Profession : Business"));
        peopleList.add(new People("CEO, Facebook",R.drawable.markzuckerberg,"Age : 37","Profession : Business"));
        peopleList.add(new People("Founder Oracle",R.drawable.larry,"Age : 76","Profession : Business"));
        peopleList.add(new People("CEO of SpaceX",R.drawable.elonmusk,"Age : 50","Profession : Business"));
        peopleList.add(new People("Co-founder Google",R.drawable.sergeybrin,"Age : 47","Profession : Business"));

    }
}