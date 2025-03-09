package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class Parcel
    @since 09.03.2025 - 18.44
*/

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parcel {
    @Id
    private String id;
    private String number;
    private String description;
    private Number weight;
    private String sender_phone;

    public Parcel(String number, String description, Number weight, String sender_phone) {
        this.number = number;
        this.description = description;
        this.weight = weight;
        this.sender_phone = sender_phone;
    }
}