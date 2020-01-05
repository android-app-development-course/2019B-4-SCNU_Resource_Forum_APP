package com.example.bigproject.ui.friend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigproject.R;

import java.util.List;

public class friendlistAdapter extends BaseAdapter
{
    private List<friendlistuser> list;
    private LayoutInflater minflater;

    friendlistAdapter(Context contex, List<friendlistuser> list)
    {
        this.list = list;
        minflater = LayoutInflater.from(contex);
    }

    @Override
    public int getCount()
    {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View layout = minflater.inflate(R.layout.frendlist_item, null);
        ImageView ivhead_picture = layout.findViewById(R.id.friend_picture);
        TextView tvknickname = layout.findViewById(R.id.friend_name);
        TextView tvchatcontent = layout.findViewById(R.id.chat_content);
        TextView tvmessage_time = layout.findViewById(R.id.message_time);

        friendlistuser u = list.get(position);
        ivhead_picture.setImageResource(u.getFriend_picture());
        tvknickname.setText(u.getFriend_name());
        tvchatcontent.setText(u.getChat_content());
        tvmessage_time.setText(u.getMessage_time());
        return layout;
    }
}
