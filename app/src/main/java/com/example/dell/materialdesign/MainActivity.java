package com.example.dell.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone,password;
    Button save;
    Spinner country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.et1);
        email=(EditText)findViewById(R.id.et2);
        phone=(EditText)findViewById(R.id.et3);
        password=(EditText)findViewById(R.id.et4);
        save=(Button)findViewById(R.id.btn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Second.class);
                String n=name.getText().toString();
                String e=email.getText().toString();
                String ph=phone.getText().toString();
                String p=password.getText().toString();

                i.putExtra("name",n);
                i.putExtra("email",e);

                i.putExtra("phone",ph);

                i.putExtra("password",p);


                startActivity(i);
            }
        });


        name.setText(getIntent().getStringExtra("na"));
        email.setText(getIntent().getStringExtra("em"));

        phone.setText(getIntent().getStringExtra("ph"));
        password.setText(getIntent().getStringExtra("pas"));

    }
}
