/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;

import java.io.BufferedReader;
import java.io.File;
import java.util.*;

/**
 *
 * @author EDU
 */
public class ListaUsuarios{
    ArrayList <Usuario> listaUsuarios;
    public ListaUsuarios() {
		listaUsuarios = new ArrayList <Usuario> ();		
	}
    public boolean agregarUsuario(Usuario u) {
		listaUsuarios.add(u);
		return false;
		
	}
    public void agregarUsuario(String user,String pass,int id,int tipo){
        Usuario u = new Usuario(user,pass,id,tipo);
        listaUsuarios.add(u);
    }
	public Usuario eliminarUsuario (Usuario u) {
		for(int i=0;i<listaUsuarios.size();i++) {
			 if(listaUsuarios.get(i).getIdUsuario()==u.getIdUsuario()) {
				 return listaUsuarios.remove(i);
			 }
		}
		return null;
	}
        public boolean editarUsuario (Usuario u) {
		for(int i=0;i<listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getIdUsuario()== u.getIdUsuario()) {
				listaUsuarios.remove(i);
				listaUsuarios.add(u);
				return true;
			}
		}
		return false;
	}
        public Usuario buscarUsuario (String user){
            for (int i=0; i<listaUsuarios.size();i++){
                if(listaUsuarios.get(i).getNombreUsuario().equals(user)){
                    return listaUsuarios.get(i);
                }               
            }
             return null;
        }
        
        public boolean buscarUsuario(Usuario u){
            for(int i=0; i<listaUsuarios.size();i++){
                if(listaUsuarios.get(i).equals(u)==true){
                    return true;
                }
            }
            return false;
        }
        public Usuario getUser(int i){
            return listaUsuarios.get(i);
        }
    
        
         
        }
