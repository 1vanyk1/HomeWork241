package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    public void run(View v) {
        EditText etA = findViewById(R.id.a);
        double a = Double.parseDouble(etA.getText().toString());
        EditText etB = findViewById(R.id.b);
        double b = Double.parseDouble(etB.getText().toString());
        EditText etC = findViewById(R.id.c);
        double c = Double.parseDouble(etC.getText().toString());
        double d = b * b - 4 * a * c;
        String res = "None";
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    res = "Any";
                }
            } else {
                res = Double.toString(-c / b);
            }
        } else if (d > 0) {
            res = Double.toString((-b - Math.sqrt(d)) / 2 / a) + " " + Double.toString((-b + Math.sqrt(d)) / 2 / a);
        } else if (d == 0) {
            res = Double.toString(-b / 2 / a);
        }
        TextView tvRes = findViewById(R.id.res);
        tvRes.setText(res);
    }

}
