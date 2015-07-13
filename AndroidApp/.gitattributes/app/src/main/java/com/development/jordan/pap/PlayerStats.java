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

public class PlayerStats extends Activity {

/*    public class Player
    {
        String name;
        String beruf;
        String geschlecht;
        int alter;
        double koerpergroesse;
        double gewicht;
        double schuhgroesse;
        int koerperkraft;
        int ausdauer;
        int geschwindigkeit;
        int intelligenz;
        int charme;
        int geistigeGesundheit;
        int lebensenergie;
        int mentaleBelastbarkeit;
        int nahkampf;
        int distanz;
        int parade;
        int initiative;

        public void setName(String n)
        {
            this.name = n;
        }

        public String getName()
        {
            return name;
        }

        public void setBeruf(String b)
        {
            this.beruf = b;
        }

        public String getBeruf()
        {
            return beruf;
        }

        public void setGeschlecht(String g)
        {
            this.geschlecht = g;
        }

        public String getGeschlecht()
        {
            return geschlecht;
        }

        public void setAlter(int a)
        {
            this.alter = a;
        }

        public int getAlter()
        {
            return alter;
        }

        public void setKoerpergroesse(double k)
        {
            this.koerpergroesse = k;
        }

        public double getKoerpergroesse()
        {
            return koerpergroesse;
        }

        public void setGewicht(double g)
        {
            this.gewicht = g;
        }

        public double getGewicht()
        {
            return gewicht;
        }

        public void setSchuhgroesse(double s)
        {
            this.schuhgroesse = s;
        }

        public double getSchuhgroesse()
        {
            return schuhgroesse;
        }

        public void setKoerperkraft(int kk)
        {
            this.koerperkraft = kk;
        }

        public int getKoerperkraft()
        {
            return koerperkraft;
        }

        public void setAusdauer(int ausd)
        {
            this.ausdauer = ausd;
        }

        public int getAusdauer()
        {
            return ausdauer;
        }

        public void setGeschwindigkeit(int g)
        {
            this.geschwindigkeit = g;
        }

        public int getGeschwindigkeit()
        {
            return geschwindigkeit;
        }

        public void setIntelligenz(int intel)
        {
            this.intelligenz = intel;
        }

        public int getIntelligenz()
        {
            return intelligenz;
        }

        public void setCharme(int c)
        {
            this.charme = c;
        }

        public int getCharme()
        {
            return charme;
        }

        public void setGeistigeGesundheit(int gg)
        {
            this.geistigeGesundheit = gg;
        }

        public int getGeistigeGesundheit()
        {
            return geistigeGesundheit;
        }

        public void setLebensenergie(int le)
        {
            this.lebensenergie = le;
        }

        public int getLebensenergie()
        {
            return lebensenergie;
        }

        public void setMentaleBelastbarkeit(int mb)
        {
            this.mentaleBelastbarkeit = mb;
        }

        public int getMentaleBelastbarkeit()
        {
            return mentaleBelastbarkeit;
        }

        public void setNahkampf(int nk)
        {
            this.nahkampf = nk;
        }

        public int getNahkampf()
        {
            return nahkampf;
        }

        public void setDistanz(int d)
        {
            this.distanz = d;
        }

        public int getDistanz()
        {
            return distanz;
        }

        public void setParade(int p)
        {
            this.parade = p;
        }

        public int getParade()
        {
            return parade;
        }

        public void setInitiative(int init)
        {
            this.initiative = init;
        }

        public int getInitiative()
        {
            return initiative;
        }
    }*/

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

            Log.i("isclicked", "isclicked");

            //SaveArrayInCache(SavePlayerstats(newPlayer));

            //Log.i("JSONArray as String", SavePlayerstats(newPlayer).toString());

            startActivity(new Intent(PlayerStats.this, GameOverView.class));
        }
    };

    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            //save player stats

            //SavePlayerstats(playerS);

            //Log.i("JSONArray as String", SavePlayerstats(playerS).toString());

            startActivity(new Intent(PlayerStats.this,PlayerStats.class));
        }
    };

    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
        }
    };

    public JSONArray SavePlayerstats(Player player)
    {
        name1 = (EditText)findViewById(R.id.EDPlayerName);
        player.name = name1.getText().toString();

        beruf1 = (EditText)findViewById(R.id.EDBeruf);
        player.beruf = beruf1.getText().toString();

        //Vorsicht!!
        /*geschlecht1 = (EditText)findViewById(R.id.EDGameName);
        player.geschlecht = geschlecht1.getText().toString();*/

        player.geschlecht = "m"; //pls fix

        alter1 = (EditText)findViewById(R.id.EDAlter);
        player.alter = Integer.parseInt(alter1.getText().toString());

        koerpergroesse1 = (EditText)findViewById(R.id.EDKoerpergroesse);
        player.koerpergroesse = Double.valueOf(koerpergroesse1.getText().toString()).doubleValue();

        gewicht1 = (EditText)findViewById(R.id.EDGewicht);
        player.gewicht = Double.valueOf(gewicht1.getText().toString()).doubleValue();

        schuhgroesse1 = (EditText)findViewById(R.id.EDSchuhgroesse);
        player.schuhgroesse = Double.valueOf(schuhgroesse1.getText().toString()).doubleValue();

        koerperkraft1 = (EditText)findViewById(R.id.EDr1);
        player.koerperkraft = Integer.parseInt(koerperkraft1.getText().toString());

        ausdauer1 = (EditText)findViewById(R.id.EDr2);
        player.ausdauer = Integer.parseInt(ausdauer1.getText().toString());

        geschwindigkeit1 = (EditText)findViewById(R.id.EDr3);
        player.geschwindigkeit = Integer.parseInt(geschwindigkeit1.getText().toString());

        intelligenz1 = (EditText)findViewById(R.id.EDr4);
        player.intelligenz = Integer.parseInt(intelligenz1.getText().toString());

        charme1 = (EditText)findViewById(R.id.EDr5);
        player.charme = Integer.parseInt(charme1.getText().toString());

        geistigeGesundheit1 = (EditText)findViewById(R.id.EDr6);
        player.geistigeGesundheit = Integer.parseInt(geistigeGesundheit1.getText().toString());

        lebensenergie1 = (EditText)findViewById(R.id.EDr7);
        player.lebensenergie = Integer.parseInt(lebensenergie1.getText().toString());

        mentaleBelastbarkeit1 = (EditText)findViewById(R.id.EDr8);
        player.mentaleBelastbarkeit = Integer.parseInt(mentaleBelastbarkeit1.getText().toString());

        nahkampf1 = (EditText)findViewById(R.id.EDr9);
        player.nahkampf = Integer.parseInt(nahkampf1.getText().toString());

        distanz1 = (EditText)findViewById(R.id.EDr10);
        player.distanz = Integer.parseInt(distanz1.getText().toString());

        parade1 = (EditText)findViewById(R.id.EDr11);
        player.parade = Integer.parseInt(parade1.getText().toString());

        initiative1 = (EditText)findViewById(R.id.EDr12);
        player.initiative = Integer.parseInt(initiative1.getText().toString());

        try{
            return SaveGameAS.GameStats.put(ParseToJSONObject(player));
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }

    public static JSONObject ParseToJSONObject(Player player)
    {
        try{

            JSONObject playerObject = new JSONObject();

            playerObject.put("name: ", player.getName());

            playerObject.put("beruf: ", player.getBeruf());

            playerObject.put("alter: ", player.getAlter());

            playerObject.put("geschlecht: ", player.getGeschlecht());

            playerObject.put("koerpergroesse: ", player.getBeruf());

            playerObject.put("gewicht: ", player.getBeruf());

            playerObject.put("koerperkraft: ", player.getBeruf());

            playerObject.put("ausdauer: ", player.getBeruf());

            playerObject.put("geschwindigkeit: ", player.getBeruf());

            playerObject.put("intelligenz: ", player.getBeruf());

            playerObject.put("charme: ", player.getBeruf());

            playerObject.put("geistige Gesundheit: ", player.getBeruf());

            playerObject.put("mentale Belastbarkeit: ", player.getBeruf());

            playerObject.put("nahkampf: ", player.getBeruf());

            playerObject.put("distanz: ", player.getBeruf());

            playerObject.put("parade: ", player.getBeruf());

            playerObject.put("initiative: ", player.getBeruf());

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
