package com.example.bigproject.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;

import java.util.ArrayList;

public class liuji extends AppCompatActivity
{
    ListView liujilistview;
    ArrayList<danyuan> zong;
    private Button add;
    private Button upload;
    private Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_liuji);
        liujilistview = findViewById(R.id.button_list);
        add = findViewById(R.id.add);
        upload = findViewById(R.id.upload);
        download = findViewById(R.id.download);
        zong = new ArrayList<>();
        DataBaseHelper dbHelper = new DataBaseHelper(this);
        final SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        add = findViewById(R.id.add);
        Cursor cursor = sdb.rawQuery("select knickname,title,date,id as _id from liuji;", null);
        SimpleCursorAdapter simple = new SimpleCursorAdapter(this, R.layout.hotlist_item, cursor, new String[]{"knickname", "title", "date"}, new int[]{R.id.knickname, R.id.title, R.id.date});
        liujilistview.setAdapter(simple);
        liujilistview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Cursor cursor = sdb.rawQuery("select title,id as _id from siji;", null);
                cursor.moveToPosition(i);
                String title1 = cursor.getString(cursor.getColumnIndex("title"));
                Toast.makeText(liuji.this, title1, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(liuji.this, tiezi2.class);
                intent.putExtra("title", title1);
                startActivity(intent);
            }
        });
    }

    public void onclick3(View v)
    {
        add = findViewById(R.id.add);
        upload = findViewById(R.id.upload);
        download = findViewById(R.id.download);
        switch (v.getId())
        {
            case R.id.add:
                Intent intent = new Intent(this, messagepublish2.class);
                startActivity(intent);
                break;
            case R.id.upload:
                Intent intent2 = new Intent(this, resourceupload.class);
                startActivity(intent2);
                break;
            case R.id.download:
                Intent intent3 = new Intent(this, resourcedownload.class);
                startActivity(intent3);
        }
    }

    private class danyuan
    {

    }
}
