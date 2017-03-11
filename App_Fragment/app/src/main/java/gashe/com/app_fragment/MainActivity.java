package gashe.com.app_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentListado fragmentListado = (FragmentListado)fm.findFragmentById(R.id.fragmentListado);

        fragmentListado.setLibrosListener(this);

    }

    public void libroSeleccionado (Libro libro){
        //TODO llevar el detalle del libro al otro fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentDetalle fragmentDetalle = (FragmentDetalle)fragmentManager.findFragmentById(R.id.fragmentDetalle);

        fragmentDetalle.mostrarDetalle(libro.getResumen());

    }

}
