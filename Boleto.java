public class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double total = valor * 0.98;

        System.out.printf(
            "Boleto: R$ %.2f (com desconto de 2%%)%n",
            total
        );
    }
}
