package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class ParcelController
    @since 09.03.2025 - 18.46
*/

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parcels")
@AllArgsConstructor
public class ParcelController {
    private final ParcelService service;

    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN', 'SUPERADMIN')")
    @GetMapping
    public List<Parcel> getParcels() {
        return service.getAllParcels();
    }

    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN', 'SUPERADMIN')")
    @GetMapping("/{parcelId}")
    public Parcel getParcelById(@PathVariable String parcelId) {
        return service.getParcelById(parcelId);
    }

    @PreAuthorize("hasAuthority('SUPERADMIN')")
    @DeleteMapping("/{parcelId}")
    public void deleteParcelById(@PathVariable String parcelId) {
        service.deleteParcelById(parcelId);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    @PostMapping
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return service.createParcel(parcel);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    @PutMapping
    public Parcel updateParcel(@RequestBody Parcel parcel) {
        return service.updateParcel(parcel);
    }

    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN', 'SUPERADMIN')")
    @GetMapping("/user")
    public String helloUser() {
        return "Hello User";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "Hello Unknown";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/stranger")
    public String helloStranger() {
        return "Hello Stranger";
    }
}