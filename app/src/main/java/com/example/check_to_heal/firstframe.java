package com.example.check_to_heal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
//https://www.geeksforgeeks.org/how-to-open-camera-through-intent-and-display-captured-image-in-android/
import androidx.appcompat.app.AppCompatActivity;

public class firstframe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.firstpage);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);
        ImageView login = (ImageView) findViewById(R.id.submit);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();
                if(email1.equals("admin") && password1.equals("admin"))
                {
                    Intent intent = new Intent(firstframe.this, dashboard.class);

                    startActivity(intent);

                }

            }
        });



    }

}
