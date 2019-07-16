package com.petersamuel.alc40;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_action_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        profileDetails();
    }

   private void profileDetails(){

       ImageView imageProfile = (ImageView) findViewById(R.id.image_profile);
       imageProfile.setMaxHeight(10);
       imageProfile.setMaxWidth(5);

       TextView textName = (TextView) findViewById(R.id.text_name);
       textName.setText("Peter Samuel");

       TextView textTrack = (TextView) findViewById(R.id.text_view_track);
       textTrack.setText("Android");

       TextView textCountry = (TextView) findViewById(R.id.text_view_country);
       textCountry.setText("Kenya");

       TextView textEmail = (TextView) findViewById(R.id.text_view_email);
       textEmail.setText("petersamuelsam6@gmail.com");

       TextView textPhoneNO = (TextView) findViewById(R.id.text_view_phonenumber);
       textPhoneNO.setText("0706209779");

    }

}
