package com.example.bigproject.ui.friend;

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

public class friendFragment extends Fragment
{
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_frend, container, false);

        ListView friendlistview = root.findViewById(R.id.frend_listview);
        List<friendlistuser> list = new ArrayList<>(15);

        int resId1 = getResources().getIdentifier("i1", "drawable", "com.example.bigproject");
        friendlistuser u1 = new friendlistuser(resId1, "寒冬 辣椒 河北", "辣椒红", "       6:00");
        list.add(u1);

        int resId2 = getResources().getIdentifier("i2", "drawable", "com.example.bigproject");
        friendlistuser u2 = new friendlistuser(resId2, "美国 暂时快乐 悲痛", "美国暂时的快乐将很快转化成悲痛 伊朗“圣城旅”新指挥官上任", "       7:00");
        list.add(u2);

        int resId3 = getResources().getIdentifier("i3", "drawable", "com.example.bigproject");
        friendlistuser u3 = new friendlistuser(resId3, "美国 情报部门 确切", "美情报部门掌握确切伊高级将领车队信息 火箭弹精准打击其座驾", "       8:00");
        list.add(u3);

        int resId4 = getResources().getIdentifier("i4", "drawable", "com.example.bigproject");
        friendlistuser u4 = new friendlistuser(resId4, "生态环境部 声明 形象大使", "生态环境部:从未授予过“中国环保形象大使”称号", "       9:00");
        list.add(u4);

        int resId5 = getResources().getIdentifier("i5", "drawable", "com.example.bigproject");
        friendlistuser u5 = new friendlistuser(resId5, "北京 通州 烟花", "2020年北京通州首例！一男子违规燃放烟花爆竹被拘留", "       10:00");
        list.add(u5);

        int resId6 = getResources().getIdentifier("i6", "drawable", "com.example.bigproject");
        friendlistuser u6 = new friendlistuser(resId6, "贪腐 走私 贩毒 特大地下钱庄案", "义乌一玩具公司一年流水百亿 涉黑涉恶涉贪 背后谁在撑腰？", "       11:00");
        list.add(u6);

        int resId7 = getResources().getIdentifier("i7", "drawable", "com.example.bigproject");
        friendlistuser u7 = new friendlistuser(resId7, "林火 撤离 澳大利亚", "澳大利亚林火形势严峻 军舰出动协助数千民众撤离", "       12:00");
        list.add(u7);

        int resId8 = getResources().getIdentifier("i8", "drawable", "com.example.bigproject");
        friendlistuser u8 = new friendlistuser(resId8, "取消 高速 省界", "取消高速省界收费站后个别地方货车通行费畸高 官方回应来了……", "       13:00");
        list.add(u8);

        int resId9 = getResources().getIdentifier("i9", "drawable", "com.example.bigproject");
        friendlistuser u9 = new friendlistuser(resId9, "长江流域实行最严格禁渔行动", "长江流域实行最严格禁渔行动 各部门加强渔民安置工作", "       14:00");
        list.add(u9);

        int resId10 = getResources().getIdentifier("i10", "drawable", "com.example.bigproject");
        friendlistuser u10 = new friendlistuser(resId10, "从严治党", "持之以恒纠治“四风”——全面从严治党纵深发展之“作风篇”", "       15:00");
        list.add(u10);

        int resId11 = getResources().getIdentifier("i11", "drawable", "com.example.bigproject");
        friendlistuser u11 = new friendlistuser(resId11, "治安管理处罚法 立法安排", "划重点！2020这些立法计划与你有关", "       16:00");
        list.add(u11);

        int resId12 = getResources().getIdentifier("i12", "drawable", "com.example.bigproject");
        friendlistuser u12 = new friendlistuser(resId12, "中央财政 18亿元 项目地区", "中央财政累计投入18亿元 项目地区癌症早诊率超80%", "       17:00");
        list.add(u12);

        int resId13 = getResources().getIdentifier("i13", "drawable", "com.example.bigproject");
        friendlistuser u13 = new friendlistuser(resId13, "白俄罗斯 石油制品 石油出口", "俄罗斯暂停向白俄罗斯出口石油", "       18:00");
        list.add(u13);

        int resId14 = getResources().getIdentifier("i14", "drawable", "com.example.bigproject");
        friendlistuser u14 = new friendlistuser(resId14, "对外支付 税务 备案", "我国实现对外支付税务备案电子化 每年将超6万家企业受益", "       18:00");
        list.add(u14);

        friendlistAdapter adapter = new friendlistAdapter(getActivity(), list);
        friendlistview.setAdapter(adapter);
        return root;
    }
}
