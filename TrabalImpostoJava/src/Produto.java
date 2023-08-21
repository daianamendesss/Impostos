

class Produto {
    String nome;
    double precoCusto;
    Impostos impostos;
    double margemLucro;

    public Produto(String nome, double precoCusto, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.impostos = new Impostos();
        this.margemLucro = margemLucro;
    }
    public double calcularPrecoVenda() {
        double totalImpostos = 0.0;
        if (nome.equals("Arroz")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.ISS;
        } else if (nome.equals("Feij�o")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.ISS;
        } else if (nome.equals("Carne")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.IPI;
        } else if (nome.equals("Cerveja")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.ISS + impostos.IPI;
        } else if (nome.equals("G�s")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.IPI;
        } else if (nome.equals("Gasolina")) {
            totalImpostos = impostos.Confins + impostos.ICMS + impostos.Cide;
        }

        double precoVenda = precoCusto + (precoCusto * totalImpostos) + (precoCusto * margemLucro);
        return precoVenda;
    }
}
    