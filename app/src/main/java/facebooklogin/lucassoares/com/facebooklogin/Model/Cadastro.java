package facebooklogin.lucassoares.com.facebooklogin.Model;

public class Cadastro{
    private String nomeUsuario;
    private String senhaUsuario;
    private String senhaConfirmacao;

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario){
        this.senhaUsuario = senhaUsuario;
    }

    public void setSenhaConfirmacao(String senhaConfirmacao){
        this.senhaConfirmacao = senhaConfirmacao;
    }

    public boolean VerificarCadastro(){
        if(nomeUsuario.equals("Milho") && senhaUsuario.equals("Cozido") && senhaConfirmacao.equals("Cozido")){
            return true;
        }
        return false;
    }
}
