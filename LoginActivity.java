package com.example.amst8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText email, password;
    private Button loginBtn;
    private TextView forgetPassBtn,signupBtn;
    RecyclerView recyclerView;
    ArrayList<Peliculas> peliculasArrayList;
    Myadapter myadapter;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.editTextEmail);
        password=findViewById(R.id.editTextPassword);
        loginBtn= findViewById(R.id.buttonIngresar);
        forgetPassBtn = findViewById(R.id.forgetPassword);
        signupBtn = findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (datos_Validados()){
                    login();
                }
            }
        });
    }
    private boolean datos_Validados(){
        if(email.getText().toString().isEmpty()){
            email.setError("Ingrese un email");
            return false;
        }
        if (password.getText().toString().isEmpty()) {
            password.setError("Ingrese una contraseña");
            return false;
        }
        return true;
    }
    private void login(){

    }
    public void ingresar(View v){
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }
}