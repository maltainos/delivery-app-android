package co.mz.myrestaurante.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import co.mz.myrestaurante.R;
import co.mz.myrestaurante.domain.Restaurante;

public class FormRestauranteActivity extends AppCompatActivity {

    //btn
    private ImageView btnBackMain;
    private ImageView btnSaveRest;
    private ImageView btnGetLocation;

    //Text
    private EditText txtPrimeiroNome;
    private EditText txtSegundoNome;
    private EditText txtNomeRestaurante;
    private EditText classificacao;
    private EditText cidade;
    private EditText longitude;
    private EditText latitude;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_restaurante);
        getSupportActionBar().hide();
        setBtnBackMain();
        setBtnSaveRest();
        setBtnGetLocation();
    }

    private void setBtnBackMain(){
        btnBackMain = findViewById(R.id.idBackMain);
        btnBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setBtnSaveRest(){
        btnSaveRest = findViewById(R.id.idSaveRest);
        btnSaveRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormRestauranteActivity.this, "Save as clicked", Toast.LENGTH_SHORT).show();
                Restaurante restaurante = getFormText();
                System.out.println(restaurante);
                finish();
            }
        });
    }

    private Restaurante getFormText(){
        txtPrimeiroNome = findViewById(R.id.txtRestauranteNome);
        txtSegundoNome = findViewById(R.id.txtRestauranteApelido);
        txtNomeRestaurante = findViewById(R.id.txtNomeRestaurante);
        classificacao = findViewById(R.id.txtRestauranteEstrelas);
        cidade = findViewById(R.id.txtRestauranteCidade);
        longitude = findViewById(R.id.txtRestauranteCordenadaX);
        latitude = findViewById(R.id.txtRestauranteCordenadaY);
        email = findViewById(R.id.txtRestauranteEmail);
        password = findViewById(R.id.txtRestauranteSenha);

        String nomeUsuario = txtPrimeiroNome.getText().toString();
        String apelidoUsuario = txtSegundoNome.getText().toString();
        String nomeRest = txtNomeRestaurante.getText().toString();
        Double classificaoRestaute = Double.valueOf(classificacao.getText().toString());
        String cidadeRestaurante = cidade.getText().toString();
        Double cordenadaXRestaurante = Double.valueOf(longitude.getText().toString());
        Double cordenadaYRestaurante = Double.valueOf(latitude.getText().toString());
        String emailRestaurante = email.getText().toString();
        String senhaUsuario = password.getText().toString();
        return new Restaurante(nomeUsuario,apelidoUsuario,nomeRest,
                classificaoRestaute,cidadeRestaurante,cordenadaXRestaurante,cordenadaYRestaurante,
                emailRestaurante,senhaUsuario,true,false,true);
    }

    private void setBtnGetLocation(){
        btnGetLocation = findViewById(R.id.idLogation);
        btnGetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormRestauranteActivity.this, "Find your Location", Toast.LENGTH_SHORT).show();
            }
        });
    }
}