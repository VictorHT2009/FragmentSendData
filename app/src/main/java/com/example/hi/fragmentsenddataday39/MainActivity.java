package com.example.hi.fragmentsenddataday39;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Listen{

    FragmentManager fragmentManager = getSupportFragmentManager();
    Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = findViewById(R.id.buttonMain);

        //MainActivity gui du lieu qua cho Fragment
            //Cach 1: dung Bundle khi Fragment chua duoc khoi tao
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        FragmentAndroid fragmentAndroid = new FragmentAndroid();
//
//        //Tao Bundle
//        Bundle bundle= new Bundle();
//        bundle.putString("Chuoi","Chao Fragment Android");
//        bundle.putInt("number",30);
//
//        fragmentAndroid.setArguments(bundle);
//        fragmentTransaction.replace(R.id.relativeMain,fragmentAndroid);
//        fragmentTransaction.commit();

            //Cach 2: Fragment da khoi tao roi


//        btnMain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentAndroid fragmentAndroid = (FragmentAndroid) fragmentManager.findFragmentById(R.id.fragmentAndroid);
//                if (fragmentAndroid != null){
//                    TextView txtAndroid = fragmentAndroid.view.findViewById(R.id.textviewTitleAndroid);
//                    txtAndroid.setText("Main da setText cho Android");
//                }
                    //chuyen du lieu tu MainActivity qua Fragment theo phuong thuc SetData
//                if (fragmentAndroid != null){
//                    fragmentAndroid.SetData("Chao Main",1);
//                }
//            }
//        });
    }

    public void ReceiveData(String chuoi, int so){
        Log.d("BBB",chuoi+so);
    }
}
