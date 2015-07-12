package com.development.jordan.pap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class SaveGameAS extends Activity {

    //Variables
    CharSequence gameName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_game_as);

        Button saveGame = (Button)findViewById(R.id.BSaveGamel);
        saveGame.setOnClickListener(myhandler1);
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            EditText text = (EditText)findViewById(R.id.EDGameName);
            gameName = text.getText().toString();
            startActivity(new Intent(SaveGameAS.this,PlayerStats.class));
        }
    };
}