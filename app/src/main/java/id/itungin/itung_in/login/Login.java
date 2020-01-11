package id.itungin.itung_in.login;

import androidx.appcompat.app.AppCompatActivity;
import id.itungin.itung_in.MainActivity;
import id.itungin.itung_in.R;
import id.itungin.itung_in.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    SessionManager session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        session = new SessionManager(getApplicationContext());



        TextView goregister = (TextView) findViewById(R.id.pndhregister);

        goregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, register.class);
                startActivity(i);
            }
        });

        txtUsername = (EditText) findViewById(R.id.edt_username);
        txtPassword = (EditText) findViewById(R.id.edt_password);

        Button gomain = (Button) findViewById(R.id.btnLogin);

        gomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin")){

                    session.createLoginSession("Miraz","miraz@gmail.com");
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Toast.makeText(Login.this,"Login gagal ",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
