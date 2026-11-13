package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Series extends MediaEntry {


    @Override
    protected AgeRatingSystem getAgeRatingSystem() {
        return AgeRatingSystem.FSK;
    }

    @Override
    public MediaType getMediaType() {
        return MediaType.SERIES;
    }
}
