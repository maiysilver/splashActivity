package com.example.quizactivity;

import androidx.annotation.RequiresApi;
import android.os.Build;
import android.os.Bundle;

public class QuizHelpActivity extends QuizActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
}
