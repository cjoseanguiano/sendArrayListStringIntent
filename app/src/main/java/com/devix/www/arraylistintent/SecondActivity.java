package com.devix.www.arraylistintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            ArrayList<String> arrayList1 =
                    (ArrayList<String>) bundle.getStringArrayList("arrayList");
            System.out.println(arrayList1);
        }
    }
}
