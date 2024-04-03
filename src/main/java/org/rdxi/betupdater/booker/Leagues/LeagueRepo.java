package org.rdxi.betupdater.booker.Leagues;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LeagueRepo extends MongoRepository <League, ObjectId> {
    Optional<League> findByTitle(String name);
}
