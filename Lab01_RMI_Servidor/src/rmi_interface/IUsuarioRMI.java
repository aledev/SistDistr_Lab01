/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_interface;

import dto.UsuarioDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public interface IUsuarioRMI extends Remote {
    //public boolean Insert
    
   public UsuarioDTO validarUsuarioDTO(UsuarioDTO user);
}
