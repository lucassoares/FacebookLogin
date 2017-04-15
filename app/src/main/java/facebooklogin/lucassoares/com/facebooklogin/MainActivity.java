package facebooklogin.lucassoares.com.facebooklogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import facebooklogin.lucassoares.com.facebooklogin.Model.Usuario;

public class MainActivity extends AppCompatActivity{
    private String nomeUsuario;
    private String senhaUsuario;
    private EditText inputNome;
    private EditText inputSenha;
    private Button fazerLogin;
    private TextView fazerCadastro;
    Usuario usuario = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNome = (EditText) findViewById(R.id.nomeLogin);
        inputSenha = (EditText) findViewById(R.id.senhaLogin);
        fazerLogin = (Button)findViewById(R.id.btnRegistrar);
        fazerCadastro = (TextView)findViewById(R.id.fazerCastroId);

        fazerCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CadastroActivity.class);
                startActivity(intent);
                finish();
            }
        });


        fazerLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                nomeUsuario = inputNome.getText().toString();
                senhaUsuario = inputSenha.getText().toString();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenhaUsuario(senhaUsuario);
               if(usuario.VerificarUsuario()){
                   Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                   startActivity(intent);
                   finish();
               }
                else{
                   Toast.makeText(MainActivity.this,"Seus dados estão errados",Toast.LENGTH_SHORT).show();
               }
            }
        });





    }
}
