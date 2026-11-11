package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Series extends MediaEntry {


    @Override
    public boolean isValidAgeRestriction(int age) {
        return AgeRatingSystem.FSK.isValid(age);
    }

    @Override
    public MediaType getMediaType() {
        return MediaType.SERIES;
    }
}
