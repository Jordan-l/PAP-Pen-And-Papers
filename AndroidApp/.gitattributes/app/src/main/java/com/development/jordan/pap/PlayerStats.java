package com.development.jordan.pap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;

public class PlayerStats extends Activity {

    //TextFileds
    EditText name1;
    EditText beruf1;
    EditText geschlecht1;
    EditText alter1;
    EditText koerpergroesse1;
    EditText gewicht1;
    EditText schuhgroesse1;
    EditText koerperkraft1;
    EditText ausdauer1;
    EditText geschwindigkeit1;
    EditText intelligenz1;
    EditText charme1;
    EditText geistigeGesundheit1;
    EditText lebensenergie1;
    EditText mentaleBelastbarkeit1;
    EditText nahkampf1;
    EditText distanz1;
    EditText parade1;
    EditText initiative1;

    String gameName;
    String name;
    String beruf;
    String geschlecht;
    String alter;
    String koerpergroesse;
    String gewicht;
    String schuhgroesse;
    String koerperkraft;
    String ausdauer;
    String geschwindigkeit;
    String intelligenz;
    String charme;
    String geistigeGesundheit;
    String lebensenergie;
    String mentaleBelastbarkeit;
    String nahkampf;
    String distanz;
    String parade;
    String initiative;

    Database db;

    JSONArray zwischenSaveJArray = new JSONArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_stats);

        Button buttonStarteSpiel = (Button) findViewById(R.id.BWeiter);
        buttonStarteSpiel.setOnClickListener(myhandler1);

        Button buttonAddPlayer = (Button) findViewById(R.id.BAddPlayer);
        buttonAddPlayer.setOnClickListener(myhandler2);

        Button buttonRandom = (Button) findViewById(R.id.BRandom);
        buttonRandom.setOnClickListener(myhandler3);
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {

            //Save player stats

            SavePlayerstats();

            Log.i("AllSavedPlayerStats", zwischenSaveJArray.toString());

            startActivity(new Intent(PlayerStats.this, GameOverView.class));
        }
    };

    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            //save player stats

            SavePlayerstats();

            startActivity(new Intent(PlayerStats.this,PlayerStats.class));
        }
    };

    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
        }
    };

    public void SavePlayerstats()
    {
        Player p = new Player();

        gameName = SaveGameAS.gameName;

        p.setGameName(gameName);

        name1 = (EditText)findViewById(R.id.EDPlayerName);
        name = name1.getText().toString();

        p.setSpielerName(name);

        beruf1 = (EditText)findViewById(R.id.EDBeruf);
        beruf = beruf1.getText().toString();

        p.setBeruf(beruf);
        //Vorsicht!!
        /*geschlecht1 = (EditText)findViewById(R.id.EDGameName);
        player.geschlecht = geschlecht1.getText().toString();*/

        geschlecht = "m"; //pls fix

        p.setGeschlecht(geschlecht);

        alter1 = (EditText)findViewById(R.id.EDAlter);
        alter = alter1.getText().toString();

        p.setAlter(alter);

        koerpergroesse1 = (EditText)findViewById(R.id.EDKoerpergroesse);
        koerpergroesse = koerpergroesse1.getText().toString();

        p.setKoerpergroesse(koerpergroesse);

        gewicht1 = (EditText)findViewById(R.id.EDGewicht);
        gewicht = gewicht1.getText().toString();

        p.setGewicht(gewicht);

        schuhgroesse1 = (EditText)findViewById(R.id.EDSchuhgroesse);
        schuhgroesse = schuhgroesse1.getText().toString();

        p.setSchuhgroesse(schuhgroesse);

        koerperkraft1 = (EditText)findViewById(R.id.EDr1);
        koerperkraft = koerperkraft1.getText().toString();

        p.setKoerperkraft(koerperkraft);

        ausdauer1 = (EditText)findViewById(R.id.EDr2);
        ausdauer = ausdauer1.getText().toString();

        p.setAusdauer(ausdauer);

        geschwindigkeit1 = (EditText)findViewById(R.id.EDr3);
        geschwindigkeit = geschwindigkeit1.getText().toString();

        p.setGeschwindigkeit(geschwindigkeit);

        intelligenz1 = (EditText)findViewById(R.id.EDr4);
        intelligenz = intelligenz1.getText().toString();

        p.setIntelligenz(intelligenz);

        charme1 = (EditText)findViewById(R.id.EDr5);
        charme = charme1.getText().toString();

        p.setCharme(charme);

        geistigeGesundheit1 = (EditText)findViewById(R.id.EDr6);
        geistigeGesundheit = geistigeGesundheit1.getText().toString();

        p.setGeistigeGesundheit(geistigeGesundheit);

        lebensenergie1 = (EditText)findViewById(R.id.EDr7);
        lebensenergie = lebensenergie1.getText().toString();

        p.setLebensenergie(lebensenergie);

        mentaleBelastbarkeit1 = (EditText)findViewById(R.id.EDr8);
        mentaleBelastbarkeit = mentaleBelastbarkeit1.getText().toString();

        p.setMentaleBelastbarkeit(mentaleBelastbarkeit);

        nahkampf1 = (EditText)findViewById(R.id.EDr9);
        nahkampf = nahkampf1.getText().toString();

        p.setNahkampf(nahkampf);

        distanz1 = (EditText)findViewById(R.id.EDr10);
        distanz = distanz1.getText().toString();

        p.setDistanz(distanz);

        parade1 = (EditText)findViewById(R.id.EDr11);
        parade = parade1.getText().toString();

        p.setParade(parade);

        initiative1 = (EditText)findViewById(R.id.EDr12);
        initiative = initiative1.getText().toString();

        p.setParade(parade);

        db.addPlayer(p);

        Log.i("players",db.getAllPlayers().toString());
    }

}
