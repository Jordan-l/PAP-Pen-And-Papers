package com.development.jordan.pap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordan on 16.07.2015.
 */
public class Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "playerStats";
    private static final String TABLE_PLAYERS = "players";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_GAME_NAME = "game_name";
    private static final String KEY_PLAYER_NAME= "player_name";
    private static final String KEY_BERUF= "beruf";
    private static final String KEY_GESCHLECHT= "geschlecht";
    private static final String KEY_ALTER= "alter";
    private static final String KEY_KOERPERGROESSE= "koerpergroesse";
    private static final String KEY_GEWICHT= "gewicht";
    private static final String KEY_SCHUHGROESSE= "schuhgroesse";

    private static final String KEY_KOERPER_KRAFT= "koerper_kraft";
    private static final String KEY_AUSDAUER= "ausdauer";
    private static final String KEY_GESCHWINDIGKEIT= "geschwindigkeit";
    private static final String KEY_INTELLIGENZ= "intelligenz";
    private static final String KEY_CHARME= "charme";
    private static final String KEY_GEISTIGE_GESUNDHEIT= "geistige_gesundheit";
    private static final String KEY_LEBENSENERGIE= "lebensenergie";
    private static final String KEY_MENTALE_BELASTBARKEIT= "mentale_belastbarkeit";
    private static final String KEY_ATTACKE_NAHKAMPF= "attacke_nahkampf";
    private static final String KEY_ATTACKE_DISTANZE= "attacke_distanz";
    private static final String KEY_PARADE= "parade";
    private static final String KEY_INITIATIVE= "initiative";

    boolean success = false;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_PLAYERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_GAME_NAME + " TEXT,"
                + KEY_PLAYER_NAME + " TEXT"
                + KEY_BERUF + " TEXT"
                + KEY_GESCHLECHT + " TEXT"
                + KEY_ALTER + " TEXT"
                + KEY_KOERPERGROESSE + " TEXT"
                + KEY_GEWICHT + " TEXT"
                + KEY_SCHUHGROESSE + " TEXT"
                + KEY_KOERPER_KRAFT + " TEXT"
                + KEY_AUSDAUER + " TEXT"
                + KEY_GESCHWINDIGKEIT + " TEXT"
                + KEY_INTELLIGENZ + " TEXT"
                + KEY_CHARME + " TEXT"
                + KEY_GEISTIGE_GESUNDHEIT + " TEXT"
                + KEY_LEBENSENERGIE + " TEXT"
                + KEY_MENTALE_BELASTBARKEIT + " TEXT"
                + KEY_ATTACKE_NAHKAMPF + " TEXT"
                + KEY_ATTACKE_DISTANZE + " TEXT"
                + KEY_PARADE + " TEXT"
                + KEY_INITIATIVE + " TEXT"
                + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLAYERS);

        // Create tables again
        onCreate(db);
    }

    public void addPlayer( String gameName,
                           String name,
                           String beruf,
                           String geschlecht,
                           String alter,
                           String koerpergroesse,
                           String gewicht,
                           String schuhgroesse,
                           String koerperkraft,
                           String ausdauer,
                           String geschwindigkeit,
                           String intelligenz,
                           String charme,
                           String geistigeGesundheit,
                           String lebensenergie,
                           String mentaleBelastbarkeit,
                           String nahkampf,
                           String distanz,
                           String parade,
                           String initiative)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_GAME_NAME, gameName);
        values.put(KEY_PLAYER_NAME, name);
        values.put(KEY_BERUF, beruf);
        values.put(KEY_GESCHLECHT, geschlecht);
        values.put(KEY_ALTER, alter);
        values.put(KEY_KOERPERGROESSE, koerpergroesse);
        values.put(KEY_GEWICHT, gewicht);
        values.put(KEY_SCHUHGROESSE, schuhgroesse);
        values.put(KEY_KOERPER_KRAFT, koerperkraft);
        values.put(KEY_AUSDAUER, ausdauer);
        values.put(KEY_GESCHWINDIGKEIT, geschwindigkeit);
        values.put(KEY_INTELLIGENZ, intelligenz);
        values.put(KEY_CHARME, charme);
        values.put(KEY_GEISTIGE_GESUNDHEIT, geistigeGesundheit);
        values.put(KEY_LEBENSENERGIE, lebensenergie);
        values.put(KEY_MENTALE_BELASTBARKEIT, mentaleBelastbarkeit);
        values.put(KEY_ATTACKE_NAHKAMPF,nahkampf);
        values.put(KEY_ATTACKE_DISTANZE, distanz);
        values.put(KEY_PARADE, parade);
        values.put(KEY_INITIATIVE,initiative);

        // Inserting Row
        db.insert(TABLE_PLAYERS, null, values);
        db.close(); // Closing database connection
    }

    // Getting All Contacts
    public List<Player> getAllPlayers()
    {
        List<Player> contactList = new ArrayList<Player>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_PLAYERS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Player contact = new Player();
                contact.setId(Integer.parseInt(cursor.getString(0)));
                contact.setGameName(cursor.getString(1));
                contact.setSpielerName(cursor.getString(2));
                contact.setBeruf(cursor.getString(3));
                contact.setGeschlecht(cursor.getString(4));
                contact.setAlter(cursor.getString(5));
                contact.setKoerpergroesse(cursor.getString(6));
                contact.setGewicht(cursor.getString(7));
                contact.setSchuhgroesse(cursor.getString(8));
                contact.setKoerperkraft(cursor.getString(9));
                contact.setAusdauer(cursor.getString(10));
                contact.setGeschwindigkeit(cursor.getString(11));
                contact.setIntelligenz(cursor.getString(12));
                contact.setCharme(cursor.getString(13));
                contact.setGeistigeGesundheit(cursor.getString(14));
                contact.setLebensenergie(cursor.getString(15));
                contact.setMentaleBelastbarkeit(cursor.getString(16));
                contact.setNahkampf(cursor.getString(17));
                contact.setDistanz(cursor.getString(18));
                contact.setParade(cursor.getString(19));
                contact.setInitiative(cursor.getString(20));
                // Adding contact to list
                contactList.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }


    // Getting contacts Count
    public int getPlayerCount()
    {
        String countQuery = "SELECT  * FROM " + TABLE_PLAYERS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    // Updating single contact
    public int updatePlayer(Player player)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_GAME_NAME, player.getGameName());
        values.put(KEY_PLAYER_NAME, player.getSpielerName());
        values.put(KEY_BERUF, player.getBeruf());
        values.put(KEY_GESCHLECHT, player.getGeschlecht());
        values.put(KEY_ALTER, player.getAlter());
        values.put(KEY_KOERPERGROESSE, player.getKoerpergroesse());
        values.put(KEY_GEWICHT, player.getGewicht());
        values.put(KEY_SCHUHGROESSE, player.getSchuhgroesse());
        values.put(KEY_KOERPER_KRAFT, player.getKoerperkraft());
        values.put(KEY_AUSDAUER, player.getAusdauer());
        values.put(KEY_GESCHWINDIGKEIT, player.getGeschwindigkeit());
        values.put(KEY_INTELLIGENZ, player.getIntelligenz());
        values.put(KEY_CHARME, player.getCharme());
        values.put(KEY_GEISTIGE_GESUNDHEIT, player.getGeistigeGesundheit());
        values.put(KEY_LEBENSENERGIE, player.getLebensenergie());
        values.put(KEY_MENTALE_BELASTBARKEIT, player.getMentaleBelastbarkeit());
        values.put(KEY_ATTACKE_NAHKAMPF, player.getNahkampf());
        values.put(KEY_ATTACKE_DISTANZE, player.getDistanz());
        values.put(KEY_PARADE, player.getParade());
        values.put(KEY_INITIATIVE, player.getInitiative());

        // updating row
        return db.update(TABLE_PLAYERS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(player.getId()) });
    }

    // Deleting single contact
    public void deletePlayer(Player player)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_PLAYERS, KEY_ID + " = ?",
                new String[] { String.valueOf(player.getId()) });
        db.close();
    }

    public Player findPlayerByName (String playerName)
    {

        String query = "SELECT * FROM " + TABLE_PLAYERS + " WHERE "+ KEY_PLAYER_NAME +" = " + playerName ;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query,null);

       while (cursor.moveToNext())
       {
            cursor.moveToNext();
            Player player = new Player(Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4),
                    cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),
                    cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),
                    cursor.getString(15),cursor.getString(16),cursor.getString(17),cursor.getString(18),cursor.getString(19),cursor.getString(20));
            cursor.close();

            return player;

        }
        db.close();
        return null;
    }

    public boolean DataWithOutNull ()
    {
        List<Player> testPlayer = getAllPlayers();

        try {
            for (int i = 0; i < testPlayer.size(); i++) {
                if (testPlayer.get(i) != null) {
                    success = true;
                } else {
                    success = false;
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            success = false;
        }
            return success;
    }

    public boolean AddPlayerTest()
    {
        try
        {
           addPlayer("Game1", "Paul", "LKW_Fahrer", "m", "54", "1,78", "100", "48", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");

            success = true;
        }catch (Exception e)
        {
            e.printStackTrace();

            success = false;
        }

        return success;
    }

    public boolean DeletePlayerTest()
    {
        Player player = findPlayerByName("Paul");

        try
        {
            deletePlayer(player);

            success = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            success = false;
        }
        return success;
    }

    public void PrintLogs ()
    {
        Log.i("Database is completely ", String.valueOf(DataWithOutNull()));

        Log.i("Add Player Test ", String.valueOf(AddPlayerTest()));

       //Log.i("Get Player Test ", findPlayerByName("Paul").toString());

       // Log.i("Delete Player Test ", String.valueOf(DeletePlayerTest()));
    }
}

