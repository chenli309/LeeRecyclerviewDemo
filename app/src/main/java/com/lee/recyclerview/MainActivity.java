package com.lee.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button tv_menu_1 = (Button) findViewById(R.id.tv_menu_1);
        Button tv_menu_2 = (Button) findViewById(R.id.tv_menu_2);
        Button tv_menu_3 = (Button) findViewById(R.id.tv_menu_3);

        tv_menu_1.setOnClickListener(this);
        tv_menu_2.setOnClickListener(this);
        tv_menu_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv_menu_1) {
            Intent intent = new Intent(this, DialogFragmentActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.tv_menu_2) {

        } else if (view.getId() == R.id.tv_menu_3) {

        }
    }
}
