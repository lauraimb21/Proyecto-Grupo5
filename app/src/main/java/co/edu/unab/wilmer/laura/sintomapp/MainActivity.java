package co.edu.unab.wilmer.laura.sintomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener eventoClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Bienvenid@", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);

        }
    };



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.i("onCreate", "ok MainActivity");
        setContentView(R.layout.activity_main);
        Button btnInicio = findViewById(R.id.btninicio);
        Button btnCrear = findViewById(R.id.btncrear);
        btnInicio.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Bienvenid@", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnInicio.setOnClickListener(eventoClick);
        btnCrear.setOnClickListener(eventoClick);
    }

    public void iniciarSesion (View resultado){
        EditText user = findViewById(R.id.txtUsername);
        EditText pass = findViewById(R.id.txtPassword);

        String username = user.getText().toString();
        String password = pass.getText().toString();

        Log.i("Validar Username:",username );
        Log.d("valor Password: ",password );

        if (username.equalsIgnoreCase("alex89") && password.equals("123")){
            Toast.makeText(getApplicationContext(), "Bienvenid@"+user.getText(), Toast.LENGTH_LONG).show();
        }else {
            user.setText(null);
            pass.setText(null);
        }



    }

    /*@Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Bienvenid@", Toast.LENGTH_SHORT).show();
    }*/

    /*@Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "ok MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "ok MainActivity");
    }


        @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "ok MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "ok MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "ok MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "ok MainActivity");
    }*/
}