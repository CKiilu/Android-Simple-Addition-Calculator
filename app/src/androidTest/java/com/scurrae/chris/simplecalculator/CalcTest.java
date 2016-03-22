package com.scurrae.chris.simplecalculator;

import android.widget.EditText;
import android.widget.TextView;

import junit.framework.TestCase;

/**
 * Created by chris on 3/22/16.
 */
public class CalcTest extends TestCase {
    MainActivity activity = new MainActivity();
    EditText e1 = (EditText)activity.findViewById(R.id.editText);
    EditText e2 = (EditText)activity.findViewById(R.id.editText2);
    int num1 = Integer.parseInt(e1.getText().toString());
    int num2 = Integer.parseInt(e2.getText().toString());


    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testSum(){
        int result = num1 + num2;
        assertEquals(result, activity.getSum());
    }
    public void testDiff(){
        int result = num1 - num2;
        assertEquals(result, activity.getSum());
    }
    public void testProd(){
        int result = num1 * num2;
        assertEquals(result, activity.getSum());
    }
    public void testQuo(){
        int result = num1 / num2;
        assertEquals(result, activity.getSum());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
