//package com.digistore.config;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import java.io.IOException;
//
////@Configuration
//public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
////    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//        // Extract token from request and validate it
//        String token = extractTokenFromRequest(request);
//
//        if (token != null && validateToken(token)) {
//            // If token is valid, set the authentication in the security context
//            SecurityContextHolder.getContext().setAuthentication(getAuthentication(token));
//        }
//
//        chain.doFilter(request, response);
//    }
//
//    private String extractTokenFromRequest(HttpServletRequest request) {
//        // Logic to extract token from request
//        return null;
//    }
//
//    private boolean validateToken(String token) {
//        // Logic to validate the token
//        return false;
//    }
//
//    private Authentication getAuthentication(String token) {
//        // Logic to get authentication from the token
//        return null;
//    }
//}
//
