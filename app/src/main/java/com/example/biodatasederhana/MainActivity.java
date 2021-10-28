package com.example.biodatasederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button setMaps, setPhone, setEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan button di xml dengan logic di java
        setMaps=findViewById(R.id.mapsBtn);
        setEmail=findViewById(R.id.emailBtn);
        setPhone=findViewById(R.id.kontakButton);

        //set onclicklistener untuk tiap button
        setMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmaps();
            }
        });

        setPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhone();
            }
        });

        setEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmail();
            }
        });
    }

    //fungsi untuk membuka phone app
    //menggunakan Implicit Intent
    public void openPhone(){
        Uri callNumber=Uri.parse("tel:0811222333444");
        Intent callIntent=new Intent(Intent.ACTION_DIAL,callNumber);
        startActivity(callIntent);
    }

    //fungsi untuk membuka email app
    //menggunakan Implicit Intent
    public void openGmail(){
        Uri tujuanEmail=Uri.parse("mailto:111201912342@mhs.dinus.ac.id");
        String subjek="coba email";
        Intent callIntent=new Intent(Intent.ACTION_SENDTO,tujuanEmail);
        startActivity(callIntent);

    }

    //fungsi untuk membuka mail apps
    //menggunakan Implicit Intent
    public void openGmaps(){
        //z adalah level zoom. paling tinggi nilainya=23
        String latnLong="@-7.0258396,110.4697273,15z";
        String location="Pedurungan+Kidul,+Kec.+Pedurungan,+Kota+Semarang,+Jawa+Tengah";
        // Map point based on address
        Uri locations = Uri.parse("geo:-7.0258396,110.4697273?q=Pedurungan+Kidul,+Kec.+Pedurungan,+Kota+Semarang,+Jawa+Tengah");
        // Or map point based on latitude/longitude
        //Uri locationz = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
        Intent intentPeta = new Intent(Intent.ACTION_VIEW, locations);
        startActivity(intentPeta);
    }

        //mencoba menggunakan explicit Intent
//    public void numberToPhonePackage(View view){
//        Intent intent=getPackageManager().getLaunchIntentForPackage("com.google.android.dialer");
//        intent.setAction(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_TEXT,"085156967023");
//        intent.setType("text/plain");

//        startActivity(intent);
//    }
//    public void gmailPackage(View view){
//        String[] tujuan={
//                "111201912342@mhs.dinus.ac.id",
//        };
//        String judulEmail="percobaan 1 membuka gmail";
//        Intent callIntent=new Intent(Intent.ACTION_SENDTO);
//        callIntent.setData(Uri.parse("mailto:"));
//        callIntent.putExtra(Intent.EXTRA_EMAIL,tujuan);
//        callIntent.putExtra(Intent.EXTRA_SUBJECT,"percobaan 1 membuka gmail");
////        callIntent.putExtra(Intent.EXTRA_TEXT,"halo! ini adalah percoban membuka gmail");
//        if (callIntent.resolveActivity(getPackageManager())!=null){
//            startActivity(callIntent);
//        }
//    }

}
