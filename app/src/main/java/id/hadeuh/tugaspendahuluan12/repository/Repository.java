/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.hadeuh.tugaspendahuluan12.repository;

import java.util.ArrayList;

/**
 *
 * @author hilmantm
 * @param <T>
 */
public interface Repository <T> {
    
    ArrayList<T> getAll();
    
    int edit(T updatedModel);
    
    int insert(T newModel);
    
    int delete(int idModel);
    
}
