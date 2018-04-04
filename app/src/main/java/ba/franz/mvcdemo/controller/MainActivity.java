package ba.franz.mvcdemo.controller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ba.franz.mvcdemo.R;
import ba.franz.mvcdemo.model.People;

public class MainActivity extends AppCompatActivity {


    //Use our model-code
    People person = new People();

    //What will happen when activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define text-boxes
        final EditText editText_name = findViewById(R.id.namebox);
        final EditText editText_age = findViewById(R.id.agebox );


        //Define first Button
        final Button button_one = findViewById(R.id.trigger1);


        //Inline onclickListener
        button_one.setOnClickListener(v -> {

            //use our model-code
            person.setName(editText_name.getText().toString());
            person.setAge(Integer.valueOf(editText_age.getText().toString()));

        });


        //define 2 lower buttons with global listener
        findViewById(R.id.Int1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.Int2).setOnClickListener(mGlobal_OnClickListener);

    }


    //Global On-click-listener for the lower buttons
    private final View.OnClickListener mGlobal_OnClickListener = v -> {
        switch(v.getId()) {

            case R.id.Int1:
                //Our call-intent

                //Call intent
                final Intent intent_one = new Intent(Intent.ACTION_DIAL);
                intent_one.setData(Uri.parse("tel:015227459120"));  //which datatype?

                if (intent_one.resolveActivity(getPackageManager()) != null) {

                    startActivity(intent_one);      //start implicit

                }

                break;

            case R.id.Int2:
                //Switch Activity Intent

                //Activity intent
                final Intent intent_two = new Intent(getApplicationContext(), SecondActivity.class);

                //put extra data to call
                intent_two.putExtra("name",person.getName());
                intent_two.putExtra("age",person.getAge().toString());

                startActivity(intent_two);      //start explicit

                break;
        }
    };
}



