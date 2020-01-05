package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bigproject.R;

public class HomeFragment extends Fragment
{
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Button siji = root.findViewById(R.id.button_siji);
        Button liuji = root.findViewById(R.id.button_liuji);
        Button xinxi = root.findViewById(R.id.button_xinxi);
        Button kaoyan = root.findViewById(R.id.button_kaoyan);
        Button jiaozi = root.findViewById(R.id.button_jiaozi);
        Button erji = root.findViewById(R.id.button_erji);
        Button tuofu = root.findViewById(R.id.button_tuofu);
        Button yasi = root.findViewById(R.id.button_yasi);
        Button mandrain = root.findViewById(R.id.button_mandrain);
        Button zhuanye = root.findViewById(R.id.button_zhuanye);
        Button zhengshu = root.findViewById(R.id.button_zhengshu);
        Button xianzhi = root.findViewById(R.id.button_xianzhi);

        siji.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), siji.class);
                startActivity(intent);
            }
        });

        liuji.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), liuji.class);
                startActivity(intent);
            }
        });

        xinxi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), xinxi.class);
                startActivity(intent);
            }
        });

        //其他
        kaoyan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        erji.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        yasi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        tuofu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        mandrain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        zhuanye.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        zhengshu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        xianzhi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        jiaozi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), todoactivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
