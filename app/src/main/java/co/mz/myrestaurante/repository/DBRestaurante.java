package co.mz.myrestaurante.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBRestaurante extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NAME_DB = "restaurantes";
    protected static final String TB_USUARIOS = "usuarios";
    protected static final String TB_PRODUCTOS = "usuarios";
    protected static final String TB_CATEGORIAS = "usuarios";

    public DBRestaurante(@Nullable Context context) {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlUsuarios = "CREATE TABLE IF NOT EXISTS "+TB_USUARIOS+"" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
