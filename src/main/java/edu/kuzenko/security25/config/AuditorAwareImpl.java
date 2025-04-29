package edu.kuzenko.security25.config;

/*
    @author yaroslavkuzenko
    @project security25
    @class AuditorAwareImpl
    @since 29.04.2025 - 21.55
*/

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(System.getProperty("user.name"));
    }
}
