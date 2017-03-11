package gashe.com.app_fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by cice on 11/3/17.
 */

public class FragmentListado extends Fragment {

    private ListView listado;
    private MainActivity mainActivity;
    private Libro[] datos = new Libro[]{
            new Libro("Libro 1", "Autor 1", "Aquí va el resumen del libro 1 y autor 1"),
            new Libro("Libro 2", "Autor 2", "Aquí va el resumen del libro 2 y autor 2"),
            new Libro("Libro 3", "Autor 3", "Aquí va el resumen del libro 3 y autor 3"),
            new Libro("Libro 4", "Autor 4", "Aquí va el resumen del libro 4 y autor 4")
    };


    public void setLibrosListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

    /**Este método es invocado al crearse la actividad contenedora**/
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listado = (ListView)getView().findViewById(R.id.myListado);
        listado.setAdapter(new AdapterLibros(this));

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mainActivity.libroSeleccionado(datos[i]);
            }
        });

    }

    class AdapterLibros extends ArrayAdapter<Libro>{

        Activity context;

        public AdapterLibros (Fragment context){
            super(context.getActivity(), R.layout.fragment_listado_item, datos);
            this.context = context.getActivity();
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View item = null;
            LayoutInflater layoutInflater = context.getLayoutInflater();
            item = layoutInflater.inflate(R.layout.fragment_listado_item, null);

            TextView titulo = (TextView)item.findViewById(R.id.titulo);
            titulo.setText(datos[position].getTitulo());
            TextView autor = (TextView)item.findViewById(R.id.autor);
            autor.setText(datos[position].getAutor());

            return item;
        }


    }

}
