package br.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.entity.Atendente;
import br.util.HibernateUtil;

public class AtendenteDAO {

	public void salvar(Atendente atendente) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(atendente);
			transacao.commit();

		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}

		}

	}

	@SuppressWarnings("unchecked")
	public List<Atendente> listar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		List<Atendente> atendentes = null;

		try {
			Query consulta = sessao.getNamedQuery("Atendente.listar");
			atendentes = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return atendentes;
	}

	public Atendente buscarPorId(Long id) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Atendente atendente = null;

		try {
			Query consulta = sessao.getNamedQuery("Atendente.buscarPorId");
			consulta.setLong("id", id);

			atendente = (Atendente) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return atendente;
	}

	public void excluir(Atendente atendente) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(atendente);
			transacao.commit();

		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw e;
		} finally {
			sessao.close();
		}
	}

	public void editar(Atendente atendente) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();

			sessao.update(atendente);

			transacao.commit();

		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw e;
		} finally {
			sessao.close();
		}
	}
}
