/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.Registro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carolina
 */
@Stateless
public class RegistroFacade extends AbstractFacade<Registro> {

    @PersistenceContext(unitName = "proyectoLinea2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroFacade() {
        super(Registro.class);
    }
    
  public boolean verificarlogin (String nombre, String password){
        Query query = em.createQuery("SELECT r FROM  Registro r WHERE r.nombre = :nombre AND r.password = :password");
        query.setParameter("nombre", nombre);
        query.setParameter("password", password);
    try {
        if ((Registro)query.getSingleResult() == null){
        
            return false;
        }else{
         return true;
        }
    }catch(Exception e){
     return false;
    }
    
        
}  

}
