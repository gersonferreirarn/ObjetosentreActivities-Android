package br.com.caicosoft.objetosentreactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView tvNome;
    TextView tvEmail;
    TextView tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvNome = findViewById(R.id.tvNome);
        tvEmail = findViewById(R.id.tvEmail);
        tvSenha = findViewById(R.id.tvSenha);

        Bundle dados = getIntent().getExtras();
        Usuario usuario = (Usuario) dados.getSerializable("usuario");

        tvNome.setText(usuario.getNome());
        tvEmail.setText(usuario.getEmail());
        tvSenha.setText(usuario.getSenha());
    }
}
