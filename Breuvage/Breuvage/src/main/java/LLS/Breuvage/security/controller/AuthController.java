package LLS.Breuvage.security.controller;

import LLS.Breuvage.security.jwt.JwtUtils;
import LLS.Breuvage.security.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final JwtUtils utils;
    private final AuthenticationManager authenticationManager;


    @PostMapping("/login")
    public ResponseEntity<?> logInUser(@RequestBody LoginRequest request){
        try {
            Authentication authentication =authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.username(), request.password()));
                String token = utils.generateToken((UserDetails) authentication.getPrincipal());
            System.out.println(" token" + token);
                return ResponseEntity.ok(token + request.password() + request.username());
        }catch (BadCredentialsException ex){
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
    }
}
}
