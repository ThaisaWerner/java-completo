package model.onetoone;

import infra.DAO;

public class NewClientSeat2 {
    public static void main(String[] args) {

        Seat seat = new Seat("4D");
        Client client = new Client("Rodrigo", seat);

        DAO<Client> dao = new DAO<>(Client.class);
        dao.atomicInsert(client);
    }
}
