package at.anaflorea.model;

import lombok.experimental.SuperBuilder;

import java.util.Set;
@SuperBuilder
public class Movie extends MediaEntry{


    @Override
    public boolean isValidAgeRestriction(int age) {
        return false;
    }
}
