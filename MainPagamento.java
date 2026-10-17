public class MainPagamento {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new CartaoCredito(),
            new Boleto(),
            new Pix()
        };

        double valor = 100.00;

        for (Pagamento pagamento : pagamentos) {
            pagamento.processar(valor);
        }
    }
}