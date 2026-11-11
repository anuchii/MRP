package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Game extends MediaEntry {


    @Override
    public boolean isValidAgeRestriction(int age) {
        return AgeRatingSystem.PEGI.isValid(age);
    }

    @Override
    public MediaType getMediaType() {
        return MediaType.GAME;
    }
}
