package com.development.jordan.pap;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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

    String JSONArrayAsString;

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
            //SaveArrayInCache(SavePlayerstats());
            SavePlayerstats();
            Log.i("isKlicked", SavePlayerstats().toString());
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

    public JSONArray SavePlayerstats( )
    {
        name1 = (EditText)findViewById(R.id.EDPlayerName);
        Player.name = name1.getText().toString();

        beruf1 = (EditText)findViewById(R.id.EDBeruf);
        Player.beruf = beruf1.getText().toString();

        //Vorsicht!!
        /*geschlecht1 = (EditText)findViewById(R.id.EDGameName);
        player.geschlecht = geschlecht1.getText().toString();*/

        Player.geschlecht = "m"; //pls fix

        alter1 = (EditText)findViewById(R.id.EDAlter);
        Player.alter = Integer.parseInt(alter1.getText().toString());

        koerpergroesse1 = (EditText)findViewById(R.id.EDKoerpergroesse);
        Player.koerpergroesse = Double.valueOf(koerpergroesse1.getText().toString()).doubleValue();

        gewicht1 = (EditText)findViewById(R.id.EDGewicht);
        Player.gewicht = Double.valueOf(gewicht1.getText().toString()).doubleValue();

        schuhgroesse1 = (EditText)findViewById(R.id.EDSchuhgroesse);
        Player.schuhgroesse = Double.valueOf(schuhgroesse1.getText().toString()).doubleValue();

        koerperkraft1 = (EditText)findViewById(R.id.EDr1);
        Player.koerperkraft = Integer.parseInt(koerperkraft1.getText().toString());

        ausdauer1 = (EditText)findViewById(R.id.EDr2);
        Player.ausdauer = Integer.parseInt(ausdauer1.getText().toString());

        geschwindigkeit1 = (EditText)findViewById(R.id.EDr3);
        Player.geschwindigkeit = Integer.parseInt(geschwindigkeit1.getText().toString());

        intelligenz1 = (EditText)findViewById(R.id.EDr4);
        Player.intelligenz = Integer.parseInt(intelligenz1.getText().toString());

        charme1 = (EditText)findViewById(R.id.EDr5);
        Player.charme = Integer.parseInt(charme1.getText().toString());

        geistigeGesundheit1 = (EditText)findViewById(R.id.EDr6);
        Player.geistigeGesundheit = Integer.parseInt(geistigeGesundheit1.getText().toString());

        lebensenergie1 = (EditText)findViewById(R.id.EDr7);
        Player.lebensenergie = Integer.parseInt(lebensenergie1.getText().toString());

        mentaleBelastbarkeit1 = (EditText)findViewById(R.id.EDr8);
        Player.mentaleBelastbarkeit = Integer.parseInt(mentaleBelastbarkeit1.getText().toString());

        nahkampf1 = (EditText)findViewById(R.id.EDr9);
        Player.nahkampf = Integer.parseInt(nahkampf1.getText().toString());

        distanz1 = (EditText)findViewById(R.id.EDr10);
        Player.distanz = Integer.parseInt(distanz1.getText().toString());

        parade1 = (EditText)findViewById(R.id.EDr11);
        Player.parade = Integer.parseInt(parade1.getText().toString());

        initiative1 = (EditText)findViewById(R.id.EDr12);
        Player.initiative = Integer.parseInt(initiative1.getText().toString());

        try{
            return SaveGameAS.GameStats.put(ParseToJSONObject());
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }

    public static JSONObject ParseToJSONObject()
    {
        try{

            JSONObject playerObject = new JSONObject();

            playerObject.put("name: ", Player.name);

            playerObject.put("beruf: ", Player.beruf);

            playerObject.put("alter: ", Player.alter);

            playerObject.put("geschlecht: ", Player.geschlecht);

            playerObject.put("koerpergroesse: ", Player.koerpergroesse);

            playerObject.put("gewicht: ", Player.gewicht);

            playerObject.put("koerperkraft: ", Player.koerperkraft);

            playerObject.put("ausdauer: ", Player.ausdauer);

            playerObject.put("geschwindigkeit: ", Player.geschwindigkeit);

            playerObject.put("intelligenz: ", Player.intelligenz);

            playerObject.put("charme: ", Player.charme);

            playerObject.put("geistige Gesundheit: ", Player.geistigeGesundheit);

            playerObject.put("mentale Belastbarkeit: ", Player.mentaleBelastbarkeit);

            playerObject.put("nahkampf: ", Player.nahkampf);

            playerObject.put("distanz: ", Player.distanz);

            playerObject.put("parade: ", Player.parade);

            playerObject.put("initiative: ", Player.initiative);

            //SaveGameAS.GameStats.put(playerObject);

            return playerObject;

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void SaveArrayInCache(JSONArray players)
    {

        JSONArrayAsString = players.toString();

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);

        SharedPreferences.Editor editor = pref.edit();

        editor.putString(SaveGameAS.gameName.toString(), JSONArrayAsString); // Storing string

    }
}
