/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.view;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.data.AgendaData;
import jpa.data.ContatoJpaController;
import jpa.model.Contato;

/**
 *
 * @author Aluno
 */
public class CadastroAgenda {
    public static void main(String[] args) {
        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("ProjetoAgendaJPAPU");
        System.out.println("Inicío");
        AgendaData DAO = new AgendaData();
        Contato obj = new Contato();
        obj.setNome("Maria");
        obj.setTelefone("19 99666-6666");
        DAO.persist(obj);
        
        ContatoJpaController control = new ContatoJpaController(objFactory);
        control.create(obj);
        List<Contato> lista = control.findContatoEntities();
        for(Contato c: lista){
            System.out.println("id"+ c.getId() +" - "+ c.getNome());
        }
        
        System.out.println("Fim");
        
        
    }
}
