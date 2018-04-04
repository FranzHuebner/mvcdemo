package ba.franz.mvcdemo.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ba.franz.mvcdemo.R;
import ba.franz.mvcdemo.model.People;

/**
 * Created by Franz on 25.03.2018.
 */

public class SecondActivity extends AppCompatActivity {


    //Make a new human :)
    People myhuman = new People();


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get the intent
        final Intent intent = getIntent();


        //Declare our textviews
        final TextView Textview = findViewById(R.id.textView);
        final TextView Textview2 = findViewById(R.id.textView2);

        //Get everything from our intent
        String name = intent.getStringExtra("name");
        String age  = intent.getStringExtra("age");

        //Use our model-code
        myhuman.setName(name);
        myhuman.setAge(Integer.valueOf(age));

        //Use the boxes
        Textview.setText(myhuman.getName());
        Textview2.setText(myhuman.getAge().toString());

    }
}