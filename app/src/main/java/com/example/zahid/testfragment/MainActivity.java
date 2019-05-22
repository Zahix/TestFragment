package com.example.zahid.testfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button , submit;
    EditText editText;
    android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // textView = (TextView)findViewById(R.id.tv_main);
        button = (Button)findViewById(R.id.bt_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager = getSupportFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
                fragmentManager.beginTransaction().replace(R.id.frameLayout, new fragment()).addToBackStack(null).commit();
            }
        });






    }
    void getfragmentData(String data){
        textView = (TextView)findViewById(R.id.tv_main);
        textView.setText(data);

    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0){
            getSupportFragmentManager().popBackStack();


        }
        else {
            super.onBackPressed();

        }
    }
}
