package co.edu.unab.wilmer.laura.sintomapp.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.unab.wilmer.laura.sintomapp.R;

public class categoriaAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Categoria> datos;

    public categoriaAdapter (Context context, ArrayList<Categoria> datos){
        this.context = context;
        this.datos =  datos;
        

    }


    @Override
    public int getCount() {
        if (this.datos==null){
            return 0;
            
        }else{
            return this.datos size();
        }
    }

    private void size() {
    }

    @Override
    public Object getItem(int position) {
        return this.datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view==null){
            view= LayoutInflater.from(context).inflate(R.Layout.itemlistas.viewGroup, false);

            TextView nombre = view.findViewById(R.id.txtProfesor);
            TextView descripcion = view.findViewById(R.id.txtLista);

        }

        return view;
    }
}
