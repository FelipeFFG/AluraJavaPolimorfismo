package ConteudosAulas123;

public class EditorVideo extends Funcionario {


    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificação do editor de video.");
        return  super.getBonificacao() + 100;
    }

}
