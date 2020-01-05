package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.database.insert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class messagepublish extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_messagepublish);
    }

    public void onclick(View v)
    {
        String knickname = "测试用户";
        if (v.getId() == R.id.publish)
        {
            EditText title = findViewById(R.id.title);
            EditText content = findViewById(R.id.content);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH");
            String date1 = df.format(new Date());
            String title1 = title.getText().toString();
            String content1 = content.getText().toString();
            insert insert = new insert(this);
            insert.add(knickname, title1, content1, date1);
            Toast.makeText(messagepublish.this, "添加成功", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(messagepublish.this, siji.class);
            startActivity(intent);
        }
    }
}
