package com.example.asstwo;




import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class lowerbody extends AppCompatActivity {
    TextView check;
    static int result=5;
    private Button btn;
    RadioButton p1;

    RadioButton p2;
    RadioButton p3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lowerbody);
        check = findViewById(R.id.check);
        p1=findViewById(R.id.hand1);
        p2=findViewById(R.id.arm1);
        p3=findViewById(R.id.leg1);
        btn=findViewById(R.id.next_button);






    }

    public void checkResult(View view) {

        int counter=1;
        check.setVisibility(View.VISIBLE);
        if(!p1.isChecked()){
            counter-=1;
            check.setText("false");
        }
        else{
            counter=1;
            check.setText("true!");
        }


       /* else{
            check.setVisibility(View.VISIBLE);
            check.setText("the result is : " + counter+ " \n " + "question1 is :"+"arms" +"\n"+" question2 is : " + "head "+"\n" + "question3 is : " + "hand"+  "\n"+" question4 is : " + "leg"+"\n"+"question5 is :"+"face"+"\n"+"question6 is :"+ "feet" );
        }*/

    }

}
