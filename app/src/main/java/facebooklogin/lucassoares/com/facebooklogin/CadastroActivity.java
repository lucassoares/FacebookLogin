package facebooklogin.lucassoares.com.facebooklogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import facebooklogin.lucassoares.com.facebooklogin.Model.Cadastro;

public class CadastroActivity extends AppCompatActivity{
    private String nomeUsuario;
    private String senhaUsuario;
    private String senhaConfirmacao;
    private Button fazerCadastro;
    private EditText inputNome;
    private EditText inputSenha;
    private EditText inputConfirmacao;
    Cadastro cadastro = new Cadastro();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        inputNome = (EditText)findViewById(R.id.nomeCadastro);
        inputSenha = (EditText)findViewById(R.id.inputSenhaCadastro);
        inputConfirmacao = (EditText)findViewById(R.id.inputConfirmacaoCadastro);
        fazerCadastro = (Button)findViewById(R.id.btnCadastrar);

        fazerCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                nomeUsuario = inputNome.getText().toString();
                senhaUsuario = inputSenha.getText().toString();
                senhaConfirmacao = inputConfirmacao.getText().toString();
                cadastro.setNomeUsuario(nomeUsuario);
                cadastro.setSenhaUsuario(senhaUsuario);
                cadastro.setSenhaConfirmacao(senhaConfirmacao);
                if(cadastro.VerificarCadastro()){
                    Toast.makeText(CadastroActivity.this,"Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CadastroActivity.this,"Cadastro não realizado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
