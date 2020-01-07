package id.itungin.itung_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tampil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        Button Back = (Button) findViewById(R.id.back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tampil.this, MainActivity.class);
                startActivity(i);
            }
        });


        Button Perhari = (Button) findViewById(R.id.button17);

        Perhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tampil.this, TampilPerHari.class);
                startActivity(i);
            }
        });
    }
}
