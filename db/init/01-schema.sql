CREATE TABLE users (
                       id             UUID PRIMARY KEY,
                       username       VARCHAR(50)  NOT NULL UNIQUE,
                       password_hash  VARCHAR(255) NOT NULL,
                       email          VARCHAR(255),
                       favorite_genre VARCHAR(30)
);

CREATE TABLE media (
                       id              UUID PRIMARY KEY,
                       media_type      VARCHAR(10)  NOT NULL CHECK (media_type IN ('MOVIE', 'SERIES', 'GAME')),
                       title           VARCHAR(255) NOT NULL,
                       description     TEXT,
                       release_year    INT,
                       age_restriction INT,
                       creator_id      UUID NOT NULL REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE media_genres (
                              media_id UUID        NOT NULL REFERENCES media(id) ON DELETE CASCADE,
                              genre    VARCHAR(30) NOT NULL,
                              PRIMARY KEY (media_id, genre)
);

CREATE TABLE ratings (
                         id         UUID PRIMARY KEY,
                         user_id    UUID NOT NULL REFERENCES users(id) ON DELETE CASCADE,
                         media_id   UUID NOT NULL REFERENCES media(id) ON DELETE CASCADE,
                         stars      INT  NOT NULL CHECK (stars BETWEEN 1 AND 5),
                         comment    TEXT,
                         created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
                         confirmed  BOOLEAN     NOT NULL DEFAULT false,
                         UNIQUE (user_id, media_id)
);

CREATE TABLE rating_likes (
                              rating_id UUID NOT NULL REFERENCES ratings(id) ON DELETE CASCADE,
                              user_id   UUID NOT NULL REFERENCES users(id)   ON DELETE CASCADE,
                              PRIMARY KEY (rating_id, user_id)
);

CREATE TABLE favorites (
                           user_id  UUID NOT NULL REFERENCES users(id) ON DELETE CASCADE,
                           media_id UUID NOT NULL REFERENCES media(id) ON DELETE CASCADE,
                           PRIMARY KEY (user_id, media_id)
);