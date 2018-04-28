/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import mapeamentos.Pokemon;
import mapeamentos.Treina;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author ar_or
 */
public class DAOTreina extends DAO {
    public List consultaPorPokemon (Pokemon pokemon){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Treina.class);
        crit.add(Restrictions.eq("chaveComposta.pokemon", pokemon));
        List results = crit.list();
        return results;
    }
    
    public List consultaPorNotaMaior (int nota){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Treina.class);
        crit.add(Restrictions.gt("nota", nota));
        List results = crit.list();
        return results;
    }
    //gt() (greater-than)
    //ge() (greater-than-or-equal-to)
    //Lt() (less-than)
    //le() (less-than-or-equal-to) 
    //http://www.devmedia.com.br/hibernate-api-criteria-realizando-consultas/29627
}
    
