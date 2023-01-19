package backend.challenge.developer.api.pais;

public record DadosCriacaoPais(
    String nome,
    String capital,
    String regiao,
    SUBREGIAO subregiao,
    String area
) {
}
