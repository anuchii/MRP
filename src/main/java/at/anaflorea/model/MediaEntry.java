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


    private UUID creatorId;

    private Double averageScore;
    private int favoriteCount;


    protected abstract AgeRatingSystem getAgeRatingSystem();

    public abstract MediaType getMediaType();

    public boolean hasValidAgeRestriction() {
        return getAgeRatingSystem().isValid(ageRestriction);
    }
}
