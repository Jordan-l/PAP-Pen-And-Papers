package com.development.jordan.pap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class GameOverView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over_view);

        Button buttonW�rfel = (Button) findViewById(R.id.BW�rfel);
        buttonW�rfel.setOnClickListener(myhandler1);

        Button buttonPlayerStats = (Button) findViewById(R.id.BPlayerStats);
        buttonW�rfel.setOnClickListener(myhandler2);

        Button buttonPlayerInventory = (Button) findViewById(R.id.BPlayerInventory);
        buttonW�rfel.setOnClickListener(myhandler3);
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
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