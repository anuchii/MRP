package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Game extends MediaEntry {


    @Override
    protected AgeRatingSystem getAgeRatingSystem() {
        return AgeRatingSystem.PEGI;
    }

    @Override
    public MediaType getMediaType() {
        return MediaType.GAME;
    }
}
