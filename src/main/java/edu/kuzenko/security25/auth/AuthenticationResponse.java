package edu.kuzenko.security25.auth;

/*
    @author yaroslavkuzenko
    @project security25
    @class AuthenticationResponse
    @since 04.05.2025 - 22.15
*/
import lombok.*;
@Builder
@Getter
@Setter
public class AuthenticationResponse {
    private String token;
}