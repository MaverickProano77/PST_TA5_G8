package com.example.ta5_g8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    private TextView txtnombres,txtapellidos,txtcorreo,txtcelular,txtusuario;
    String cod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        txtnombres = (TextView)findViewById(R.id.txtNombres);
        txtapellidos = (TextView)findViewById(R.id.txtApellidos);
        txtcorreo = (TextView)findViewById(R.id.txtCorreo);
        txtcelular = (TextView)findViewById(R.id.txtCelular);
        //cod = getIntent().getStringExtra("usuario");
        /*AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getReadableDatabase();
        Cursor fila = bd.rawQuery(
                "select contrasena,nombres,apellidos,correo,celular from usuario where user '"+cod+"'" , null);
        if (fila.moveToFirst()) {
            txtnombres.setText(fila.getString(1));
            txtapellidos.setText(fila.getString(2));
            txtcorreo.setText(fila.getString(3));
            txtcelular.setText(fila.getString(4));
            Toast.makeText(this, "Ingreso exitosa",
                    Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "No existe dicho usuario",
                    Toast.LENGTH_SHORT).show();
        bd.close();*/


        cod = getIntent().getStringExtra("Nombres");
        txtnombres = (TextView)findViewById(R.id.txtNombres);
        txtapellidos = (TextView)findViewById(R.id.txtApellidos);
        txtcorreo = (TextView)findViewById(R.id.txtCorreo);
        txtcelular = (TextView)findViewById(R.id.txtCelular);
        txtusuario = (TextView)findViewById(R.id.textPerfil);
        String nombres = getIntent().getStringExtra("Nombres");
        String apellidos = getIntent().getStringExtra("Apellidos");
        String correo = getIntent().getStringExtra("Correo");
        String celular = getIntent().getStringExtra("Celular");
        String user = getIntent().getStringExtra("usuario");
        txtnombres.setText("Nombres: "+nombres);
        txtapellidos.setText("Apellidos: "+apellidos);
        txtcorreo.setText("Correo: "+correo);
        txtcelular.setText("Celular: "+celular);
        txtusuario.setText(user);
    }
    public void verLibros(View v){
        Intent intent = new Intent(this, RegistroLibros.class);
        intent.putExtra("usuarioL",cod);
        startActivity(intent);
    }
}