package ru.alexanderklimov.hellokitty;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;
    private TextView mHelloTextView;
    private EditText mNameEditText;

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // get the activity under test
        mActivity = getActivity();
        mHelloTextView = (TextView) mActivity.findViewById(R.id.textView);
        mNameEditText = (EditText) mActivity.findViewById(R.id.editText);

    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
