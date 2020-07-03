package com.example.inputcontroltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,numb,pass,mail;
    TextView txt;
    RadioButton mal,femal;
    CheckBox jav,c,pyt;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et);
        numb=findViewById(R.id.num);
        pass=findViewById(R.id.password);
        mail=findViewById(R.id.email);
        txt=findViewById(R.id.tv);
    }
    public void submit(View view){
        String et = name.getText().toString();
        String num =numb.getText().toString();
        String email = mail.getText().toString();
        String password =pass.getText().toString();

        txt.setText(name+"\n"+numb+"\n"+mail+"\n"+pass);
    }
}