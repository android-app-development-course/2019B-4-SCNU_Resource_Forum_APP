package com.example.bigproject.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;
import com.example.bigproject.ui.home.Adapter.myAdapter;
import com.example.bigproject.ui.home.Bean.dataBean;

import java.util.ArrayList;
import java.util.Objects;

public class xinxi extends AppCompatActivity
{
    public static final String[] spinner_arr = {"信息共享区", "聊天交流区", "闲置交易信息发布区"};
    myAdapter adapter;
    ListView listView;
    DataBaseHelper dbHelper = new DataBaseHelper(this);
    SQLiteDatabase sdb;
    private ArrayList<dataBean> tiedata;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi);

        gettiezis();

        listView = findViewById(R.id.listview);
        adapter = new myAdapter(this, R.layout.xinxi_tiezis, tiedata);
        listView.setAdapter(adapter);

        //转到发帖
        Button fatie = findViewById(R.id.fatie);
        fatie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent ft = new Intent();
                ft.setClass(xinxi.this, xinxi_fatie.class);
                ft.putExtra("fatiemokuai", "信息共享区");
                startActivityForResult(ft, 1);
            }
        });

        Spinner spinner = findViewById(R.id.mokuaixuanze);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.xinxi_spinner, xinxi.spinner_arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == 1)
        {
            if (resultCode == RESULT_OK)
            {
                dataBean xintie = (dataBean) data.getSerializableExtra("xintiezi");
                sdb.execSQL("insert into tiezi values('" + Objects.requireNonNull(xintie).getTitle() + "','" + xintie.getContext() + "')");

                gettiezis();

                adapter = new myAdapter(this, R.layout.xinxi_tiezis, tiedata);
                listView.setAdapter(adapter);
            }
        }
    }

    //获得帖子
    protected void gettiezis()
    {
        tiedata = new ArrayList<>();
        sdb = dbHelper.getReadableDatabase();
        Cursor cursor = sdb.rawQuery("select title,content from tiezi;", null);
        int[] imgids = new int[]{R.drawable.test1, R.drawable.test2, R.drawable.test3, R.drawable.test4, R.drawable.test5, R.drawable.test6};
        int i = 0;
        while (cursor.moveToNext())
        {
            tiedata.add(new dataBean(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("content")), imgids[i]));
            i++;
            i = i % 6;

            //根据表是否存在决定，创建本贴的数据表
            if (!tabIsExist(sdb, "huitie" + cursor.getString(cursor.getColumnIndex("title"))))
            {
                sdb.execSQL("create table huitie" + cursor.getString(cursor.getColumnIndex("title")) + "(title varchar(255),content text)"); //名为"huitie"title
            }
        }
    }

    //判断表是否存在
    public boolean tabIsExist(SQLiteDatabase db, String yourTableName)
    {
        boolean result = false;
        if (yourTableName == null)
        {
            return false;
        }
        Cursor cursor;
        try
        {

            String sql = "select count(*) as c from sqlite_master where type ='table' and name ='" + yourTableName.trim() + "' ";
            cursor = db.rawQuery(sql, null);
            if (cursor.moveToNext())
            {
                int count = cursor.getInt(0);
                if (count > 0)
                {
                    result = true;
                }
            }

        } catch (Exception e)
        {

        }
        return result;
    }
}
