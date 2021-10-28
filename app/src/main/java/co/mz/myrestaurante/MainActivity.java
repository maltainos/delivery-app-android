package co.mz.myrestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.mz.myrestaurante.ui.FormRestauranteActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView btnMainAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnMainAdd();
    }

    private void btnMainAdd(){
        btnMainAdd = findViewById(R.id.idMain);
        btnMainAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRestauranteFormIntent = new Intent(MainActivity.this, FormRestauranteActivity.class);
                openRestauranteFormIntent.putExtra("accao", 1);
                startActivity(openRestauranteFormIntent);
            }
        });
    }
}