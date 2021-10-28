package co.mz.myrestaurante.ui.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.mz.myrestaurante.R;

public class ProductoAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_admin);
        getSupportActionBar().hide();

    }
}