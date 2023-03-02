package br.nemeth.apicadastro.repositories;

import br.nemeth.apicadastro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
