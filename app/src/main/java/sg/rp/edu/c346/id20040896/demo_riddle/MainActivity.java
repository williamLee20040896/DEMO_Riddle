package sg.rp.edu.c346.id20040896.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    Button btnReveal1;
    TextView tvQ2;
    Button btnReveal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvQ1 = findViewById(R.id.TextViewQ1);
        btnReveal1 = findViewById(R.id.buttonReveal1);
        tvQ2 = findViewById(R.id.TextViewQ2);
        btnReveal2 = findViewById(R.id.buttonReveal2);

        btnReveal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });
        btnReveal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent((MainActivity.this), AnswerActivity2.class);
                intent2.putExtra("Question 2", "Q2");
                startActivity(intent2);

            }
        });
    }
}