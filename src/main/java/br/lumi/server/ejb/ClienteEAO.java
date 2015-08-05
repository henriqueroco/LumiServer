package br.lumi.server.ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import br.lumi.server.model.CidadeModel;
import br.lumi.server.model.filtro.FiltroCidadeModel;


//@Stateless
public class ClienteEAO {

	@PersistenceContext
	private EntityManager em;
	
	private CidadeModel salvarCidade(CidadeModel cidade){
		cidade = em.merge(cidade);
		em.flush();
		return cidade;
	}
	private void excluirCidadePorId(CidadeModel cidade){
		em.remove(em.getReference(CidadeModel.class, cidade.getId()));
	}
	private CidadeModel consultarCidadePorCodigo(Integer codigo){
		return null;
		
	}
	private List<CidadeModel> listarCidades(){
		return null;
		
	}
	private CidadeModel consultarCidadePorFiltro(FiltroCidadeModel filtro){
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(CidadeModel.class);
//		criteria.setProjection(Projections.max(CidadeModel_.codigo.getName()));
		
		return null;
		
	}
}
