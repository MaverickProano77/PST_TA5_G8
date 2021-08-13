package com.example.ta5_g8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {
    private EditText txtusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        txtusuario = (EditText)findViewById(R.id.txtUsuario);
    }
    public void Registrarse(View v) {
        Intent intent = new Intent(this, RegistroUsuario.class);
        startActivity(intent);
    }
    public void Perfil(View v) {
        Intent intent = new Intent(this, Perfil.class);
        //intent.putExtra("usuario",txtusuario.getText().toString());
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getReadableDatabase();
        String cod = txtusuario.getText().toString();
        intent.putExtra("usuario",cod);
        Cursor fila = bd.rawQuery(
                "select contrasena,nombres,apellidos,correo,celular from usuario where user like '"+cod+"'" , null);
        if (fila.moveToFirst()) {
            intent.putExtra("Nombres",fila.getString(1));
            intent.putExtra("Apellidos",fila.getString(2));
            intent.putExtra("Correo",fila.getString(3));
            intent.putExtra("Celular",fila.getString(4));
            Toast.makeText(this, "Ingreso exitoso",
                    Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "No existe dicho usuario",
                    Toast.LENGTH_SHORT).show();
        bd.close();
        startActivity(intent);
    }
}