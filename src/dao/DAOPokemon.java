/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import mapeamentos.Pokemon;
import mapeamentos.Tipo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author ar_or
 */
public class DAOPokemon extends DAO {
    public List consultaPokemonPorTipo(String nomeTipo){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Pokemon.class);
        crit.createAlias("tipo","tipo");
        crit.add(Restrictions.ilike("tipo.nome", nomeTipo, MatchMode.ANYWHERE));
        List results = crit.list();
        return results;
    }

}
