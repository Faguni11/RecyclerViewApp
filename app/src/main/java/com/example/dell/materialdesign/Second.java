package com.example.dell.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


public class Second extends AppCompatActivity {
Button editBtn;

RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_example);


        final Intent i=getIntent();
        final String name1=i.getStringExtra("name");
        final String email1=i.getStringExtra("email");
        final String phone1=i.getStringExtra("phone");
        final String password1=i.getStringExtra("password");
        editBtn=(Button)findViewById(R.id.edit);

        ItemData itemData[]={
                new ItemData(name1,email1,phone1,password1)




        };


        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Second.this,MainActivity.class);
                intent.putExtra("na",name1);
                intent.putExtra("em",email1);
                intent.putExtra("ph",phone1);
                intent.putExtra("pas",password1);
                startActivity(intent);
            }
        });

        rv=(RecyclerView)findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //rv.setLayoutManager(new RecyclerView.LayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(itemData);

        rv.setAdapter(myAdapter);
        rv.setItemAnimator(new DefaultItemAnimator());




    }
}
