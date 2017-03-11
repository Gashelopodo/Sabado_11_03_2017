package gashe.com.app_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetalle extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);


        return inflater.inflate(R.layout.fragment_detalle, container, false);

    }

    public void mostrarDetalle(String resumen){
        TextView resumenText = (TextView)getView().findViewById(R.id.myTextDetalle);
        resumenText.setText(resumen);
    }

}
