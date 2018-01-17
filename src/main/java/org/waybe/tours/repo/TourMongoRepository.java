package org.waybe.tours.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.waybe.tours.model.Tour;

public interface TourMongoRepository extends MongoRepository<Tour, String> {
  
}