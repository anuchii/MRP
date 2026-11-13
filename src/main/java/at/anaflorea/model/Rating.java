package at.anaflorea.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
public class Rating {
    @Builder.Default
    private UUID id = UUID.randomUUID();

    private UUID userid;
    private UUID mediaId;

    @Setter
    private int stars;

    private String comment;

    @Builder.Default
    private Instant createdAt = Instant.now();

    private boolean confirmed;
    private int likeCount;

    public void confirm() {
        this.confirmed = true;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.confirmed = false;
    }


}
