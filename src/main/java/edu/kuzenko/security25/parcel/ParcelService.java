package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class ParcelService
    @since 09.03.2025 - 18.47
*/

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@AllArgsConstructor
public class ParcelService {

    private final ParcelRepository repository;

    private List<Parcel> parcels;
    @PostConstruct
    void init() {
        parcels.add(new Parcel("20450324567890", "keys keeper", 1.6, "0969572554"));
        parcels.add(new Parcel("20450324567645", "macbook pro m1", 2.3, "0969572553"));
        parcels.add(new Parcel("20450324563412", "socks", 1.6, "0969554554"));
        parcels.add(new Parcel("20450324569349", "pillow", 1.2, "0969554567"));
        parcels.add(new Parcel("20450324560987", "coat", 12.3, "0969573453"));
//        repository.saveAll(parcels);
    }

    public List<Parcel> getAllParcels() {
        return repository.findAll();
    }

    public Parcel getParcelById(String parcelId) {
        return repository.findById(parcelId).orElse(null);
    }

    public void deleteParcelById(String parcelId) {
        repository.deleteById(parcelId);
    }

    public Parcel createParcel(Parcel parcel) {
        return   repository.save(parcel);
    }

    public Parcel updateParcel(Parcel parcel) {
        return repository.save(parcel);
    }
}