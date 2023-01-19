package backend.challenge.developer.api.pais;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Paisrepository extends JpaRepository<Pais_table,Long> {

//    Listar dados de acordo com o status quando for removido apenas tera activo como false mas nao ira mostrar na listagem
    Page<Pais_table> findAllByActivoTrue(Pageable paginacao);
}
