package com.example.bigproject.ui.home.Bean;

import java.io.Serializable;

public class dataBean2 implements Serializable
{
    private String title; //标题
    private String context; //内容

    public dataBean2(String text1, String text2)
    {
        this.title = text1;
        this.context = text2;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String text)
    {
        this.title = text;
    }

    public String getContext()
    {
        return context;
    }

    public void setContext(String text)
    {
        context = text;
    }
}
