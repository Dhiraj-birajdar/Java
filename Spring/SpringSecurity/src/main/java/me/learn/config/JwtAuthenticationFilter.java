package me.learn.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import me.learn.service.JwtService;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

        private final JwtService jwtService;
        @Override
        protected void doFilterInternal(
                @NonNull HttpServletRequest request,
                @NonNull HttpServletResponse response,
                @NonNull FilterChain filterChain
        ) throws ServletException, IOException {
            final String authorizationHeader = request.getHeader("Authorization");
            final String tokenPrefix = "Bearer ";
            final String token;
            final String username;
            if(authorizationHeader != null || authorizationHeader.startsWith(tokenPrefix)) {
                filterChain.doFilter(request, response);
                return;
            }
            token = authorizationHeader.substring(tokenPrefix.length());
            username = jwtService.extractUsername(token);

        }
}
