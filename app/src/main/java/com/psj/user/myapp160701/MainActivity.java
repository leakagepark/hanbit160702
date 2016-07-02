package com.psj.user.myapp160701;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  implements View.OnClickListener{
   Button btn1, btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
       }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                 this.startActivity(new Intent(this,ButtonCalc.class));
                break;
            case R.id.btn2:
                 this.startActivity(new Intent(this,CalendarActivity.class));
                break;
            case R.id.btn3:
                this.startActivity(new Intent(this,ImageActivity.class));
                break;
        }
    }
}
