package com.development.jordan.pap;

import android.util.Log;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jordan on 18.07.2015.
 */
public class DatabaseTest
{
    Database db;

    boolean success = false;

    public boolean DataWithOutNull ()
    {
        List<Player> testPlayer = db.getAllPlayers();

        for(int i = 0; i < testPlayer.size(); i++)
        {
            if (testPlayer.get(i) != null)
            {
                success = true;
            }
            else {
                success = false;
            }
        }
        return success;
    }

    public boolean AddPlayerTest()
    {
       Player paul = new Player("Game1", "Paul", "LKW_Fahrer", "m", "54", "1,78", "100", "48", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");

        try
       {
           db.addPlayer(paul);

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
        Player player = db.getPlayer("paul");

        try
        {
            db.deletePlayer(player);

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
        Log.i("Database is completely:", String.valueOf(DataWithOutNull()));

        Log.i("Add Player Test:", String.valueOf(AddPlayerTest()));

        Log.i("Delete Player Test:", String.valueOf(DeletePlayerTest()));
    }
}
