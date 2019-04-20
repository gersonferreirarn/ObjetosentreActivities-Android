package br.com.caicosoft.objetosentreactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnProximaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProximaTela = findViewById(R.id.btnProximaTela);

        btnProximaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                proximaTela();

            }
        });
    }

    public void proximaTela(){
        Usuario usuario = new Usuario("Gerson", "gerson10caicorn@hotmail.com", "gerson123");

        Intent i = new Intent(getApplicationContext(), SegundaActivity.class);

        i.putExtra("usuario", usuario);
        setIntent(i);

        startActivity(i);
    }
}
