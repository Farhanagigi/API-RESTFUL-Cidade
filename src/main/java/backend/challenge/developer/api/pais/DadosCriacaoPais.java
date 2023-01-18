package backend.challenge.developer.api.pais;

public record DadosCriacaoPais(
    String Nome,
    String Capital,
    String Regiao,
    SUBREGIAO Subregiao,
    String Area
) {
}
