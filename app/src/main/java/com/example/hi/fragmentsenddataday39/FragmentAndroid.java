package com.example.hi.fragmentsenddataday39;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentAndroid extends Fragment{

    View view;
    EditText edtAndroid;
    Button btnAndroid;
    Listen listen;
         //Neu ta muon chuyen 1 du lieu tu class nay qua class khac thi ta se tao ra 1 phuong thuc va sau do goi tu class can goi
//    String chuoi = "";
//    int number = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android,container,false);
        edtAndroid = view.findViewById(R.id.edittextAndroid);
        btnAndroid = view.findViewById(R.id.buttonAndroid);
        //Khi moi goi listen thi listen o day la 1 Interface dc gan voi 1 Interface o Interface "Listen"
//        MainActivity.Listen = FragmentAndroid.Listen: day la y nghia cua dong phia duoi
        listen = (Listen) getActivity();
        //Cach 1: Su dung Bundle khi Fragment chua duoc khoi tao
//        Bundle bundle =getArguments();
//        String chuoi = bundle.getString("Chuoi");
//        Integer number = bundle.getInt("number");
//        Log.d("BBB",chuoi + ":" + number);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi = edtAndroid.getText().toString();
                listen.ReceiveData(chuoi,1);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }
    //Cach 2: Dung phuong thuc SetData de lay du lieu tu MainActivity
//    public void SetData(String Chuoi, int so){
//        chuoi = Chuoi;
//        number = so;
//        Log.d("BBB",chuoi + number);
//    }
}
