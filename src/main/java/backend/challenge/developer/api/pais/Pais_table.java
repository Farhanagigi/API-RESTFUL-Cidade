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

    private String nome;
    private String capital;
    private String regiao;

    @Enumerated(EnumType.STRING)
    private SUBREGIAO subregiao;

    private String area;

    //Listagem de acordo com status
//    private boolean activo;


    public Pais_table(DadosCriacaoPais dados) {
//        this.activo=true;
        this.nome=dados.Nome();
        this.capital=dados.Capital();
        this.regiao= dados.Regiao();
        this.subregiao=dados.Subregiao();
        this.area= dados.Area();

    }
}
