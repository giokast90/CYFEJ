/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Despachos.Personas;

import Modelos.TipoPersona;
import java.util.List;

/**
 *
 * @author Tellin
 */
public interface TipoPersonasDAO {
    
    public List<TipoPersona> findAllTipoPersonas();
    
    public TipoPersona findbyID(Long id);
    
}
