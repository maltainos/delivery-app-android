package co.mz.myrestaurante.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.mz.myrestaurante.MainActivity;
import co.mz.myrestaurante.R;
import co.mz.myrestaurante.api.APIUtils;
import co.mz.myrestaurante.domain.Restaurante;
import co.mz.myrestaurante.ui.admin.ProductoAdminActivity;
import co.mz.myrestaurante.ui.single.ProductoSingleActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btnLogin;
    private String Fieldusername;
    private String Fieldpassword;

    private List<Restaurante> restautantes = new ArrayList<>();
    private static final String BASE_URL = APIUtils.getUrlBase()+"users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        getUsers();
        setBtnLogin();
    }

    public void getUsers(){
        RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, BASE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONArray array = new JSONArray(response);
                            for (int i = 0; i < array.length(); i++){
                                JSONObject users = array.getJSONObject(i);
                                String id = users.getString("_id");
                                String primeiroNome = users.getString("primeiroNome");
                                String segundoNome = users.getString("ultimoNome");
                                String nomeRestaurante = users.getString("nomeRestaurante");
                                String createdAt = users.getString("createdAt");
                                String updatedAt = users.getString("updatedAt");
                                String password = users.getString("password");
                                String email = users.getString("email");
                                String cidade = users.getString("cidade");
                                Double classificacao = users.getDouble("classificacao");
                                Double cordenadaX = users.getDouble("cordenadaX");
                                Double cordenadaY = users.getDouble("cordenadaY");
                                Boolean status = users.getBoolean("status");
                                Boolean isSuperAdmin = users.getBoolean("isSuperAdmin");
                                Boolean isAdmin = users.getBoolean("isAdmin");
                                Restaurante restaurante = new Restaurante(id,primeiroNome,segundoNome,
                                        nomeRestaurante,cidade,classificacao,cordenadaX,cordenadaY,
                                        email,password,status,isSuperAdmin,isAdmin);
                                restautantes.add(restaurante);
                                System.out.println(restaurante);
                            }
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Error", error.toString());
                Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }
     protected void setBtnLogin(){
        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnEntrar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fieldpassword = password.getText().toString();
                Fieldusername = username.getText().toString();
                for(Restaurante restaurante : restautantes){
                    if(restaurante.getEmail().equalsIgnoreCase(Fieldusername)
                            && restaurante.getPassword().equals(Fieldpassword)){
                        if(restaurante.getSuperAdmin()){
                            Intent openMainIntent = new Intent(LoginActivity.this, MainActivity.class);
                            //openMainIntent.putExtra("usuario",restaurante);
                            startActivity(openMainIntent);
                            finish();
                            break;
                        }else{
                            if(restaurante.getAdmin() && restaurante.getSuperAdmin() == false){
                                Intent openMainIntent = new Intent(LoginActivity.this, ProductoAdminActivity.class);
                                //openMainIntent.putExtra("usuario",restaurante);
                                startActivity(openMainIntent);
                                finish();
                                break;
                            }else{
                                Intent openMainIntent = new Intent(LoginActivity.this, ProductoSingleActivity.class);
                                //openMainIntent.putExtra("usuario",restaurante);
                                startActivity(openMainIntent);
                                finish();
                                break;
                            }
                        }
                    }
                }
            }
        });
     }
}