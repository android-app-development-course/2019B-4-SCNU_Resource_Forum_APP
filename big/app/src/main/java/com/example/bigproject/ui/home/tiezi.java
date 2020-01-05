package com.example.bigproject.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;

public class tiezi extends AppCompatActivity
{
    private TextView commentname;
    private TextView commentc;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tiezi);
        TextView knickname = findViewById(R.id.knickname);
        TextView title = findViewById(R.id.title);
        TextView content = findViewById(R.id.content);
        TextView date = findViewById(R.id.date);
        commentname = findViewById(R.id.commentname);
        commentc = findViewById(R.id.commentct);
        Button publish = findViewById(R.id.publishcomment);
        Intent intent = getIntent();
        String title1 = intent.getStringExtra("title");
        DataBaseHelper dbHelper = new DataBaseHelper(this);
        final SQLiteDatabase sdb = dbHelper.getReadableDatabase();
        String sql = "select knickname,title,content,date from siji where title=?";
        final Cursor cursor = sdb.rawQuery(sql, new String[]{title1});
        cursor.moveToNext();
        final String knickname1 = cursor.getString(0);
        String title2 = cursor.getString(1);
        String content1 = cursor.getString(2);
        String date1 = cursor.getString(3);
        knickname.setText(knickname1);
        title.setText(title2);
        content.setText(content1);
        date.setText(date1);

        publish.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String comment1 = "测试评论";
                commentname.setText("测试用户");
                commentc.setText(comment1);
                Toast.makeText(tiezi.this, "发布成功", Toast.LENGTH_LONG).show();
            }
        });
    }
}
