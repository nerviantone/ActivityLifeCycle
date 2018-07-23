package com.example.nervian.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewState = (TextView)findViewById(R.id.textViewState);
        mTextViewState.setText("oncreate()\n");

    }

    @Override
    protected  void onStart() {
        super.onStart();;
        mTextViewState.append("onStart()\n");
    }

    @Override
    protected void onResume(){
        super.onResume();
        mTextViewState.append("onResume()\n");
    }

    @Override
    protected void onPause(){
        super.onPause();
        mTextViewState.append("onPause()\n");
        if(isFinishing()){
            mTextViewState.append("...is finishing");
        }
    }

    @Override
    protected  void onStop(){
        super.onStop();
        mTextViewState.append("onStop()\n");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        mTextViewState.append("onRestart()\n");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mTextViewState.append("onDestroy()\n");
    }
}
