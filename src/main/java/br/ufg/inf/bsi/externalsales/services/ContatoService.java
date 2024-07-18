package br.ufg.inf.bsi.externalsales.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.ufg.inf.bsi.externalsales.domain.Contato;
import br.ufg.inf.bsi.externalsales.repositories.ContatoRepository;
import br.ufg.inf.bsi.externalsales.services.exceptions.DataIntegrityException;
import br.ufg.inf.bsi.externalsales.services.exceptions.ObjectNotFoundException;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repo;

	public Contato buscar(Integer id) {
		Optional<Contato> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Contato.class.getName()));
	}
	
	public Contato inserir(Contato obj) {
	    obj.setId(null);
	    return repo.save(obj);
	}
	
	public Contato atualizar(Contato obj) {
		buscar(obj.getId());
		return repo.save(obj);
	}
	
	public Contato deletar(Integer id) {
		buscar(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um contato que possui clientes");
		}
	}
}
