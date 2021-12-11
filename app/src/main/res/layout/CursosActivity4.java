package co.edu.unab.wilmer.laura.sintomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CursosActivity4<string> extends AppCompatActivity {

    private int id;
    private string nombre;
    private string descripcion;

    public CursosActivity4(int contentLayoutId, string nombre) {
        super(contentLayoutId);
        this.nombre = nombre;
    }

    public CursosActivity4(string descripcion) {
        this.descripcion = descripcion;
    }

    public string getDescripcion() {
        return descripcion;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(string descripcion) {
        this.descripcion = descripcion;
    }

    public CursosActivity4(int id) {
        this.id = id;
    }

    public CursosActivity4() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos4);
    }
}