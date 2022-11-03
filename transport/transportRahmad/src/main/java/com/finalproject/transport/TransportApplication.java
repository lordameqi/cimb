/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.finalproject.transport.entity.bus.*;
import com.finalproject.transport.entity.user.*;
import com.finalproject.transport.repository.*;

@SpringBootApplication
public class TransportApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository,
//			StopRepository stopRepository, AgencyRepository agencyRepository,
//			BusRepository busRepository, TripRepository tripRepository,
//			TripScheduleRepository tripScheduleRepository) {
//
//		return args -> {
//
//			// Isi tabel role
//			Role adminRole = roleRepository.findByRole(UserRole.ADMIN);
//			if (adminRole == null) {
//				adminRole = new Role();
//				adminRole.setRole(UserRole.ADMIN);
//				roleRepository.save(adminRole);
//			}
//
//			Role userRole = roleRepository.findByRole(UserRole.PASSENGER);
//			if (userRole == null) {
//				userRole = new Role();
//				userRole.setRole(UserRole.PASSENGER);
//				roleRepository.save(userRole);
//			}
//
//			// Isi user dengan admin
//			User admin = userRepository.findByEmail("admin@gmail.com");
//			if (admin == null) {
//				admin = new User();
//				admin.setEmail("admin@gmail.com");
//				admin.setPassword("$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO"); // "123456"
//				admin.setFirstName("rahmad");
//				admin.setLastName("admin");
//				admin.setMobileNumber("085264679459");
//				admin.setRoles(Arrays.asList(adminRole));
//				userRepository.save(admin);
//			}
//
//			// Isi user dengan passenger
//			User passenger = userRepository.findByEmail("passenger@gmail.com");
//			if (passenger == null) {
//				passenger = new User();
//				passenger.setEmail("passenger@gmail.com");
//				passenger.setPassword("$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO"); // "123456"
//				passenger.setFirstName("Passenger");
//				passenger.setLastName("Fadillah");
//				passenger.setMobileNumber("08023534568");
//				passenger.setRoles(Arrays.asList(userRole));
//				userRepository.save(passenger);
//			}
//
//			// isi tabel stop
//			Stop stopA = stopRepository.findByCode("PKU");
//			if (stopA == null) {
//				stopA = new Stop();
//				stopA.setName("Terminal Pekanbaru");
//				stopA.setDetail("Kota Pekanbaru");
//				stopA.setCode("PKU");
//				stopRepository.save(stopA);
//			}
//
//			Stop stopB = stopRepository.findByCode("PDG");
//			if (stopB == null) {
//				stopB = new Stop();
//				stopB.setName("Terminal Padang");
//				stopB.setDetail("Kota Padang");
//				stopB.setCode("PDG");
//				stopRepository.save(stopB);
//			}
//
//			Stop stopC = stopRepository.findByCode("ACH");
//			if (stopC == null) {
//				stopC = new Stop();
//				stopC.setName("Terminal Aceh");
//				stopC.setDetail("Kota Aceh");
//				stopC.setCode("ACH");
//				stopRepository.save(stopC);
//			}
//
//			Stop stopD = stopRepository.findByCode("PBG");
//			if (stopD == null) {
//				stopD = new Stop();
//				stopD.setName("Terminal Palembang");
//				stopD.setDetail("Kota Palembang");
//				stopD.setCode("PBG");
//				stopRepository.save(stopD);
//			}
//
//			// Isi tabel agen
//			Agency agencyA = agencyRepository.findByCode("BGS");
//			if (agencyA == null) {
//				agencyA = new Agency();
//				agencyA.setName("Bagus Jaya");
//				agencyA.setCode("BGS");
//				agencyA.setDetails("Reaching desitnations with ease");
//				agencyA.setOwner(admin);
//				agencyRepository.save(agencyA);
//			}
//
//			// Create a bus
//			Bus busA = busRepository.findByCode("SJY-01");
//			if (busA == null) {
//				busA = new Bus();
//				busA.setCode("SJY-01");
//				busA.setAgency(agencyA);
//				busA.setCapacity(60);
//				busRepository.save(busA);
//			}
//
//			// Add busA to set of buses owned by Agency 'AGENCYA'
//			if (agencyA.getBuses() == null) {
//				List<Bus> buses = new ArrayList<>();
//				agencyA.setBuses(buses);
//				agencyA.getBuses().add(busA);
//				agencyRepository.save(agencyA);
//			}
//
//			// Create a Trip
//			Trip trip = tripRepository.findBySourceStopAndDestStopAndBus(stopA, stopB, busA);
//			if (trip == null) {
//				trip = new Trip();
//				trip.setSourceStop(stopA);
//				trip.setDestStop(stopB);
//				trip.setBus(busA);
//				trip.setAgency(agencyA);
//				trip.setFare(100);
//				trip.setJourneyTime(60);
//				tripRepository.save(trip);
//			}
//
//			// Create a trip schedule
//			TripSchedule tripSchedule = tripScheduleRepository.findByTripDetailAndTripDate(trip, "2022-10-15");
//			if (tripSchedule == null) {
//				tripSchedule = new TripSchedule();
//				tripSchedule.setTripDetail(trip);
//				tripSchedule.setTripDate("2022-10-17");
//				tripSchedule.setAvailableSeats(trip.getBus().getCapacity());
//				tripScheduleRepository.save(tripSchedule);
//			}
//		};

//	}
}
