package com.example.administrator.mgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddQRManually extends AppCompatActivity {

    private Button fa;
    private EditText qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_qrmanually);


        onClickButtonListener();
    }

    public void onClickButtonListener(){

        fa = (Button) findViewById(R.id.button3);
        fa.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){

                        qr = (EditText) findViewById(R.id.editText2) ;
                        String qrs = qr.getText().toString();
                        Intent i = new Intent("com.example.administrator.mgo.ViewInfo");
                        i.putExtra("scanned", qrs);
                        startActivity(i);
                    }
                }
        );

    }
}
