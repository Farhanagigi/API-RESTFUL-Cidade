package backend.challenge.developer.api.pais;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="pais")
@Entity(name="Pais_table")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Pais_table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Nome;
    private String Capital;
    private String Regiao;

    @Enumerated(EnumType.STRING)
    private SUBREGIAO Subregiao;

    private String Area;


    public Pais_table(DadosCriacaoPais dados) {
        this.Nome=dados.Nome();
        this.Capital=dados.Capital();
        this.Regiao= dados.Regiao();
        this.Subregiao=dados.Subregiao();
        this.Area= dados.Area();

    }
}
