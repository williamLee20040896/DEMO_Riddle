package sg.rp.edu.c346.id20040896.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer = findViewById(R.id.textView2);
        //tvAnswer.setText("Queue");
        Intent intentReceived = getIntent();
        String questionSelected = ((Intent) intentReceived).getStringExtra("Question 2");
        tvAnswer.setText(questionSelected + " Answer is Gone");
    }
}