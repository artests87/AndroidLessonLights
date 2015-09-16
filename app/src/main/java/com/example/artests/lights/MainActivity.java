package com.example.artests.lights;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout mRelativeLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        mTextView=(TextView)findViewById(R.id.textView);
        Button buttonRed = (Button) findViewById(R.id.buttonRed);
        Button buttonYellow = (Button) findViewById(R.id.buttonYellow);
        Button buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonRed.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRed:
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));
                mTextView.setText(R.string.buttonRed);
                break;
            case R.id.buttonYellow:
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.yellowColor));
                mTextView.setText(R.string.buttonYellow);
                break;
            case R.id.buttonGreen:
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                mTextView.setText(R.string.buttonGreen);
                break;
        }
    }
}
