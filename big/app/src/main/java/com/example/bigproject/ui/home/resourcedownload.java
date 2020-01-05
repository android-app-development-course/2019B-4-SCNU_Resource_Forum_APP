package com.example.bigproject.ui.home;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;

import java.util.ArrayList;

public class resourcedownload extends AppCompatActivity
{
    ListView wenjianlist;
    ArrayList<danyuan> zong;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_resourcedownload);
        wenjianlist = findViewById(R.id.resource);
        zong = new ArrayList<>();
        DataBaseHelper dbHelper = new DataBaseHelper(this);
        final SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        Cursor cursor = sdb.rawQuery("select filename,id as _id from wenjian;", null);
        SimpleCursorAdapter simple = new SimpleCursorAdapter(this, R.layout.downloadlitem, cursor, new String[]{"filename"}, new int[]{R.id.filename});
        wenjianlist.setAdapter(simple);

        wenjianlist.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(resourcedownload.this, "下载链接复制成功，请粘贴到浏览器下载文件", Toast.LENGTH_LONG).show();
            }
        });
    }

    private class danyuan
    {

    }
}
