package com.example.bigproject.ui.hot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bigproject.R;

import java.util.ArrayList;
import java.util.List;

public class hotFragment extends Fragment
{
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ListView hotlistview = root.findViewById(R.id.hot_listview);
        List<hotlistuser> list = new ArrayList<>(12);

        int resId1 = getResources().getIdentifier("i1", "drawable", "com.example.bigproject");
        int resId11 = getResources().getIdentifier("siji1", "drawable", "com.example.bigproject");
        hotlistuser u1 = new hotlistuser(resId1, "女王陛下 英王室", "迎接新十年 英王室发布女王和3名继承人肖像照(图)", resId11);
        list.add(u1);

        int resId2 = getResources().getIdentifier("i2", "drawable", "com.example.bigproject");
        int resId21 = getResources().getIdentifier("siji2", "drawable", "com.example.bigproject");
        hotlistuser u2 = new hotlistuser(resId2, "柬埔寨 白马省 洪森", "柬埔寨塌楼事故已致7死18伤 洪森表示全力救援", resId21);//com.example.bigproject
        list.add(u2);

        int resId3 = getResources().getIdentifier("i3", "drawable", "com.example.bigproject");
        int resId31 = getResources().getIdentifier("siji3", "drawable", "com.example.bigproject");
        hotlistuser u3 = new hotlistuser(resId3, "土耳其 殖民 利比亚", "土“殖民”利比亚 利首都机场附近当晚遭火箭弹持续袭击", resId31);//com.example.bigproject
        list.add(u3);

        int resId4 = getResources().getIdentifier("i4", "drawable", "com.example.bigproject");
        int resId41 = getResources().getIdentifier("siji4", "drawable", "com.example.bigproject");
        hotlistuser u4 = new hotlistuser(resId4, "电子 客票 购票", "电子客票刷脸三秒进站", resId41);//com.example.bigproject
        list.add(u4);

        int resId5 = getResources().getIdentifier("i5", "drawable", "com.example.bigproject");
        int resId51 = getResources().getIdentifier("siji5", "drawable", "com.example.bigproject");
        hotlistuser u5 = new hotlistuser(resId5, "美国 暗杀 伊朗", "美国暗杀得手 特朗普更新推特只发了一张美国国旗", resId51);//com.example.bigproject
        list.add(u5);

        int resId6 = getResources().getIdentifier("i6", "drawable", "com.example.bigproject");
        int resId61 = getResources().getIdentifier("siji6", "drawable", "com.example.bigproject");
        hotlistuser u6 = new hotlistuser(resId6, "戈恩 帮凶 伪造", "戈恩出逃帮凶浮出水面！飞机租赁公司员工伪造记录", resId61);//com.example.bigproject
        list.add(u6);

        int resId7 = getResources().getIdentifier("i7", "drawable", "com.example.bigproject");
        int resId71 = getResources().getIdentifier("siji7", "drawable", "com.example.bigproject");
        hotlistuser u7 = new hotlistuser(resId7, "澳门大学 澳门高校 祖国", "澳门话剧《苦尽甘来》内地巡演 导演：我们因祖国而自豪", resId71);//com.example.bigproject
        list.add(u7);

        int resId8 = getResources().getIdentifier("i8", "drawable", "com.example.bigproject");
        int resId81 = getResources().getIdentifier("siji8", "drawable", "com.example.bigproject");
        hotlistuser u8 = new hotlistuser(resId8, "制造业 美国 收缩", "美国制造业连续5个月收缩", resId81);//com.example.bigproject
        list.add(u8);

        int resId9 = getResources().getIdentifier("i9", "drawable", "com.example.bigproject");
        int resId91 = getResources().getIdentifier("siji9", "drawable", "com.example.bigproject");
        hotlistuser u9 = new hotlistuser(resId9, "澳大利亚 山火 墨尔本", "澳大利亚山火致墨尔本空气质量下降", resId91);//com.example.bigproject
        list.add(u9);

        int resId10 = getResources().getIdentifier("i10", "drawable", "com.example.bigproject");
        int resId101 = getResources().getIdentifier("siji10", "drawable", "com.example.bigproject");
        hotlistuser u10 = new hotlistuser(resId10, "甘肃 定西 渭源", "甘肃渭源雾凇美不胜收", resId101);//com.example.bigproject
        list.add(u10);

        int resId111 = getResources().getIdentifier("i11", "drawable", "com.example.bigproject");
        int resId1111 = getResources().getIdentifier("siji11", "drawable", "com.example.bigproject");
        hotlistuser u11 = new hotlistuser(resId111, "核心价值观 文化建设", "【中国稳健前行】以社会主义核心价值观引领文化建设", resId1111);//com.example.bigproject
        list.add(u11);

        hotlistAdapter adapter = new hotlistAdapter(getActivity(), list);
        hotlistview.setAdapter(adapter);

        return root;
    }
}
