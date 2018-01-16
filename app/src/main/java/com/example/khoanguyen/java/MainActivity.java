package com.example.khoanguyen.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SinhVien sinhVien = new SinhVien();
        sinhVien.HoTen = " Nguyễn Đăng Khoa";
        sinhVien.DiaChi = " 168 Hoang Dieu";
        sinhVien.Namsinh = 1994;

        SinhVien sinhVien2 = new SinhVien();
        sinhVien2.HoTen = " Đỗ thị tường vi";
        sinhVien2.DiaChi = " phan thanh";
        sinhVien2.Namsinh = 1995;

        Toast.makeText(this, sinhVien.HoTen+"-"+sinhVien.DiaChi+"-"+sinhVien.Namsinh+sinhVien2.HoTen+"-"+sinhVien2.DiaChi+"-"+sinhVien2.Namsinh, Toast.LENGTH_SHORT).show();
    }
}
