package at.anaflorea.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;
import java.util.UUID;

@Getter

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

    public MediaEntry(String title, String description, int releaseYear, Set<Genre> genres, int ageRestriction, User creator) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.ageRestriction = ageRestriction;
        this.creator = creator;
    }

    public abstract boolean isValidAgeRestriction(int age);

}
