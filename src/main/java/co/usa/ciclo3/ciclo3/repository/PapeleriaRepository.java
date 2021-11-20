/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.repository.crud.PapeleriaCrudRepository;
import co.usa.ciclo3.ciclo3.model.Papeleria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hp
 */
@Repository
public class PapeleriaRepository {
    
    @Autowired
    private PapeleriaCrudRepository papeleriaCrudRepository;
    
    public List<Papeleria> getAll(){
        return (List<Papeleria>)this.papeleriaCrudRepository.findAll();
    
    }
    
    public Optional<Papeleria> getPapeleria(int id){
        return papeleriaCrudRepository.findById(id);
    }
    
    public Papeleria save(Papeleria p){
        return papeleriaCrudRepository.save(p);
    }
}
