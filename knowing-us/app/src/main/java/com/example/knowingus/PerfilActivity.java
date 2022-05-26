package com.example.knowingus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class PerfilActivity extends AppCompatActivity {

    private GoogleSignInClient mGoogleSignInClient;
    Button btncerrar;
    ImageView imagenPerfil;
    TextView textoPerfil, textoCorreo,textoNombre;
    Uri fotoPerfil;
    String nombre,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
         ClassPerfil.account.getDisplayName();

         btncerrar  = findViewById(R.id.btncerrar);
         textoNombre = findViewById(R.id.IdNombrePerfil);
         textoCorreo = findViewById(R.id.IdCorreoPerfil);

         imagenPerfil = (ImageView ) findViewById(R.id.idImagenPerfil);

         nombre = ClassPerfil.account.getGivenName()+" "+ ClassPerfil.account.getFamilyName();

         correo = ClassPerfil.account.getEmail();
         fotoPerfil = ClassPerfil.account.getPhotoUrl();

         //imagenPerfil.setImageBitmap(ClassPerfil.account.getPhotoUrl());
        fotoPerfil = ClassPerfil.account.getPhotoUrl();
        imagenPerfil.setImageURI(fotoPerfil);
         textoNombre.setText(nombre);
         textoCorreo.setText(correo);

        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ClassPerfil.account.signOut();
                Toast.makeText(PerfilActivity.this, "Has serrado secion", Toast.LENGTH_SHORT).show();

            }
        });




    }


}
