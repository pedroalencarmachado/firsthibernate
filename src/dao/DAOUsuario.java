/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import mapeamentos.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author ar_or
 */
public class DAOUsuario extends DAO {
    public List validaLogin (String login, String senha){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Usuario.class);
        crit.add(Restrictions.eq("login",login));
        crit.add(Restrictions.eq("senha",senha));
        List results = crit.list();
        return results;
    }
}
