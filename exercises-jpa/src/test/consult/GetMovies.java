package test.consult;

import infra.DAO;
import model.manytomany.Actor;
import model.manytomany.Movie;

import java.util.List;

public class GetMovies {

    public static void main(String[] args) {

        DAO<Movie> dao = new DAO<>(Movie.class);
        List<Movie> movies = dao.consult("getMoviesWithRatingBiggerThan", "rating", 8.5);

        System.out.println(movies.size());

        for(Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getRating());

            for(Actor actor: movie.getActors()) {
                System.out.println(actor.getName());
            }
        }
    }
}
