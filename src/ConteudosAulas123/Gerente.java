package ConteudosAulas123;

//ConteudosAulas123.Gerente é um funcionario,ConteudosAulas123.Gerente herda da class ConteudosAulas123.Funcionario
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
        System.out.println("chamando o metodo de bonificação do gerente");
        return  super.getBonificacao() + super.getSalario();   //super sinaliza que o atributo vem da classe super,base class, ou seja nao esta sendo definida nesta calsse.
                                                         //alem de ser utlizado para trazer metodos da classe super,reaproveitando os conteudos da classe extendida.
    }
}
