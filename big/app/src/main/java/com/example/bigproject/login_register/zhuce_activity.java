package com.example.bigproject.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.MainActivity;
import com.example.bigproject.R;

public class zhuce_activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.zhuce);
    }

    public void onclick2(View v)
    {
        EditText mima = findViewById(R.id.password);
        EditText zhanghao = findViewById(R.id.Account);
        if (v.getId() == R.id.zhuce)
        {
            String zhhao = zhanghao.getText().toString();
            String mma = mima.getText().toString();
            Userservice uService = new Userservice(this);
            boolean flag = uService.register(zhhao, mma);
            if (!flag)
            {
                Toast.makeText(this, "注册失败，请重试", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "注册成功，返回登录页面", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
