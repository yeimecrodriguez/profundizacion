/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.Cosechas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carolina
 */
@Stateless
public class CosechasFacade extends AbstractFacade<Cosechas> {

    @PersistenceContext(unitName = "proyectoLinea2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CosechasFacade() {
        super(Cosechas.class);
    }
   public String consultaC(int id){
        try{
            System.out.println("....." +id);
        Query query = em.createQuery( "SELECT g FROM Cosechas g WHERE g.id = :id");
        query.setParameter("id",id);
        Cosechas gs = (Cosechas) query.getSingleResult();
        String total = gs.getCultivo();
        String rc = gs.getCantidad();
            System.out.println("*************");
        if (gs!= null){
            return total+" "+rc;
        
        }else{
            return "jajjaja";
            
                    
        }
        }catch(Exception e){
            System.out.println(e);
            return null;
        
        }
       
    }  
}
