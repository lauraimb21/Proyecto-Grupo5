package co.edu.unab.wilmer.laura.sintomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import co.edu.unab.wilmer.laura.sintomapp.entity.Categoria;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.i("onCreate", "ok MenuActivity");
        setContentView(R.layout.activity_menu);
        String user = getIntent().getStringExtra("User name");

        ArrayList<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria("Estudiante", "estudiante", "estudiante"));
        categorias.add(new Categoria("profesor", "profesor", "profesor"));


        String[] datos = {"Estudiante", "Profesor"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_checked,
                datos
        );

        final ListView Lista = findViewById(R.id.lista);
        Lista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        Lista.setAdapter(adapter);

       /* Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = (String) Lista.getItemAtPosition(pos);
                Toast.makeText(getApplicationContext(), valor, Toast.LENGTH_SHORT).show();
            }
        });*/



    /*@Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "ok MenuActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "ok MenuActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "ok MenuActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "ok MenuActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "ok MenuActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "ok MenuActivity");
    }*/


    }
}