package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Class<E> classy;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("exercises-jpa");
        } catch(Exception e) {

        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classy) {
        this.classy = classy;
        entityManager = entityManagerFactory.createEntityManager();
    }

    public DAO<E> openTransaction() {
        entityManager.getTransaction().begin();
        return this;
    }

    public DAO<E> closeTransaction() {
        entityManager.getTransaction().commit();
        return this;
    }

    public DAO<E> insert(E entity) {
        entityManager.persist(entity);
        return this;
    }

    public DAO<E> atomicInsert(E entity) {
        return this.openTransaction().insert(entity).closeTransaction();
    }

    public E getByID(Object id) {
        return entityManager.find(classy, id);
    }

    public List<E> getAll() {
        return this.getAll(10, 0);
    }

    public List<E> getAll(int limit, int offset) {
        if(classy == null) {
            throw new UnsupportedOperationException("Null class");
        }

        String jpql = "select e from " + classy.getName() + " e";
        TypedQuery<E> query = entityManager.createQuery(jpql, classy);
        query.setMaxResults(limit);
        query.setFirstResult(offset);

        return query.getResultList();
     }

     public List<E> consult(String consultName, Object... params) {
        TypedQuery<E> query = entityManager.createNamedQuery(consultName, classy);

        for(int i = 0; i < params.length; i += 2) {
            query.setParameter(params[i].toString(), params[i + 1]);
        }
        return query.getResultList();
     }

     public E consultOne(String consultName, Object... params) {
        List<E> list = this.consult(consultName, params);
        return list.isEmpty() ? null : list.get(0);
     }

     public void close() {
        entityManager.close();
     }
}
