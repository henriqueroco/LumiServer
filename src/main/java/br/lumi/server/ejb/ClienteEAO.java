package br.lumi.server.ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.lumi.server.model.CidadeModel;
import br.lumi.server.model.MarcaModel;
import br.lumi.server.model.filtro.FiltroCidadeModel;
import br.lumi.server.model.filtro.FiltroMarcaModel;


//@Stateless
public class ClienteEAO {

	@PersistenceContext
	private EntityManager em;
	
	private CidadeModel salvarCidade(CidadeModel marca){
		return null;
	}
	private void excluirCidadePorId(Integer id){
		
	}
	private CidadeModel consultarCidadePorCodigo(Integer codigo){
		return null;
		
	}
	private List<CidadeModel> listarCidades(){
		return null;
		
	}
	private CidadeModel consultarCidadePorFiltro(FiltroCidadeModel filtro){
		return null;
		
	}
}
