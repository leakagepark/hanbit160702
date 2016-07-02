package com.psj.user.myapp160701;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends Activity implements View.OnClickListener {
    Button btnhome2;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnhome2:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }

    public CalendarActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        btnhome2 = (Button) findViewById(R.id.btnhome2);
        btnhome2.setOnClickListener(this);

    }
}
