package jpa.view;

import jpa.data.StatusData;
import jpa.model.Status;

public class CadastroStatus {
    public static void main(String[] args) {
        System.out.println("Início");
        StatusData DAO = new StatusData();
        Status obj = new Status();
        obj.setDescricao("Teste");
        try {
            
        DAO.persist(obj);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Fim");        
    }
}
