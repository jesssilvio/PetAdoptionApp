package com.example.petadoptionapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

public class DogActivity extends AppCompatActivity {
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);


    }
}