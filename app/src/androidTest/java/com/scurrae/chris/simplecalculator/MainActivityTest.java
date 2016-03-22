package com.scurrae.chris.simplecalculator;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chris on 3/22/16.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    @SmallTest
    public void textViewNotNull(){
        EditText e1 = (EditText)activity.findViewById(R.id.editText);
        EditText e2 = (EditText)activity.findViewById(R.id.editText2);
        assertNotNull(e1);
        assertNotNull(e2);
    }
    @SmallTest
    public void editViewNotNull(){
        TextView t2 = (TextView)activity.findViewById(R.id.textView);
        assertNotNull(t2);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
