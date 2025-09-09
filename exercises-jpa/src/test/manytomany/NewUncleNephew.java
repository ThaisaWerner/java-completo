package test.manytomany;

import infra.DAO;
import model.manytomany.Nephew;
import model.manytomany.Uncle;

public class NewUncleNephew {

    public static void main(String[] args) {

        Uncle uncle1 = new Uncle("Bob");
        Uncle uncle2 = new Uncle("Joe");

        Nephew nephew1 = new Nephew("John");
        Nephew nephew2 = new Nephew("Jane");

        uncle1.getNephews().add(nephew1);
        nephew1.getUncles().add(uncle1);

        uncle1.getNephews().add(nephew2);
        nephew2.getUncles().add(uncle1);

        uncle2.getNephews().add(nephew1);
        nephew1.getUncles().add(uncle2);

        uncle2.getNephews().add(nephew2);
        nephew2.getUncles().add(uncle2);

        DAO<Object> dao = new DAO<>();
        dao.openTransaction()
                .insert(uncle1)
                .insert(uncle2)
                .insert(nephew1)
                .insert(nephew2)
                .closeTransaction()
                .close();
    }
}
