-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2022 at 05:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugas`
--

-- --------------------------------------------------------

--
-- Table structure for table `agency`
--

CREATE TABLE `agency` (
  `agency_id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner_user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `agency`
--

INSERT INTO `agency` (`agency_id`, `code`, `details`, `name`, `owner_user_id`) VALUES
(1, 'BGS', 'Reaching desitnations with ease', 'Bagus Jaya', 1),
(6, 'Agency-c', 'details', 'Rosalia', 1),
(9, 'Agency-BE', 'detail agen', 'BlackBird-e', 2),
(10, 'Agency-BE', 'detail agen', 'BlackBird-e', 2),
(11, 'Agency-BE', 'detail agen', 'BlackBird-e', 2),
(12, 'Agency-BA', 'detail agen', 'BlackBird-A', 7),
(13, 'Agency-BB', 'detail agen', 'BlackBird-B', 7),
(14, 'Agency-C', 'detail agen', 'Cikaro', 7),
(15, 'Agency-Duls', 'detail agen', 'Eduks', 1),
(16, 'Agency-kauuls', 'detail agen', 'Eduksa', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bus_id` bigint(20) NOT NULL,
  `capacity` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `make` varchar(255) DEFAULT NULL,
  `agency_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bus_id`, `capacity`, `code`, `make`, `agency_id`) VALUES
(1, 60, 'SJY-01', NULL, 1),
(5, 56, 'BB-9988', NULL, NULL),
(8, 66, 'BB-1199', NULL, NULL),
(9, 66, 'BB-1199', '2Angine', NULL),
(11, 66, 'BB-1199', '2Angine', 1),
(12, 66, 'BB-1199', '2Angine', 1),
(14, 96, 'BB-9009', '2Angine', 14),
(15, 96, 'Ed-9009', 'Edun', 1),
(16, 96, 'Ed-69', 'Edun', 1);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_id`, `role`) VALUES
(1, 'ADMIN'),
(2, 'PASSENGER');

-- --------------------------------------------------------

--
-- Table structure for table `stop`
--

CREATE TABLE `stop` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stop`
--

INSERT INTO `stop` (`id`, `code`, `detail`, `name`) VALUES
(1, 'PKU', 'Kota Pekanbaru', 'Terminal Pekanbaru'),
(2, 'PDG', 'Kota Padang', 'Terminal Padang'),
(3, 'ACH', 'Kota Aceh', 'Terminal Aceh'),
(4, 'PBG', 'Kota Palembang', 'Terminal Palembang');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `ticket_id` bigint(20) NOT NULL,
  `cancellable` bit(1) DEFAULT NULL,
  `journey_date` varchar(255) DEFAULT NULL,
  `seat_number` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `trip_schedule_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`ticket_id`, `cancellable`, `journey_date`, `seat_number`, `user_id`, `trip_schedule_id`) VALUES
(1, b'0', '2022-10-17', 0, 1, 1),
(2, b'0', '2022-10-15', 0, 1, 4),
(3, b'0', '2022-10-28', 0, 1, 2),
(4, b'0', '2022-10-01', 0, 1, 5),
(5, b'0', '2022-10-01', 1, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `trip`
--

CREATE TABLE `trip` (
  `trip_id` bigint(20) NOT NULL,
  `fare` int(11) NOT NULL,
  `journey_time` int(11) DEFAULT NULL,
  `agency_id` bigint(20) DEFAULT NULL,
  `bus_id` bigint(20) DEFAULT NULL,
  `dest_stop_id` bigint(20) DEFAULT NULL,
  `source_stop_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `trip`
--

INSERT INTO `trip` (`trip_id`, `fare`, `journey_time`, `agency_id`, `bus_id`, `dest_stop_id`, `source_stop_id`) VALUES
(1, 100, 60, 1, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `trip_schedule`
--

CREATE TABLE `trip_schedule` (
  `trip_schedule_id` bigint(20) NOT NULL,
  `available_seats` int(11) DEFAULT NULL,
  `trip_date` varchar(255) DEFAULT NULL,
  `trip_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `trip_schedule`
--

INSERT INTO `trip_schedule` (`trip_schedule_id`, `available_seats`, `trip_date`, `trip_id`) VALUES
(1, 59, '2022-10-17', 1),
(2, 59, '2022-10-28', 1),
(3, 60, '2022-10-16', 1),
(4, 59, '2022-10-15', 1),
(5, 58, '2022-10-01', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `email`, `first_name`, `last_name`, `mobile_number`, `password`) VALUES
(1, 'admin@gmail.com', 'rahmad', 'admin', '085264679459', '$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO'),
(2, 'passenger@gmail.com', 'Passenger', 'Fadillah', '08023534568', '$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO'),
(3, 'rachmad.com', 'admin', 'admin', '1213213123', '$2a$10$.CD47o/CIqHHv0cgtK0yie4SCK09WfKxOA2UHiU/C8lEO56.vCIyS'),
(4, 'veve.com', 'admin', 'admin', '1213213123', '$2a$10$pLiJGmR0jULuLsAvM.jeXerIKaertm3ClLHqcDVKwch57p3ST0/Oi'),
(5, 'veve1.com', 'admin', 'admin', '1213213123', '$2a$10$ugNLEn8TJLmnheXnKQMs3umvSde2hyMer72iAZnKONdjylJ8If2wi'),
(6, 'marco@gmail.com', 'marco', 'polo', '1213213123', '$2a$10$2HJ0va2tDRO.2sDMzabRjuNVc/q8GzuthqPyJGVY9aW8i1fWgcL3S'),
(7, 'marco1@gmail.com', 'marcobar', 'Veve', '0812348888', '$2b$10$ODjxyY4fd/XdMiyuePUC/O/GQiH.SidbJM1L2UqPQfyGUnV5yGAFm'),
(8, 'mario@gmail.com', 'mario', 'polo', '9900876', '$2a$10$cqphUK5e1zRrPtGhDxAARe.ls.YEdKsSDyg3NjhhiRkwr6yBA9m9.'),
(9, 'mariolawa@gmail.com', 'mario', 'polo', '9900876', '$2a$10$NS9SM1m7v5tuzHf/ppV7A.7paAIxZ41NnWzB8TY7U4vPIi8sllE9O'),
(10, 'marcobar@gmail.com', 'marco', 'polo', '1213213123', '$2a$10$Jls8QteB.Hz/RObIn7IGheJ79ISv.76rw9vh5/6Uz5qa/7tu.ePQC');

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 2),
(5, 2),
(6, 1),
(8, 1),
(9, 1),
(10, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agency`
--
ALTER TABLE `agency`
  ADD PRIMARY KEY (`agency_id`),
  ADD KEY `FK8y56hykf78k5u3wmutny52wcf` (`owner_user_id`);

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`bus_id`),
  ADD KEY `FK64nil2xxuhqde813s57dp1n9t` (`agency_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `stop`
--
ALTER TABLE `stop`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`ticket_id`),
  ADD KEY `FKdvt57mcco3ogsosi97odw563o` (`user_id`),
  ADD KEY `FKfhudhsxbslgtmbrbkd3uak4ha` (`trip_schedule_id`);

--
-- Indexes for table `trip`
--
ALTER TABLE `trip`
  ADD PRIMARY KEY (`trip_id`),
  ADD KEY `FKab03gksoo5t3lo12ga3ixnykk` (`agency_id`),
  ADD KEY `FKptvi61dd1hao1yig3in0gvcjs` (`bus_id`),
  ADD KEY `FK1evbxrekvflflkfscj2i0fwv0` (`dest_stop_id`),
  ADD KEY `FK5ln8w8n974euslk976dh6x7k5` (`source_stop_id`);

--
-- Indexes for table `trip_schedule`
--
ALTER TABLE `trip_schedule`
  ADD PRIMARY KEY (`trip_schedule_id`),
  ADD KEY `FKaqjflucdvoypakmjxtb7n2mmm` (`trip_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  ADD KEY `FK859n2jvi8ivhui0rl0esws6o` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agency`
--
ALTER TABLE `agency`
  MODIFY `agency_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `bus`
--
ALTER TABLE `bus`
  MODIFY `bus_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `role_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `stop`
--
ALTER TABLE `stop`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `ticket_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `trip`
--
ALTER TABLE `trip`
  MODIFY `trip_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `trip_schedule`
--
ALTER TABLE `trip_schedule`
  MODIFY `trip_schedule_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `agency`
--
ALTER TABLE `agency`
  ADD CONSTRAINT `FK8y56hykf78k5u3wmutny52wcf` FOREIGN KEY (`owner_user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `bus`
--
ALTER TABLE `bus`
  ADD CONSTRAINT `FK64nil2xxuhqde813s57dp1n9t` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`agency_id`);

--
-- Constraints for table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `FKdvt57mcco3ogsosi97odw563o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `FKfhudhsxbslgtmbrbkd3uak4ha` FOREIGN KEY (`trip_schedule_id`) REFERENCES `trip_schedule` (`trip_schedule_id`);

--
-- Constraints for table `trip`
--
ALTER TABLE `trip`
  ADD CONSTRAINT `FK1evbxrekvflflkfscj2i0fwv0` FOREIGN KEY (`dest_stop_id`) REFERENCES `stop` (`id`),
  ADD CONSTRAINT `FK5ln8w8n974euslk976dh6x7k5` FOREIGN KEY (`source_stop_id`) REFERENCES `stop` (`id`),
  ADD CONSTRAINT `FKab03gksoo5t3lo12ga3ixnykk` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`agency_id`),
  ADD CONSTRAINT `FKptvi61dd1hao1yig3in0gvcjs` FOREIGN KEY (`bus_id`) REFERENCES `bus` (`bus_id`);

--
-- Constraints for table `trip_schedule`
--
ALTER TABLE `trip_schedule`
  ADD CONSTRAINT `FKaqjflucdvoypakmjxtb7n2mmm` FOREIGN KEY (`trip_id`) REFERENCES `trip` (`trip_id`);

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
