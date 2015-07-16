package com.development.jordan.pap;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Jordan on 15.07.2015.
 */
public class PlayersList extends Activity
{

    String getPlayerStatsFromChace;
    JSONArray createdJSONArray = new JSONArray();
    int length;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list);
    }
}
