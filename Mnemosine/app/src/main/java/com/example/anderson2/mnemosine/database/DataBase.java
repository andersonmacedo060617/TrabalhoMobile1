package com.example.anderson2.mnemosine.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class DataBase extends SQLiteOpenHelper {

    public static final String dbName = "bancoRemedios.db";
    public static final int dbVersion = 1;
    public static Context context;

    public DataBase(Context context) {
        super(context, dbName, null, dbVersion);
        this.context = context;
    }

    //Tabela Usuarios
    public static final String TABLE_USUARIO = "usuario";
    public static final String USUARIO_ID = "id";
    public static final String USUARIO_NOME = "nome";
    public static final String USUARIO_LOGIN = "login";
    public static final String USUARIO_SENHA = "senha";
    public static final String USUARIO_DATA_NASCIMENTO = "data_nascimento";

    public static final String CREATE_TABLE_USUARIO = "create table " + TABLE_USUARIO + " " +
            "(" + USUARIO_ID + " integer primary key autoincrement, " +
            " " + USUARIO_NOME + " text not null, " +
            " " + USUARIO_LOGIN + " text not null, " +
            " " + USUARIO_SENHA + " text not null, " +
            " " + USUARIO_DATA_NASCIMENTO + " date not null " +
        ");";

    public static final String DROP_TABLE_USUARIO = "drop table if exists " + TABLE_USUARIO + ";";

    //Tabela Remedios
    public static final String TABLE_REMEDIO = "remedio";
    public static final String REMEDIO_ID = "id";
    public static final String REMEDIO_NOME = "nome";
    public static final String REMEDIO_DESCRICAO = "descricao";
    public static final String REMEDIO_FABRICANTE = "fabricante";
    public static final String REMEDIO_PESO_REMEDIO = "peso_remedio";

    public static final String CREATE_TABLE_REMEDIO = "create table " + TABLE_REMEDIO + " " +
            "(" + REMEDIO_ID + " integer primary key autoincrement, " +
            " " + REMEDIO_NOME + " text not null, " +
            " " + REMEDIO_DESCRICAO + " text not null, " +
            " " + REMEDIO_FABRICANTE + " text not null, " +
            " " + REMEDIO_PESO_REMEDIO + " real not null" +
           ");";

    //Horario dose remedio
    public static final String TABLE_DOSE_REMEDIO = "dose_remedio";


    public static final String DROP_TABLE_REMEDIO = "drop table if exists " + TABLE_REMEDIO + ";";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_USUARIO);
        sqLiteDatabase.execSQL(CREATE_TABLE_REMEDIO);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE_USUARIO);
        sqLiteDatabase.execSQL(DROP_TABLE_REMEDIO);
        onCreate(sqLiteDatabase);
    }
}
