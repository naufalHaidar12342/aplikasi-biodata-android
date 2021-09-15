package com.example.biodatasederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private BiodataAdapter panggilAdapter;
    private ArrayList<BiodataProperti> tampungData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        getData();
        rv=findViewById(R.id.viewDataku);
        panggilAdapter=new BiodataAdapter(tampungData);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(MainActivity.this);

        rv.setLayoutManager(layoutManager);
        rv.setAdapter(panggilAdapter);

    }
    public void getData(){
        tampungData=new ArrayList<>();
        tampungData.add(new BiodataProperti(
                "Naufal Haidar",
                "A11.2019.12342",
                "Mahasiswa",
                "Nonton youtube",
                "zebra",
                "080989999",
                "naufal@gmail.com")
        );

    }
}