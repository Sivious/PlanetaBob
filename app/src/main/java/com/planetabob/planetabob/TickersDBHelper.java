package com.planetabob.planetabob;

import android.content.Context;
import android.database.sqlite.*;

/**
 * Created by jcpenuela on 6/07/15.
 */
public class TickersDBHelper extends SQLiteOpenHelper {

    private static String DATABASE_NAME = "Tickers";
    private static int DATABASE_VERSION = 1;

    public TickersDBHelper(Context context){
        super(context,
                DATABASE_NAME,//String name
                null,//factory
                DATABASE_VERSION//int version
        );
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Crear la base de datos
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Actualizar la base de datos
    }

}
