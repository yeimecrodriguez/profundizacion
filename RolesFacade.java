/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.Roles;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carolina
 */
@Stateless
public class RolesFacade extends AbstractFacade<Roles> {

    @PersistenceContext(unitName = "proyectoLinea2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolesFacade() {
        super(Roles.class);
    }
    
    public boolean verificaradmin (String rol, String password){
        Query query = em.createQuery("SELECT r FROM  Roles r WHERE r.rol = :rol AND r.password = :password");
        query.setParameter("rol", rol);
        query.setParameter("password", password);
    try {
        if ((Roles)query.getSingleResult() == null){
        
            return false;
        }else{
         return true;
        }
    }catch(Exception e){
     return false;
    }
    
        
} 
}
