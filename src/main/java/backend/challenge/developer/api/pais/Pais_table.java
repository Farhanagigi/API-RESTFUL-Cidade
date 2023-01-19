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
        this.nome=dados.nome();
        this.capital=dados.capital();
        this.regiao= dados.regiao();
        this.subregiao=dados.subregiao();
        this.area= dados.area();

    }

    //acutalizar pais de acordo com cada propriedade
    public void ActualizarInformacao(DadosActualizarPais dados) {
        if(dados.nome()!=null)
        {
            this.nome= dados.nome();
        }
        if(dados.capital()!=null)
        {
            this.capital=dados.capital();
        }
        if(dados.regiao()!=null)
        {
            this.regiao=dados.regiao();
        }
        if(dados.subregiao()!=null)
        {
            this.subregiao=dados.subregiao();
        }
        if(dados.area()!=null)
        {
            this.area=dados.area();
        }
    }
}
