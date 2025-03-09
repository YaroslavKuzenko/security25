package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class ParcelRepository
    @since 09.03.2025 - 18.47
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends MongoRepository<Parcel, String> {
}
