package at.anaflorea.model;

import java.util.Set;

public enum AgeRatingSystem {
    FSK (Set.of(0, 6, 12, 16, 18)),
    PEGI(Set.of(3, 7, 12, 16, 18));
    private final Set<Integer> allowedAges;

    AgeRatingSystem(Set<Integer> allowedAges) {
        this.allowedAges = allowedAges;
    }

    public boolean isValid(int age) {
        return allowedAges.contains(age);
    }
}
