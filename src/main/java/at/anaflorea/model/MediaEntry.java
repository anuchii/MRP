package at.anaflorea.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;
import java.util.UUID;

@Getter
@SuperBuilder
public abstract class MediaEntry {
    private UUID id;
    @Setter
    private String title;
    @Setter
    private String description;
    @Setter
    private int releaseYear;
    @Setter
    private Set<Genre> genres;
    @Setter
    private int ageRestriction;
    private User creator;
    private double averageScore;
    private int favoriteCount;



    public abstract boolean isValidAgeRestriction(int age);

}
