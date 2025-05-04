package edu.kuzenko.security25.auth;

/*
    @author yaroslavkuzenko
    @project security25
    @class AuthenticationRequest
    @since 04.05.2025 - 22.15
*/

import lombok.Data;
import lombok.NonNull;
@Data
public class AuthenticationRequest {
    private String email;
    private String password;;
}
