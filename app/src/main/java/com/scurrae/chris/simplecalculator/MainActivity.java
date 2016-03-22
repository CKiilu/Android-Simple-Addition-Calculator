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
    private int num1;
    private int num2;
    private TextView t2;

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
        t2 = (TextView)findViewById(R.id.textView);
        num1 = Integer.parseInt(e1.getText().toString());
        num2 = Integer.parseInt(e2.getText().toString());
        Button b1 = (Button)findViewById(R.id.button);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);

        Button[] b = {b1,b2,b3,b4};
        for(Button bt:b){
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(v.getId()){
                        case R.id.button:
                            getSum();
                            break;
                        case R.id.button2:
                            getDiff();
                            break;
                        case R.id.button3:
                            getProd();
                            break;
                        case R.id.button4:
                            getQuo();
                            break;
                        default:
                            break;
                    }
                }
            });
        }


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
    public int getSum(){
        int sum = num1 + num2;
        t2.setText(String.valueOf(sum));
        return sum;
    }
    public int getDiff(){
        int difference = num1 - num2;
        t2.setText(String.valueOf(difference));
        return difference;
    }
    public int getProd(){
        int product = num1 * num2;
        t2.setText(String.valueOf(product));
        return product;
    }
    public int getQuo(){
        int quotient = num1 / num2;
        t2.setText(String.valueOf(quotient));
        return quotient;
    }
}
