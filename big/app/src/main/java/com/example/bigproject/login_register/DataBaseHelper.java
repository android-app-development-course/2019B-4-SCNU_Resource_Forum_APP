package com.example.bigproject.login_register;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper
{
    private static String name = "user.db";
    private static int dbVersion = 1;

    public DataBaseHelper(Context context)
    {
        super(context, name, null, dbVersion);
    }

    //只在创建的时候用一次
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table user(id integer primary key autoincrement,username varchar(255),password varchar(255))");
        db.execSQL("create table siji(id integer ,knickname varchar(255),title varchar(255),content text,date varchar(255));");
        db.execSQL("create table liuji(id integer ,knickname varchar(255),title varchar(255),content text,date varchar(255));");

        db.execSQL("create table tiezi(title varchar(255),content text);");
        db.execSQL("insert into tiezi values('大林寺桃花','人间四月芳菲尽，山寺桃花始盛开。长恨春归无觅初，不知转入此中来。')");
        db.execSQL("insert into tiezi values('孩子·父母·游戏','成人想告诉孩子一些道理 最好的方式是“玩给他看')");
        db.execSQL("insert into tiezi values('湿地·植物·生态文明','【生态文明@湿地】“湿”意松江 绿韵冰城')");
        db.execSQL("insert into tiezi values('大家庭·慰问·老战士','在慰问中感受“大家庭”温暖')");
        db.execSQL("insert into tiezi values('最后一棒','【彩云网评】聚力跑赢脱贫攻坚“最后一棒”')");
        db.execSQL("insert into tiezi values('长征五号·初心·嫦娥','【地评线】秦平：厚植红色基因，走好新时代长征路')");

        db.execSQL("create table wenjian(id integer  ,filename varchar(255));");
        db.execSQL("insert into wenjian values(1,'2011年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2012年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2013年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2014年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2015年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2016年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2017年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2018年四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2019年四六级真题.docx')");

        db.execSQL("insert into siji values(1,'测试者1','标题1','测试者1的内容','2019-12-1')");
        db.execSQL("insert into siji values(2,'测试者2','标题2','测试者2的内容','2019-12-2')");
        db.execSQL("insert into siji values(3,'测试者3','标题3','测试者3的内容','2019-12-3')");
        db.execSQL("insert into siji values(4,'测试者4','标题4','测试者4的内容','2019-12-4')");
        db.execSQL("insert into siji values(5,'测试者5','标题5','测试者5的内容','2019-12-5')");
        db.execSQL("insert into siji values(6,'测试者6','标题6','测试者6的内容','2019-12-6')");
        db.execSQL("insert into siji values(7,'测试者7','标题7','测试者7的内容','2019-12-7')");
        db.execSQL("insert into siji values(8,'测试者8','标题8','测试者8的内容','2019-12-8')");
        db.execSQL("insert into siji values(9,'测试者9','标题9','测试者9的内容','2019-12-9')");
        db.execSQL("insert into siji values(10,'测试者10','标题10','测试者10的内容','2019-12-10')");

        db.execSQL("insert into liuji values(1,'测试者1','标题1','测试者1的内容','2019-12-1')");
        db.execSQL("insert into liuji values(2,'测试者2','标题2','测试者2的内容','2019-12-2')");
        db.execSQL("insert into liuji values(3,'测试者3','标题3','测试者3的内容','2019-12-3')");
        db.execSQL("insert into liuji values(4,'测试者4','标题4','测试者4的内容','2019-12-4')");
        db.execSQL("insert into liuji values(5,'测试者5','标题5','测试者5的内容','2019-12-5')");
        db.execSQL("insert into liuji values(6,'测试者6','标题6','测试者6的内容','2019-12-6')");
        db.execSQL("insert into liuji values(7,'测试者7','标题7','测试者7的内容','2019-12-7')");
        db.execSQL("insert into liuji values(8,'测试者8','标题8','测试者8的内容','2019-12-8')");
        db.execSQL("insert into liuji values(9,'测试者9','标题9','测试者9的内容','2019-12-9')");
        db.execSQL("insert into liuji values(10,'测试者10','标题10','测试者10的内容','2019-12-10')");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
