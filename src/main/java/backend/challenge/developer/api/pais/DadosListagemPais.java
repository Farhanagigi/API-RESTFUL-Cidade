package backend.challenge.developer.api.pais;

public record DadosListagemPais(Long id, String nome, String capital, String regiao,SUBREGIAO subregiao, String area) {

    //criacao de um metodo para poder efectuar a leitura do que esta no banco de dados BD usando metodo construtor
    public DadosListagemPais(Pais_table pais_table)
    {
    this(pais_table.getId(),pais_table.getNome(),pais_table.getCapital(),pais_table.getRegiao(),pais_table.getSubregiao(),pais_table.getArea());
    }
}
