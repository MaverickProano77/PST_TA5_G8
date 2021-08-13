package com.example.ta5_g8;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroUsuario extends AppCompatActivity {
    private EditText txtNombres, txtApellidos, txtCorreo, txtCelular, txtUsuario, txtContrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        txtNombres=findViewById(R.id.edtNombres);
        txtApellidos=(EditText)findViewById(R.id.edtApellidos);
        txtCorreo=(EditText)findViewById(R.id.edtCorreo);
        txtCelular=(EditText)findViewById(R.id.edtCelular);
        txtUsuario=(EditText)findViewById(R.id.edtUsuario);
        txtContrasena=(EditText)findViewById(R.id.edtContrasena);
    }
    public void registro(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String nom = txtNombres.getText().toString();
        String ape = txtApellidos.getText().toString();
        String cor = txtCorreo.getText().toString();
        String cel = txtCelular.getText().toString();
        String usu = txtUsuario.getText().toString();
        String contra = txtContrasena.getText().toString();
        bd.execSQL("insert into usuario (user, contrasena, nombres, apellidos, correo, celular) values ('"+usu+"','"+contra+"','"+nom+"','"+ape+"','"+cor+"','"+cel+"')");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtCelular.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
        Toast.makeText(this, "Se cargaron sus datos",
                Toast.LENGTH_SHORT).show();
    }
    public void Regresar(View v){
        finish();
    }
}