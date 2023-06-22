package com.example.asstwo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class RecycleView extends AppCompatActivity {
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        sp=findViewById(R.id.subject);
        RecyclerView recycler = findViewById(R.id.recycle);

        String[] captions = new String[Subject.subject.length];
        int[] ids = new int[Subject.subject.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Subject.subject[i].getName();
            ids[i] = Subject.subject[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adabter adapter = new Adabter(captions, ids);
        recycler.setAdapter(adapter);
    }


    public void btnToSUbject(View view){
        String statment=sp.getSelectedItem().toString();
        if(statment.equals("headbody")){
            Intent intent=new Intent(this, headbody.class);
            startActivity(intent);
        }

        else if(statment.equals("upperbody")){
            Intent intent=new Intent(this, upperbody.class);
            startActivity(intent);
        }

        else if(statment.equals("lowerbody")){
            Intent intent=new Intent(this, lowerbody.class);
            startActivity(intent);
        }

    }
}

