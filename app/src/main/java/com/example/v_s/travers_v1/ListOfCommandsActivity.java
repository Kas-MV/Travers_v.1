package com.example.v_s.travers_v1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ListOfCommandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofcommands);
    }


    public void listFines(View view) {
        Intent intObj = new Intent(this, FinesActivity.class);
        startActivity(intObj);
    }
}
