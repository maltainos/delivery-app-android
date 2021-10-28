package co.mz.myrestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.mz.myrestaurante.R;
import co.mz.myrestaurante.domain.Producto;


public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.MyViewHolder> {

    private List<Producto> productos;
    public ProductoAdapter(List<Producto> products){
        this.productos = products;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_productos_adapter, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.popularName.setText(productos.get(position).getNomeProducto());
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }
    public class MyViewHolder extends  RecyclerView.ViewHolder {

        ImageView popularImage;
        TextView popularName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            popularImage = itemView.findViewById(R.id.popularNmage);
            popularName = itemView.findViewById(R.id.popularName);
        }
    }
}
