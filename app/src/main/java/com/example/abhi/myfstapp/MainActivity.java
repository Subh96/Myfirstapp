package com.example.abhi.myfstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bk(View v)
    {

        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ed2= (EditText) findViewById(R.id.editText1);
        CheckBox cb= (CheckBox) findViewById(R.id.checkBox);
        //Button b= (Button) findViewById(R.id.button);
        TextView t= (TextView) findViewById(R.id.tv);

        if(cb.isChecked()){
            int s=Integer.parseInt(ed1.getText().toString());
            int s1=Integer.parseInt(ed2.getText().toString());
            int s3=s+s1;
            String rep="Value Of the Adddition is="+s3;
        Toast.makeText(getApplicationContext(),rep,Toast.LENGTH_SHORT).show();
            t.setText(rep);
        }

        else{
            int s=Integer.parseInt(ed1.getText().toString());
            int s1=Integer.parseInt(ed2.getText().toString());
            int s3=s-s1;
            String rep="Value Of the Substraction is="+s3;
            Toast.makeText(getApplicationContext(),rep,Toast.LENGTH_SHORT).show();

            t.setText(rep);
        }
    }

    public void nintent(View v1){
        Intent in=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(in);
    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this).setTitle("Exit").setMessage("You are Surely Wanted to exit").setNegativeButton("No",null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
    }
}
