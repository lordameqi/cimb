/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import javax.validation.Valid;

import com.finalproject.transport.controller.request.TripAddRequest;
//import com.finalproject.transport.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.web.bind.annotation.*;

import com.finalproject.transport.config.JwtToken;
import com.finalproject.transport.controller.request.UserSignupRequest;
import com.finalproject.transport.dto.model.user.UserDto;
import com.finalproject.transport.dto.response.Response;
import com.finalproject.transport.entity.bus.Agency;
import com.finalproject.transport.entity.bus.Bus;
import com.finalproject.transport.entity.security.JwtRequest;
import com.finalproject.transport.entity.security.JwtResponse;
import com.finalproject.transport.entity.user.User;
import com.finalproject.transport.repository.AgencyRepository;
import com.finalproject.transport.repository.BusRepository;
import com.finalproject.transport.service.JwtUserDetailsService;
import com.finalproject.transport.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtToken jwtToken;

	@Autowired
	private JwtUserDetailsService jwtUserDetailsService;

	@Autowired
	private AgencyRepository agencyRepository;

	@Autowired
	private BusRepository busRepository;

//	@Autowired
//	private AgencyService agencyService;

    @PostMapping("/home/signup")
    public Response signup(@RequestBody @Valid UserSignupRequest userSignupRequest) {
        return Response.ok().setPayload(registerUser(userSignupRequest, false));
    }
	private UserDto registerUser(UserSignupRequest userSignupRequest, boolean isAdmin) {
		UserDto userDto = new UserDto()
				.setEmail(userSignupRequest.getEmail())
				.setPassword(userSignupRequest.getPassword())
				.setFirstName(userSignupRequest.getFirstName())
				.setLastName(userSignupRequest.getLastName())
				.setMobileNumber(userSignupRequest.getMobileNumber())
				.setAdmin(isAdmin);

		return userService.signup(userDto);
	}

	@PostMapping("/home/admin")
	public Response signupAdmin(@RequestBody @Valid UserSignupRequest userSignupRequest) {
		return Response.ok().setPayload(registerUser(userSignupRequest, true));
	}
	private UserDto registerAdmin(UserSignupRequest userSignupRequest, boolean isAdmin) {
		UserDto userDto = new UserDto()
				.setEmail(userSignupRequest.getEmail())
				.setPassword(userSignupRequest.getPassword())
				.setFirstName(userSignupRequest.getFirstName())
				.setLastName(userSignupRequest.getLastName())
				.setMobileNumber(userSignupRequest.getMobileNumber())
				.setAdmin(isAdmin);

		return userService.signupAdmin(userDto);
	}


    @PostMapping("/home/auth")
	public Response createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());

		final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(authenticationRequest.getEmail());

		final String token = jwtToken.generateToken(userDetails);

		return Response.ok().setPayload(new JwtResponse(token));
	}

	private void authenticate(String email, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('PASSENGER')")
    public Response update(@RequestBody User user, @PathVariable Long id) {
        try {
            Optional<User> exitUser = userService.getUserById(id);
            user.setId(id);
			String p = user.getPassword();
			user.setPassword(new BCryptPasswordEncoder(BCryptVersion.$2B).encode(p));
            userService.save(user);
            return Response.ok();
        } catch (NoSuchElementException e) {
            return Response.notFound();
        }
    }

	@PostMapping("/createAgency")
	@PreAuthorize("hasRole('PASSENGER')")
	public Response createAgency(@RequestBody Agency agency){
		return Response.ok().setPayload(agencyRepository.save(agency));
	}

	@PostMapping("/buss")
	@PreAuthorize("hasRole('PASSENGER')")
	public ResponseEntity<Bus> add(@RequestBody Bus bus) {
		userService.postBuss(bus);
		return new ResponseEntity<Bus>(bus, HttpStatus.OK);
	}

//	@PostMapping("/addtrip")
//	@PreAuthorize("hasRole('PASSENGER')")
//	public Response addBus(@RequestBody TripAddRequest tripRequest){
//		agencyService.addTrip(tripRequest);
//		return Response.ok();
//	}

//	public Response addBus(@RequestBody Bus bus){
//		return Response.ok().setPayload(busRepository.save(bus));
//	}
}
