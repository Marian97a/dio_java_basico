package banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeCliente, String numero, double saldoInicial) {
        super(nomeCliente, numero, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
