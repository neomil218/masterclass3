/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Papeleria;
import co.usa.ciclo3.ciclo3.repository.PapeleriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author hp
 */
@Service
public class PapeleriaService {
    
    @Autowired
    private PapeleriaRepository papeleriaRepository;
    
    public List<Papeleria> getAll(){
        return (List<Papeleria>)this.papeleriaRepository.getAll();
    
    }
    
    public Optional<Papeleria> getPapeleria(int id){
        return this.papeleriaRepository.getPapeleria(id);
    }
    
    public Papeleria save(Papeleria p){
        if (p.getId()==null){
            return papeleriaRepository.save(p);
        } else {
            Optional<Papeleria> paux = papeleriaRepository.getPapeleria(p.getId());
            if (paux.isEmpty()){
                return papeleriaRepository.save(p);
            } else {
                return p;
            }
        }
    }
}

