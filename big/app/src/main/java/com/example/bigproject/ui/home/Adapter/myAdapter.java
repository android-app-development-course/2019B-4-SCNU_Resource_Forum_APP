package com.example.bigproject.ui.home.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Bean.dataBean;
import com.example.bigproject.ui.home.Bean.dataBean2;
import com.example.bigproject.ui.home.xinxi_huitie;

import java.util.List;
import java.util.Objects;

public class myAdapter extends ArrayAdapter
{
    private final int ImageId;

    public myAdapter(Context context, int headImage, List<dataBean> obj)
    {
        super(context, headImage, obj);
        ImageId = headImage;//这个是传入我们自己定义的界面
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent)
    {
        dataBean myBean = (dataBean) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(ImageId, parent, false);//这个是实例化一个我们自己写的界面Item

        LinearLayout linearLayout = view.findViewById(R.id.ll_view);
        ImageView headImage = view.findViewById(R.id.headimage);
        final TextView headText = view.findViewById(R.id.headtext);
        Button huitie = view.findViewById(R.id.huitie);
        final TextView content = view.findViewById(R.id.content);

        headImage.setImageResource(Objects.requireNonNull(myBean).getImageID());
        headText.setText(myBean.getTitle());
        content.setText(myBean.getContext());
        linearLayout.setOnClickListener(new OnClickListener() //检查哪一项被点击了
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getContext(), "你点击了第" + (position + 1) + "项，请按回帖进入", Toast.LENGTH_SHORT).show();
            }
        });

        //转跳到回帖
        huitie.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(parent.getContext(), xinxi_huitie.class);
                dataBean2 dtb2 = new dataBean2(headText.getText().toString(), content.getText().toString());
                intent.putExtra("dtb2", dtb2);
                parent.getContext().startActivity(intent);
            }
        });

        return view;
    }
}
