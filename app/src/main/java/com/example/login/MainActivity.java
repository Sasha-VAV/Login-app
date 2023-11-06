package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2;
    public TextView res;
    public Button butt;
    private static final String login="corgi",password="top";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt=(Button)findViewById(R.id.button);
        EditText e1=(EditText)findViewById(R.id.ed1);
        EditText e2=(EditText)findViewById(R.id.ed2);
        TextView res=(TextView)findViewById(R.id.tx);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if (s1.equals(login) && s2.equals(password)){
                    res.setTextColor(Color.parseColor("#00FF00"));
                    res.setText("Верно");
                }
                else{
                    res.setTextColor(Color.parseColor("#FF0000"));
                    res.setText("Вы ошиблись в логине или пароле");
                }
                e1.getText().clear();
                e2.getText().clear();
            }
        });
    }
}