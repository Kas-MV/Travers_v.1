package com.example.v_s.travers_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class spisokShtrafActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_shtraf);
    }

    public void shtrafScreen(View view) {
        Intent intObj = new Intent(this, shtrafActivity.class);
        startActivity(intObj);

    }
}
