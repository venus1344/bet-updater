package org.rdxi.betupdater.booker.Odds;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OddRepo extends MongoRepository <Odd, ObjectId> {
}
