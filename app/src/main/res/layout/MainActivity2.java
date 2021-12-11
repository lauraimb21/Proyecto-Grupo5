package co.edu.unab.wilmer.laura.sintomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {


    private View txtNombre;
    private View txtApellido;
    private View txtPrograma;
    private View txtBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtPrograma = findViewById(R.id.txtPrograma);
        txtBienvenido = findViewById(R.id.txtBienvenido);
        Button btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnLongClickListener(new View.OnLongClickListener() {


            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Bienvenid@", Toast.LENGTH_SHORT).show();
                return false;

            }
        });

        android.view.View.OnClickListener eventoClick;
        eventoClick = null;
        btnGuardar.setOnClickListener(eventoClick);

        }}



    
