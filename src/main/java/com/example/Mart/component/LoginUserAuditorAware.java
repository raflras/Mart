package com.example.Mart.component;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class LoginUserAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Soo");
    }
}
