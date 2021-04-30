/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import static entities.Cosechas_.cultivo;
import entities.Gastos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carolina
 */
@Stateless
public class GastosFacade extends AbstractFacade<Gastos> {

    @PersistenceContext(unitName = "proyectoLinea2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GastosFacade() {
        super(Gastos.class);
    }
    
    public String consultaG (int id){
        try{
            System.out.println("....." +id);
        Query query = em.createQuery( "SELECT g FROM Gastos g WHERE g.id = :id");
        query.setParameter("id",id);
        Gastos gs = (Gastos) query.getSingleResult();
        String total = gs.getCultivo();
        String rc = gs.getTotal();
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
