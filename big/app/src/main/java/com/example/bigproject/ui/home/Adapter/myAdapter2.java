package com.example.bigproject.ui.home.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Bean.dataBean2;

import java.util.List;
import java.util.Objects;

public class myAdapter2 extends ArrayAdapter
{
    private final int ImageId;

    public myAdapter2(Context context, int headImage, List<dataBean2> obj)
    {
        super(context, headImage, obj);
        ImageId = headImage; //这个是传入我们自己定义的界面
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent)
    {
        dataBean2 myBean = (dataBean2) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(ImageId, parent, false); //这个是实例化一个我们自己写的界面Item

        TextView headText = view.findViewById(R.id.headtext);
        TextView content = view.findViewById(R.id.content);

        headText.setText(Objects.requireNonNull(myBean).getTitle());
        content.setText(myBean.getContext());

        return view;
    }
}
