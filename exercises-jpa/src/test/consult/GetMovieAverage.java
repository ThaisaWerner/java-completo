package test.consult;

import infra.DAO;
import model.consult.MovieRating;

public class GetMovieAverage {

    public static void main(String[] args) {

        DAO<MovieRating> dao = new DAO<>(MovieRating.class);
        MovieRating rating = dao.consultOne("getMovieAverageRating");

        System.out.println(rating.getAverage());

        dao.close();
    }
}
