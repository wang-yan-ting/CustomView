package com.sample.j.namecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sample.j.lib.NameCard;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private NameCard mNameCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameCard = (NameCard) findViewById(R.id.nc_tom);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_info:
                mNameCard.setName("Mary King");
                mNameCard.setTitle("QA Engineer");
                mNameCard.setPhoto(getResources()
                        .getDrawable(R.drawable.ic_person_outline_black_36dp));
                break;
            default:
                break;
        }
    }
}
