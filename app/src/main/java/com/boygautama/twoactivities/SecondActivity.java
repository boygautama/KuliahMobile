package com.boygautama.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.boygautama.twoactivities.extra.REPLY";
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    private EditText mReply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mReply = (EditText) findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.text_message);
        if (textView != null) {
            textView.setText(message);
        }
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onCreate");
    }



    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "end SecondActivity");
        finish();

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onPause() {
        super.onStart();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onRestart() {
        super.onStart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume() {
        super.onStart();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop() {
        super.onStart();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onStart();
        Log.d(LOG_TAG, "onDestroy");
    }
}