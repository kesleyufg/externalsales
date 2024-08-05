package br.ufg.inf.bsi.externalsales;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ufg.inf.bsi.externalsales.domain.Cliente;
import br.ufg.inf.bsi.externalsales.domain.Contato;
import br.ufg.inf.bsi.externalsales.repositories.ClienteRepository;
import br.ufg.inf.bsi.externalsales.repositories.ContatoRepository;

@SpringBootApplication
public class ExternalSalesApplication implements CommandLineRunner{

	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ExternalSalesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	/*
		Contato contato1 = new Contato(null, "Jose", "jose@email.com", "984840101");
		Contato contato2 = new Contato(null, "Maria", "maria@email.com", "985850202");
		Contato contato3 = new Contato(null, "Fabiana", "fabiana@email.com", "992762447");
		
		Cliente cliente1 = new Cliente(null, "20653507000151", "822690832477", "Jose e Maria Telecomunicações ME");
		Cliente cliente2 = new Cliente(null, "14056946000184", "625247130741", "Rodrigo e Fabiana Advocacia Ltda");
		
		contato1.getContatos().addAll(Arrays.asList(cliente1));
		contato2.getContatos().addAll(Arrays.asList(cliente1));
		contato3.getContatos().addAll(Arrays.asList(cliente2));
		
		cliente1.getContatos().addAll(Arrays.asList(contato1, contato2));
		cliente2.getContatos().addAll(Arrays.asList(contato3));
		
		contatoRepository.saveAll(Arrays.asList(contato1, contato2, contato3));
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));*/
	}
}
