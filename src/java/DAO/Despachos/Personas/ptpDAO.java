/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Despachos.Personas;

import Modelos.Persona;
import Modelos.PersonaTipoPersona;
import java.util.List;

/**
 *
 * @author Tellin
 */
public interface ptpDAO {
    public List<PersonaTipoPersona> listaPTP();
    public boolean SavePTPersons(Persona persona,Long idTipoPersona);
}
