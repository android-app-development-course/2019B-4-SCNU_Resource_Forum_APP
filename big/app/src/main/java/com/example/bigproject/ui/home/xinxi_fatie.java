package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Bean.dataBean;

public class xinxi_fatie extends AppCompatActivity
{
    private EditText title;
    private EditText content;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi_fatie);
        init();
    }

    private void init()
    {
        final Intent i = getIntent();
        TextView mokuai = findViewById(R.id.mokuai);
        String fatiemokuai = i.getStringExtra("fatiemokuai");
        mokuai.setText(fatiemokuai);

        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        Button fabu = findViewById(R.id.fabu);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.xinxi_spinner, xinxi.spinner_arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final dataBean tiezisj = new dataBean(title.getText().toString(), content.getText().toString(), R.drawable.test1);

        fabu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //传回发布的帖子
                Intent fabutz = new Intent();
                tiezisj.setTitle(title.getText().toString());//被传回数据的标题
                tiezisj.setContext(content.getText().toString());//被传回数据的内容
                fabutz.putExtra("xintiezi", tiezisj);
                setResult(RESULT_OK, fabutz);
                finish();
            }
        });
    }
}
