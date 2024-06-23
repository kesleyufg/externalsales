package br.ufg.inf.bsi.externalsales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufg.inf.bsi.externalsales.domain.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
