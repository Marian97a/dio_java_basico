package banco;

public class ContaCorrente extends Conta {
    private final double limite;

    public ContaCorrente(String nomeCliente, String numero, double saldoInicial, double limite) {
        super(nomeCliente, numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
