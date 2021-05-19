package sg.rp.edu.c346.id20040896.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvAnswer = findViewById(R.id.textView);
        //tvAnswer.setText("Queue");
        Intent intentReceived = getIntent();
        String questionSelected = ((Intent) intentReceived).getStringExtra("Question");
        tvAnswer.setText(questionSelected + "Answer is Queue");

    }
}