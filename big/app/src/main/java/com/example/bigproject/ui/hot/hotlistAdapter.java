package com.example.bigproject.ui.hot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigproject.R;

import java.util.List;

public class hotlistAdapter extends BaseAdapter
{
    private List<hotlistuser> list;
    private LayoutInflater minflater;

    hotlistAdapter(Context contex, List<hotlistuser> list)
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
        View layout = minflater.inflate(R.layout.hotlist_item, null);
        ImageView ivhead_picture = layout.findViewById(R.id.head_picture);
        TextView tvknickname = layout.findViewById(R.id.knickname);
        TextView tvcontent = layout.findViewById(R.id.content);
        ImageView ivcontent_picture = layout.findViewById(R.id.content_picture);

        hotlistuser u = list.get(position);
        ivhead_picture.setImageResource(u.getHead_picture());
        tvknickname.setText(u.getKinckname());
        tvcontent.setText(u.getContent());
        ivcontent_picture.setImageResource(u.getContent_picture());
        return layout;
    }
}
