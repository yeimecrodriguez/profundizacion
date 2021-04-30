/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.AuditoriaCarolina;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author carolina
 */
@Stateless
public class AuditoriaCarolinaFacade extends AbstractFacade<AuditoriaCarolina> {

    @PersistenceContext(unitName = "proyectoLinea2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditoriaCarolinaFacade() {
        super(AuditoriaCarolina.class);
    }
   public AuditoriaCarolina obtenerdatos(String nombre){
        
        Query buscar = em.createQuery("SELECT e FROM AuditoriaCarolina e WHERE e.usuario = :usuario");
        buscar.setParameter("usuario", nombre);
        em.flush();
        return (AuditoriaCarolina) buscar.getSingleResult();
        
    }
 
}
