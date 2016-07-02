package com.psj.user.myapp160701;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonCalc extends Activity implements View.OnClickListener{
   EditText ed1,ed2;
    Button btnadd, btnmin, btnmul,btndivide, btnhome;
    TextView tvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_button);
        btnadd = (Button) findViewById(R.id.btnadd);
        btndivide = (Button) findViewById(R.id.btndivide);
        btnmin   = (Button) findViewById(R.id.btnmin);
        btnmul = (Button) findViewById(R.id.btnmul);
        btnhome = (Button) findViewById(R.id.btnhome);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        tvFinal = (TextView) findViewById(R.id.tvFinal);

        btnhome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnhome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
