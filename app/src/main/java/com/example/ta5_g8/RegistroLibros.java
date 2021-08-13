package com.example.ta5_g8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroLibros extends AppCompatActivity {
    private TextView txtperfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_libros);
        txtperfil = (TextView)findViewById(R.id.txtPerfilL);
        String per = getIntent().getStringExtra("usuarioL");
        txtperfil.setText(per);
    }
}