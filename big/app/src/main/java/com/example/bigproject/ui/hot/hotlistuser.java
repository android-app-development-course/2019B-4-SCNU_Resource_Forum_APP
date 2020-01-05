package com.example.bigproject.ui.hot;

public class hotlistuser
{
    private int head_picture;
    private String knickname;
    private String content;
    private int content_picture;

    hotlistuser(int head_picture, String knickname, String content, int content_picture)
    {
        this.head_picture = head_picture;
        this.knickname = knickname;
        this.content = content;
        this.content_picture = content_picture;
    }

    int getHead_picture()
    {
        return head_picture;
    }

    String getKinckname()
    {
        return knickname;
    }

    public String getContent()
    {
        return content;
    }

    int getContent_picture()
    {
        return content_picture;
    }
}
