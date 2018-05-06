package com.example.android.little_lambs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button aboutTitle, contact, donate, howToHelp;
    LinearLayout about, contactInfo, help, donateInfo;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutTitle = findViewById(R.id.about_title);

        contact = findViewById(R.id.contact);

        donate = findViewById(R.id.donate);

        howToHelp = findViewById(R.id.how_to_help);

        contactInfo = findViewById(R.id.contact_info);
        about = findViewById(R.id.about);
        help = findViewById(R.id.help);
        donateInfo = findViewById(R.id.donate_info);


    }

    /*
        method to toggle view visibility
     */
    public void toggleVisibility(View v) {
        switch (v.getId()) {
            case R.id.about_title:
                if (b1 == 0) {
                    about.setVisibility(View.VISIBLE);
                    b1 = 1;
                } else {
                    about.setVisibility(View.GONE);
                    b1 = 0;
                }
                break;
            case R.id.contact:
                if (b2 == 0) {
                    contactInfo.setVisibility(View.VISIBLE);
                    b2 = 1;
                } else {
                    contactInfo.setVisibility(View.GONE);
                    b2 = 0;
                }
                break;
            case R.id.donate:
                if (b3 == 0) {
                    donateInfo.setVisibility(View.VISIBLE);
                    b3 = 1;
                } else {
                    donateInfo.setVisibility(View.GONE);
                    b3 = 0;
                }
                break;
            case R.id.how_to_help:
                if (b4 == 0) {
                    help.setVisibility(View.VISIBLE);
                    b4 = 1;
                } else {
                    help.setVisibility(View.GONE);
                    b4 = 0;
                }
                break;
        }
    }

}
