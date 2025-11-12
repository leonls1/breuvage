package LLS.Breuvage.controller;

import LLS.Breuvage.security.jwt.JwtUtils;
import LLS.Breuvage.security.request.LoginRequest;
import LLS.Breuvage.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final JwtUtils utils;
    private final AuthenticationManager authenticationManager;
    private final IUserService service;

    @PostMapping("/login")
    public ResponseEntity<?> logInUser(@RequestBody LoginRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.username(), request.password()));
            String token = utils.generateToken((UserDetails) authentication.getPrincipal());
            System.out.println(" token" + token);
            return ResponseEntity.ok(token + request.password() + request.username());
        } catch (BadCredentialsException ex) {
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/logout/{id}")
    public ResponseEntity<?> logOutUser(@PathVariable Long id){
        service.logoutUser(id);
        return new ResponseEntity<>("user session closed", HttpStatus.ACCEPTED);
    }

}
