package test.basic;

import model.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateUser2 {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //The object is in a managed state, so even we don't call merge, the changes will be synchronized with db
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, 7L);
        user.setName("Leonardo");
        user.setEmail("leonardo@lanche.com.br");

        //entityManager.merge(user);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
