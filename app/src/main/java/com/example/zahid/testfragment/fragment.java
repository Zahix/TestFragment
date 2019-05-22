package com.example.zahid.testfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zahid on 23/05/2019.
 */

public class fragment extends Fragment {

    View view;

    EditText editText ;
    Button button;
    MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment,container,false);


        return view;
    }

    @Override
    public void onResume() {

        mainActivity = new MainActivity();


        editText = (EditText)view.findViewById(R.id.etText);
        button = (Button)view.findViewById(R.id.submit_BT);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 mainActivity.getfragmentData(editText.getText().toString());
                //mainActivity.textView.setText(editText.getText().toString());
            }
        });
        super.onResume();



    }
}
