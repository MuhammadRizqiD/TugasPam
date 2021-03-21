package com.example.tugaspam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edE,edP;
    Button btn;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edE = findViewById(R.id.edEmail);
        edP = findViewById(R.id.edPassword);
        btn = findViewById(R.id.btSignin);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nama = edE.getText().toString();
                password = edP.getText().toString();

                String email = "dama@mail.com";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Wajib Di Isi", Toast.LENGTH_LONG);
                    t.show();

                }else{
                    if(nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(),ActivityHasil.class);
                        i.putExtras(b);
                        startActivity(i);
                    }else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
//                check();

        });
    }

//    public void check() {
//        if (edE.getText().toString().equals("admin@email.com") &&
//            edP.getText().toString().equals("yudis"))
//        {
//            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
//        }
//        else if (edE.getText().toString().equals("admin@email.com"))
//        {
//            Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show();
//        }
//        else if (edP.getText().toString().equals("yudis"))
//        {
//            Toast.makeText(this, "Email Salah", Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            Toast.makeText(this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
//        }
//    }
}