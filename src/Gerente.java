
//Gerente é um funcionario,Gerente herda da class Funcionario
public class Gerente extends Funcionario {

    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }


    public double getBonificacao(){
        return  super.getBonificacao() + super.getSalario();   //super sinaliza que o atributo vem da classe super,base class, ou seja nao esta sendo definida nesta calsse.
                                                         //alem de ser utlizado para trazer metodos da classe super,reaproveitando os conteudos da classe extendida.
    }
}
