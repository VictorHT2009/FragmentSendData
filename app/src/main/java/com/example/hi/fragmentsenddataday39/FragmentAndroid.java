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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android,container,false);

        Bundle bundle =getArguments();
        String chuoi = bundle.getString("Chuoi");
        Integer number = bundle.getInt("number");
        Log.d("BBB",chuoi + ":" + number);
        return view;
    }
}
