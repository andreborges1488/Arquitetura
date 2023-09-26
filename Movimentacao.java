package arquitetura; 

class Movimentacao {
    private int id;
    private int codigoProduto;
    private int quantidade;
    private enum Tipo {
        ENTRADA,
        SAIDA
    }

    public Movimentacao(int id, int codigoProduto, int quantidade, Tipo tipo) {
        this.id = id;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Tipo getTipo() {
        return tipo;
    }
}