//package com.eventmaster.controllers;
//
//import com.eventmaster.models.requests.AuthRequestDto;
//import com.eventmaster.models.responses.AuthResponseDto;
//import com.eventmaster.service.IAuthService;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("api/v1/auth")
//public class AuthController {
//
//    private final IAuthService authService;
//
//    @GetMapping("/oidc-principal")
//    public OidcUser getOidcUserPrincipal(@AuthenticationPrincipal OidcUser principal) {
//        return principal;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<AuthResponseDto> login(@Valid @RequestBody AuthRequestDto authRequestDto) {
//        AuthResponseDto response = authService.login(authRequestDto);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @PostMapping("/login/{role}")
//    public ResponseEntity<AuthResponseDto> selectRole(@RequestHeader("Authorization") String accessToken, @PathVariable String role) {
//        AuthResponseDto response = authService.login(role, accessToken);
//        return ResponseEntity.ok(response);
//    }
//
//    @PostMapping("/logout")
//    public ResponseEntity<Void> logout(@RequestHeader("Authorization") String accessTokenHeader) {
//        authService.logout(accessTokenHeader);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/refresh-token")
//    public ResponseEntity<AuthResponseDto> refreshToken(@RequestHeader("Authorization") String refreshTokenHeader) {
//        AuthResponseDto response = authService.refreshToken(refreshTokenHeader);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//}
