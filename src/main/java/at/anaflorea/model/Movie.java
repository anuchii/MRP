package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Movie extends MediaEntry {


    @Override
    public boolean isValidAgeRestriction(int age) {
        return false;
    }

    @Override
    public MediaType getMediaType() {
        return MediaType.MOVIE;
    }
}
