package com.example.bigproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.bigproject.login_register.DataBaseHelper;

public class insert
{
    private DataBaseHelper dbHelper;

    public insert(Context context)
    {
        dbHelper = new DataBaseHelper(context);
    }

    //添加函数
    public boolean add(String knickname, String title, String content, String date)
    {
        SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        String sql = "insert into siji(knickname,title,content,date) values(?,?,?,?)";
        Object[] obj = {knickname, title, content, date};
        sdb.execSQL(sql, obj);
        return true;
    }
}
