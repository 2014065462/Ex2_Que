package com.que.ex2_que;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ets1, ets2, ets3, ets4, ets5, ets6, ets7, ets8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ets1 = findViewById(R.id.et_s1);
        ets2 = findViewById(R.id.et_s2);
        ets3 = findViewById(R.id.et_s3);
        ets4 = findViewById(R.id.et_s4);
        ets5 = findViewById(R.id.et_s5);
        ets6 = findViewById(R.id.et_s6);
        ets7 = findViewById(R.id.et_s7);
        ets8 = findViewById(R.id.et_s8);
    }
    public void saveData(View v){
        //SharedPreferences sp = getApplicationContext().getSharedPreferences("data1", MODE_PRIVATE);
        //^If not yet on main activity^
        SharedPreferences sp = getSharedPreferences("data1" , MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String sc1 = ets1.getText().toString();
        String sc2 = ets2.getText().toString();
        String sc3 = ets3.getText().toString();
        String sc4 = ets4.getText().toString();
        String sc5 = ets5.getText().toString();
        String sc6 = ets6.getText().toString();
        String sc7 = ets7.getText().toString();
        String sc8 = ets8.getText().toString();
        editor.putString("s1", sc1);
        editor.putString("s2", sc2);
        editor.putString("s3", sc3);
        editor.putString("s4", sc4);
        editor.putString("s5", sc5);
        editor.putString("s6", sc6);
        editor.putString("s7", sc7);
        editor.putString("s8", sc8);
        editor.commit();
        Toast.makeText(this, "data saved in data1.xml", Toast.LENGTH_LONG).show();
    }

    public void switchActivity(View v) {
        startActivity(new Intent(this, Main3Activity.class));
    }

}

