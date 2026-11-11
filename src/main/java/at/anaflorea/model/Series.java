package at.anaflorea.model;

import java.util.Set;

public class Series extends MediaEntry{
    public Series(String title, String description, int releaseYear, Set<Genre> genres, int ageRestriction, User creator) {
        super(title, description, releaseYear, genres, ageRestriction, creator);
    }

    @Override
    public boolean isValidAgeRestriction(int age) {
        return false;
    }
}
