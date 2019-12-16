package com.dds.anyndk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class OpenSSLActivity extends AppCompatActivity {

    private TextView text;
    private StringBuilder sb;

    public static void openActivity(AppCompatActivity activity) {
        Intent intent = new Intent(activity, OpenSSLActivity.class);
        activity.startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_ssl);
        text = findViewById(R.id.text);
    }

    public void generateRandom(View view) {

    }

    private int msgCode;
    private String msg;



    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Bean_ActivityShow{" +
                "msgCode=" + msgCode +
                ", msg='" + msg + '\'' +
                '}';
    }

    private int openType;//1 — 空闲开门  2 — 呼叫开门  3 — 监控开门
    private int numOfRoom;//表示业主拥有的房间数
    private List<String> rooms;//表示业主拥有的房间ID（楼栋+单元+房号）列表，如：["001010203","001020801"]
    private String userId;//用于设备上报通行记录

    public int getOpenType() {
        return openType;
    }

    public void setOpenType(int openType) {
        this.openType = openType;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
