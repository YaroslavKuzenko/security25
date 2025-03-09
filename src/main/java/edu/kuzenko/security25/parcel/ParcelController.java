package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class ParcelController
    @since 09.03.2025 - 18.46
*/

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parcels")
@AllArgsConstructor
public class ParcelController {
    private final ParcelService service;

    @GetMapping
    public List<Parcel> getParcels() {
        return service.getAllParcels();
    }

    @GetMapping("/{parcelId}")
    public Parcel getParcelById(@PathVariable String parcelId) {
        return service.getParcelById(parcelId);
    }

    @DeleteMapping("/{parcelId}")
    public void deleteParcelById(@PathVariable String parcelId) {
        service.deleteParcelById(parcelId);
    }

    @PostMapping
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return service.createParcel(parcel);
    }

    @PutMapping
    public Parcel updateParcel(@RequestBody Parcel parcel) {
        return service.updateParcel(parcel);
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "Hello Unknown";
    }
}