package ConteudosAula4;



//new ContaCorrente()
public class ContaCorrente extends Conta{  //herda os atributos e metodos porem nao herda os construtores da classe.



    public ContaCorrente(int agencia,int numero){  //tenta chamar o contrutor da classe mae
        super(agencia,numero);                     //chamada do construtor  da classe mae.
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }


}