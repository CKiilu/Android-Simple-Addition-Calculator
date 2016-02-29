package com.scurrae.chris.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        final TextView t2 = (TextView)findViewById(R.id.textView);
        final int num1 = Integer.parseInt(e1.getText().toString());
        final int num2 = Integer.parseInt(e2.getText().toString());
        Button b1 = (Button)findViewById(R.id.button);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                int sum = num1 + num2;
                t2.setText(String.valueOf(sum));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int sum = num1 - num2;
                t2.setText(String.valueOf(sum));
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                int sum = num1 * num2;
                t2.setText(String.valueOf(sum));
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                int sum = (num1 / num2);
                t2.setText(String.valueOf(sum));
            }
        });
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
}
