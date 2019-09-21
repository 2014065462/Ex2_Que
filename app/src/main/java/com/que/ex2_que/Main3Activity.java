package com.que.ex2_que;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText ets1, ets2, ets3, ets4, ets5, ets6, ets7, ets8;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ets1 = findViewById(R.id.et_s1);
        ets2 = findViewById(R.id.et_s2);
        ets3 = findViewById(R.id.et_s3);
        ets4 = findViewById(R.id.et_s4);
        ets5 = findViewById(R.id.et_s5);
        ets6 = findViewById(R.id.et_s6);
        ets7 = findViewById(R.id.et_s7);
        ets8 = findViewById(R.id.et_s8);
    }
    public void validateData(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String s1SP = sp.getString("s1", null);
        String s2SP = sp.getString("s2", null);
        String s3SP = sp.getString("s3", null);
        String s4SP = sp.getString("s4", null);
        String s5SP = sp.getString("s5", null);
        String s6SP = sp.getString("s6", null);
        String s7SP = sp.getString("s7", null);
        String s8SP = sp.getString("s8", null);
        String sc1 = ets1.getText().toString();
        String sc2 = ets2.getText().toString();
        String sc3 = ets3.getText().toString();
        String sc4 = ets4.getText().toString();
        String sc5 = ets5.getText().toString();
        String sc6 = ets6.getText().toString();
        String sc7 = ets7.getText().toString();
        String sc8 = ets8.getText().toString();
        if(s1SP.equals(sc1) || s2SP.equals(sc2) || s3SP.equals(sc3) || s4SP.equals(sc4) ||
                s5SP.equals(sc5) || s6SP.equals(sc6) || s7SP.equals(sc7) || s8SP.equals(sc8) ){
            Toast.makeText(this, "School is participating in UAAP", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "School is not participating in UAAP", Toast.LENGTH_LONG).show();
        }
    }

}
