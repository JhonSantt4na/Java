package aplicaçao;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class programa {

    public static void main(String[] args) {
        
        // Primeiro o id terá que ser null pois o DB que gera o id    
        // Apos inserir removemos os dados abaixo:
    	//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        //Pessoa p2 = new Pessoa(null, "Joaquin Torres", "joaquin@gmail.com");
        //Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
        
        // Associando o Entity Manager com as configurações
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        
        // Criando a conexão e inicializando o EntityManager
        EntityManager em = emf.createEntityManager();
        
        // removemos os dados apos salvar os dados:
        // Iniciando uma transação com o banco (Já que não é uma simples leitura)
        em.getTransaction().begin();
        
        // Persistindo os dados no banco 
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        
        // Confirmando as alterações
        em.getTransaction().commit();
        
        // Fechando o EntityManager e a Factory
        em.close();
        emf.close();
        
        System.out.println("Pronto");
    }
}
