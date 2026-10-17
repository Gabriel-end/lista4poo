public class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;

        System.out.printf(
            "Cartão de crédito: R$ %.2f (com taxa de 5%%)%n",
            total
        );
    }
}