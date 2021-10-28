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
import co.mz.myrestaurante.domain.Categoria;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    private List<Categoria> categories;
    public CategoryAdapter(List<Categoria> categories){
            this.categories = categories;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_productos_adapter, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public int getItemCount() {return categories.size();}

    public class MyViewHolder extends  RecyclerView.ViewHolder {

        ImageView nome;
        TextView color;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
