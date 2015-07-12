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

        Button buttonNSpiel = (Button) findViewById(R.id.BNeuesSpiel);
        buttonNSpiel.setOnClickListener(myhandler1);

        Button buttonSielLaden = (Button) findViewById(R.id.BSpielLaden);
        buttonSielLaden.setOnClickListener(myhandler2);

        Button buttonSielOptionen = (Button) findViewById(R.id.BOptions);
        buttonSielOptionen.setOnClickListener(myhandler3);
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            // Intent in = new Intent(PAPActivity.this, PlayerStats.class);
           // startActivity(in);

            startActivity(new Intent(PAPActivity.this,SaveGameAS.class));
        }
    };

    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {

        }
    };

    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {

        }
    };
}
