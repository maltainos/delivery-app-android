package co.mz.myrestaurante.ui.single;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import co.mz.myrestaurante.R;
import co.mz.myrestaurante.api.APIUtils;
import co.mz.myrestaurante.domain.Producto;

public class ProductoSingleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Producto> productos;
    private static final String BASE_URL = APIUtils.getUrlBase()+"products";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_single);
        getSupportActionBar().hide();

        getProductos();
    }

    public void getProductos(){
        RequestQueue queue = Volley.newRequestQueue(ProductoSingleActivity.this);

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, BASE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("URL :"+BASE_URL);
                        try{
                            JSONArray array = new JSONArray(response);
                            for (int i = 0; i < array.length(); i++){

                                JSONObject productos = array.getJSONObject(i);
                                String id = productos.getString("_id");
                                String nome = productos.getString("nome");
                            }
                            System.out.println(array.toString());
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Error", error.toString());
                System.out.println(error.toString());
                Toast.makeText(ProductoSingleActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }
}