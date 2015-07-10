package com.development.jordan.pap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class PAPActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pap);
    }

    Button buttonNSpiel = (Button) findViewById(R.id.BNeuesSpiel);
    OnClickListener buttonNeuesSpiel = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(PAPActivity.this, generalOptions.class);
            startActivity(in);
        }
    };
}
