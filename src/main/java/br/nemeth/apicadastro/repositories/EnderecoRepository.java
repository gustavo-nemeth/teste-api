package br.nemeth.apicadastro.repositories;

import br.nemeth.apicadastro.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
