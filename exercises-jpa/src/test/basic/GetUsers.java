package test.basic;

import model.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class GetUsers {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Get all informations from the table
//        String jpql = "select u from User u";
//        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
//        query.setMaxResults(5);

//        List<User> users = query.getResultList();

        //We can do like this too
        List<User> users = entityManager.
                createQuery("select u from User u", User.class)
                .setMaxResults(5)
                .getResultList();

        for(User user : users) {
            System.out.println("ID: " + user.getId() + " email: " + user.getEmail());
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
