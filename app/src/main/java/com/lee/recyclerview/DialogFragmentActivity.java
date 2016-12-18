package com.lee.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lee.recyclerview.fragment.GoodsDialogFragment;

/**
 * Created by Lee on 2016/12/18.
 */
public class DialogFragmentActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_fragment_activity_layout);

        Button tv_menu_1 = (Button) findViewById(R.id.tv_menu_1);
        tv_menu_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv_menu_1) {
            GoodsDialogFragment f = new GoodsDialogFragment();
            f.show(getSupportFragmentManager(), "GoodsDialogFragment");
        }
    }
}
