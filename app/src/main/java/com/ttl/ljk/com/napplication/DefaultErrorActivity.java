package com.ttl.ljk.com.napplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DefaultErrorActivity extends AppCompatActivity {

    TextView textView;
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.mf_layout);
        textView = findViewById(R.id.textView);

        process();
    }
    protected void process() {
        if (CustomActivityOnCrash.isShowErrorDetailsFromIntent(getIntent())) {
            String errorInformation =
                    CustomActivityOnCrash
                            .getAllErrorDetailsFromIntent(DefaultErrorActivity.this, getIntent());


            textView.setText(errorInformation);

            Log.e("TAG", errorInformation);

        }
    }
}
