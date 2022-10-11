package br.com.syonet.dao;

import br.com.syonet.entidade.Livro;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LivroDAO {

    public void salva(Livro livro){
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("jpa-banco");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    public Livro  buscaLivroId(Integer id) {
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("jpa-banco");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Livro livro = entityManager.find(Livro.class, id);

        entityManager.close();
        entityManagerFactory.close();
        return livro;
    }




}