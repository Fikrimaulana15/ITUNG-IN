package id.itungin.itung_in;

import androidx.appcompat.app.AppCompatActivity;
import id.itungin.itung_in.login.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView gologin = (TextView) findViewById(R.id.pndhlogin);

        gologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, Login.class);
                startActivity(i);
            }
        });

        Button gomain = (Button) findViewById(R.id.btnLogin);

        gomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
