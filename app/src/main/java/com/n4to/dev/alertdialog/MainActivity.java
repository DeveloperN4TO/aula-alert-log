package com.n4to.dev.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {
        // Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // Configurar título e mensagem
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da Dialog");

        // Configurar cancelamento
        dialog.setCancelable(false);

        // configurar icone
        dialog.setIcon( android.R.drawable.sym_def_app_icon);

        // Configurar ações sim e não
        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        // Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }
}
