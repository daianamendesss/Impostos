import java.text.DecimalFormat;

class Impostos {
    double ICMS = 0.07;   // 7%
    double Confins = 0.12;   // 12%
    double IPI = 0.08;   // 8%;
    double ISS = 0.05;   // 5%;
    double Cide = 0.10;   // 10%;
    double CSLL = 0.04;   // 4%;
}

public class CalculadoraPrecos {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Arroz", 7.00, 0.20),
            new Produto("Feijão", 7.00, 0.25),
            new Produto("Carne", 7.00, 0.35),
            new Produto("Cerveja", 7.00, 0.30),
            new Produto("Gás", 7.00, 0.15),
            new Produto("Gasolina", 7.00, 0.15)
        };

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Preços de venda dos produtos:");
        for (Produto produto : produtos) {
            double totalImpostos = 0.0;
            if (produto.nome.equals("Arroz")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.ISS;
            } else if (produto.nome.equals("Feijão")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.ISS;
            } else if (produto.nome.equals("Carne")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.IPI;
            } else if (produto.nome.equals("Cerveja")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.ISS + produto.impostos.IPI;
            } else if (produto.nome.equals("Gás")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.IPI;
            } else if (produto.nome.equals("Gasolina")) {
                totalImpostos = produto.impostos.Confins + produto.impostos.ICMS + produto.impostos.Cide;
            }

            double precoVenda = produto.precoCusto + (produto.precoCusto * totalImpostos) + (produto.precoCusto * produto.margemLucro);
            System.out.println("Produto: " + produto.nome + " | Preço de Venda: R$" + df.format(precoVenda));
        }
    }
}