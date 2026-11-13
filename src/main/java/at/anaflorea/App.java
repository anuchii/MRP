package at.anaflorea;


import at.anaflorea.model.Game;
import at.anaflorea.model.Movie;
import at.anaflorea.model.Series;

public class App {
    public static void main(String[] args) {
        System.out.println("Movie:");
        Movie movie1 = Movie.builder().title("Spooky mooooovieeee").ageRestriction(18).build();
        System.out.println(movie1.hasValidAgeRestriction());
        System.out.println("Movie-Ende \n");
        Game game1 = Game.builder().title("GTA12").ageRestriction(16).build();
        System.out.println(game1.hasValidAgeRestriction());

        Series serie1 = Series.builder().title("Grey's Anatomy").ageRestriction(21).build();
        System.out.println(serie1.hasValidAgeRestriction());
    }
}
