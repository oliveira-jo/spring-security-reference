package com.devjoliveira.springsecurityreference.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class PingController {

  @PreAuthorize("hasAnyRole('ROLE_CLIENT')")
  @GetMapping("/client")
  public ResponseEntity<?> ping() {
    return ResponseEntity.ok().body("... pong, User Client ...");
  }

  @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
  @GetMapping("/admin")
  public ResponseEntity<?> save() {
    return ResponseEntity.ok().body("... pong, User Admin ...");
  }

}
