package at.anaflorea;


import at.anaflorea.model.Game;
import at.anaflorea.model.Movie;
import at.anaflorea.model.Series;

public class App {
    public static void main(String[] args) {
        System.out.println("Movie:");
        Movie movie1 = Movie.builder().title("Spooky mooooovieeee").ageRestriction(18).build();
        //TODO: ageRestriction noch nicht überprüft.
        System.out.println(movie1.isValidAgeRestriction(6));
        System.out.println(movie1.isValidAgeRestriction(7));
        System.out.println("Movie-Ende \n");
        Game game1 = Game.builder().title("GTA12").build();
        System.out.println(game1.isValidAgeRestriction(6));
        System.out.println(game1.isValidAgeRestriction(7));

        Series serie1 = Series.builder().title("Grey's Anatomy").build();
        System.out.println(serie1.isValidAgeRestriction(8));
        System.out.println(serie1.isValidAgeRestriction(7));
    }
}
