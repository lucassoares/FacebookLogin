package facebooklogin.lucassoares.com.facebooklogin.Model;


public class Usuario{
    private String nomeUsuario;
    private String senhaUsuario;

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario){
        this.senhaUsuario = senhaUsuario;
    }

   public boolean VerificarUsuario(){
       if(nomeUsuario.equals("Milho") && senhaUsuario.equals("Cozido")){
           return true;
       }
       return false;
   }
}
