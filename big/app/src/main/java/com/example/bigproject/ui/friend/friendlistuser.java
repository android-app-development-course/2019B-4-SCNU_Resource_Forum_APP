package com.example.bigproject.ui.friend;

class friendlistuser
{
    private int friend_picture;
    private String friend_name;
    private String chat_content;
    private String message_time;

    friendlistuser(int friend_picture, String friend_name, String chat_content, String message_time)
    {
        this.friend_picture = friend_picture;
        this.friend_name = friend_name;
        this.chat_content = chat_content;
        this.message_time = message_time;
    }

    int getFriend_picture()
    {
        return friend_picture;
    }

    String getFriend_name()
    {
        return friend_name;
    }

    String getChat_content()
    {
        return chat_content;
    }

    String getMessage_time()
    {
        return message_time;
    }
}
