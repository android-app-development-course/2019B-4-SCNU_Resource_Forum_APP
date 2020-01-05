package com.example.bigproject.login_register;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Userservice
{
    private DataBaseHelper dbHelper;

    public Userservice(Context context)
    {
        dbHelper = new DataBaseHelper(context);
    }

    //登录用
    public boolean login(String username, String password)
    {
        SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        String sql = "select * from user where username=? and password=?";
        Cursor cursor = sdb.rawQuery(sql, new String[]{username, password});
        if (cursor.moveToFirst())
        {
            cursor.close();
            return true;
        }
        return false;
    }

    //注册用
    boolean register(String username, String password)
    {
        SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        String sql = "insert into user(username,password) values(?,?)";
        Object[] obj = {username, password};
        sdb.execSQL(sql, obj);
        return true;
    }
}
