package Anotacoes;


public class TabelaBD {
    String codigoTabela;
    @Tabela(value = 123l, nomeDaTabela = "tabeladb")
    public TabelaBD(String codigoTabela) {
        this.codigoTabela = codigoTabela;
    }
}
