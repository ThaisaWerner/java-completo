package test.manytomany;

import infra.DAO;
import model.manytomany.Actor;
import model.manytomany.Movie;

public class NewMovieActor {

    public static void main(String[] args) {

        Movie movieA = new Movie("Inception", 8.8);
        Movie movieB = new Movie("Spider-Man: Homecoming", 8.5);

        Actor actor1 = new Actor("Harrison Ford");
        Actor actor2 = new Actor("Scarlett Johansson");

        movieA.addActor(actor1);
        movieA.addActor(actor2);

        movieB.addActor(actor2);

        DAO<Movie> dao = new DAO<>();
        dao.atomicInsert(movieA);
    }
}
