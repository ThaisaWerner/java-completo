package test.basic;

import model.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewUser {
    public static void main(String[] args) {

        //Creates an entity manager
        //Receives where the information of the database are (xml)
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exercises-jpa");

        //Entity Manager does the CRUD, the interaction with the database. He manages the entities
        //Receives an object and convert it to sql commands
        //Also represents the connection with the database
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        User user = new User("Arthur", "arthur@lanche.com.br");
        User user1 = new User("Leo", "leo@lanche.com.br");
        //user.setId(1L);

        //Creates a transactional channel to persist the user in the database
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.persist(user1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
