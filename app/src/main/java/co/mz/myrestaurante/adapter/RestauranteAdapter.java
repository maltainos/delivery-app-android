package co.mz.myrestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.mz.myrestaurante.R;
import co.mz.myrestaurante.domain.Restaurante;

public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.MyViewHolder> {

    private List<Restaurante> restaurantes;
    public RestauranteAdapter(List<Restaurante> restaurantes){
        this.restaurantes = restaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_productos_adapter, parent, false);
        return new RestauranteAdapter.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdapter.MyViewHolder holder, int position) {
        Restaurante restaurante = restaurantes.get(position);
        //holder.popularName.setText(restaurantes.get(position).getNomeProducto());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {
        private TextView nomeRestaurante;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
