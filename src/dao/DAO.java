/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import mapeamentos.Treina;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import util.HibernateUtil;
/**
 *
 * @author ar_or
 */
public class DAO {
   
    public void salvar (Object objeto){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(objeto);
        session.getTransaction().commit();
        session.flush();//LiberaMemoria
        session.close();
    }
    
    public void update (Object objeto){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(objeto);
        transaction.commit();
        session.flush();//LiberaMemoria
        session.close();
    }
    
    public void delete (Object objeto){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(objeto);
        transaction.commit();
        session.flush();//LiberaMemoria
        session.close();
    }
    public List consultar(Class classe){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(classe);
        List results = crit.list();
        session.flush();//LiberaMemoria
        session.close();
        return results;
    }
     
    public List consultaByExemplo (Class classe, Object object){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Treina.class);
        Example exemplo = Example.create(object);
        crit.add(exemplo);
        List results = crit.list();
        return results;
    }
}
