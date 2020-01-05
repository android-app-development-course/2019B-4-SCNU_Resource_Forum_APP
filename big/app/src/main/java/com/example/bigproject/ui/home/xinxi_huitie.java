package com.example.bigproject.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;
import com.example.bigproject.ui.home.Adapter.myAdapter2;
import com.example.bigproject.ui.home.Bean.dataBean2;

import java.util.ArrayList;

public class xinxi_huitie extends AppCompatActivity
{
    DataBaseHelper dbHelper;
    SQLiteDatabase sdb2;
    private EditText title;
    private EditText content;
    private ListView htlistview;
    private ArrayList<dataBean2> htiedata = new ArrayList<>();
    private myAdapter2 adapter;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi_huitie);
        init();
    }

    protected void init()
    {
        title = findViewById(R.id.title_s);
        content = findViewById(R.id.content);
        htlistview = findViewById(R.id.listview);

        //获得原帖标题内容
        Intent yuantie = getIntent();
        final dataBean2 dtb2 = (dataBean2) yuantie.getSerializableExtra("dtb2");
        TextView maintitle = findViewById(R.id.maintitle);
        maintitle.setText(dtb2.getTitle());
        TextView maincontent = findViewById(R.id.maincontent);
        maincontent.setText(dtb2.getContext());

        //获得已有回帖
        htlistview = findViewById(R.id.huities);
        dbHelper = new DataBaseHelper(xinxi_huitie.this);
        sdb2 = dbHelper.getReadableDatabase();
        htiedata = new ArrayList<>();
        Cursor cursor = sdb2.rawQuery("select title,content from huitie" + dtb2.getTitle() + ";", null);  //按标题获取回帖数据库
        while (cursor.moveToNext())
        {
            htiedata.add(new dataBean2(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("content"))));
        }
        adapter = new myAdapter2(this, R.layout.xinxi_huities, htiedata);
        htlistview.setAdapter(adapter);

        //增加回帖
        Button fasong = findViewById(R.id.fasong);
        fasong.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                dbHelper = new DataBaseHelper(xinxi_huitie.this);
                sdb2 = dbHelper.getReadableDatabase();

                sdb2.execSQL("insert into huitie" + dtb2.getTitle() + " values('" + title.getText().toString() + "','" + content.getText().toString() + "')");

                htiedata = new ArrayList<>();
                Cursor cursor = sdb2.rawQuery("select title,content from huitie" + dtb2.getTitle() + ";", null);  //按标题获取回帖数据库
                while (cursor.moveToNext())
                {
                    htiedata.add(new dataBean2(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("content"))));
                }
                adapter = new myAdapter2(xinxi_huitie.this, R.layout.xinxi_huities, htiedata);
                htlistview.setAdapter(adapter);

                title.setText("");
                content.setText("");
            }
        });
    }
}
