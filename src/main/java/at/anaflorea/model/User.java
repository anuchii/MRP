package at.anaflorea.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Builder
@Getter
public class User {
    @Builder.Default
    private UUID id = UUID.randomUUID();

    private String username;

    private String passwordHash;
    @Setter
    private String email;
    @Setter
    private Genre favoriteGenre;



}
