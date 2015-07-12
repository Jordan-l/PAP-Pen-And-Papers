package com.development.jordan.pap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class PlayerStats extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_stats);

        Button buttonStarteSpiel = (Button) findViewById(R.id.BWeiter);
        buttonStarteSpiel.setOnClickListener(myhandler1);

        Button buttonAddPlayer = (Button) findViewById(R.id.BAddPlayer);
        buttonStarteSpiel.setOnClickListener(myhandler2);

        Button buttonRandom = (Button) findViewById(R.id.BRandom);
        buttonStarteSpiel.setOnClickListener(myhandler3);
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            //Save player stats
            startActivity(new Intent(PlayerStats.this,GameOverView.class));
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