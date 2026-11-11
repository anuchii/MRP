package at.anaflorea.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@SuperBuilder
public abstract class MediaEntry {
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Setter
    private String title;
    @Setter
    private String description;
    @Setter
    private int releaseYear;
    @Setter
    @Builder.Default
    private Set<Genre> genres = new HashSet<>();
    @Setter
    private int ageRestriction;
    private User creator;
    private double averageScore;
    private int favoriteCount;



    public abstract boolean isValidAgeRestriction(int age);
    public abstract MediaType getMediaType();
}
