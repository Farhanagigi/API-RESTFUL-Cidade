package backend.challenge.developer.api.pais;

public record DadosActualizarPais(
        Long id,
        String nome,
        String capital,
        String regiao,
        SUBREGIAO subregiao,
        String area
) {
}
