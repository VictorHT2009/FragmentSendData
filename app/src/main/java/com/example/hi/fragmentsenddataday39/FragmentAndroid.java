package com.example.hi.fragmentsenddataday39;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentAndroid extends Fragment{

    View view;
         //Neu ta muon chuyen 1 du lieu tu class nay qua class khac thi ta se tao ra 1 phuong thuc va sau do goi tu class can goi
//    String chuoi = "";
//    int number = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android,container,false);
            //Cach 1: Su dung Bundle khi Fragment chua duoc khoi tao
//        Bundle bundle =getArguments();
//        String chuoi = bundle.getString("Chuoi");
//        Integer number = bundle.getInt("number");
//        Log.d("BBB",chuoi + ":" + number);
        return view;
    }
        //Dung phuong thuc SetData de chuyen du lieu
//    public void SetData(String Chuoi, int so){
//        chuoi = Chuoi;
//        number = so;
//        Log.d("BBB",chuoi + number);
//    }
}
