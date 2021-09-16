package com.example.biodatasederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openPhone(View passedView){
        Uri callNumber=Uri.parse("tel:0811222333444");
        Intent callIntent=new Intent(Intent.ACTION_DIAL,callNumber);
        startActivity(callIntent);
    }

//    public void numberToPhonePackage(View view){
//        Intent intent=getPackageManager().getLaunchIntentForPackage("com.google.android.dialer");
//        intent.setAction(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_TEXT,"085156967023");
//        intent.setType("text/plain");
//        startActivity(intent);
//    }

    public void openGmail(View passedView){
        Uri tujuanEmail=Uri.parse("mailto:111201912342@mhs.dinus.ac.id");
        Intent callIntent=new Intent(Intent.ACTION_SENDTO,tujuanEmail);
        startActivity(callIntent);


    }
    public void openGmaps(View view){
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
