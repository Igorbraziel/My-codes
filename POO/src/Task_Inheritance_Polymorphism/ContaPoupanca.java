package Task_Inheritance_Polymorphism;

public class ContaPoupanca extends Conta{
    public void atualizarSaldo(double percentual){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * percentual));
    }
}