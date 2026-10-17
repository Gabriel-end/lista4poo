public class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        double total = valor * 0.95;

        System.out.printf(
            "Pix: R$ %.2f (com desconto de 5%%)%n",
            total
        );
    }
}
