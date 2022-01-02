-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2019 at 01:24 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diu_blood_management_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `key` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`key`) VALUES
('13579');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `DonorId` varchar(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` varchar(30) NOT NULL,
  `Bg` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Id` varchar(30) NOT NULL,
  `Contact` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `donors`
--

CREATE TABLE `donors` (
  `DonorId` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `Bg` varchar(30) NOT NULL,
  `Id` varchar(30) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Added by` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donors`
--

INSERT INTO `donors` (`DonorId`, `Name`, `Age`, `Gender`, `Bg`, `Id`, `Address`, `Contact`, `Added by`) VALUES
('1811501', 'Ishmam Ruhan', '20', 'Male', 'B+', '181-15-10769', 'Dhanmondi', '01709266053', 'Admin'),
('1811502', 'Aladin', '21', 'Male', 'B-', 'President Of Wadia', 'Wadia', '+0070007007', 'Ishmam');

-- --------------------------------------------------------

--
-- Table structure for table `requests`
--

CREATE TABLE `requests` (
  `requestId` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Bg` varchar(30) NOT NULL,
  `Contact1` varchar(30) NOT NULL,
  `Contact2` varchar(30) NOT NULL,
  `Time & Date` varchar(30) NOT NULL,
  `Request by` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `requests`
--

INSERT INTO `requests` (`requestId`, `Name`, `Address`, `Bg`, `Contact1`, `Contact2`, `Time & Date`, `Request by`) VALUES
('1', 'Test01', 'Square Hospital', 'O+', '01XXXXXXXXX', '01XXXXXXXXX', '05:39 PM  18/03/2019', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `settings`
--

CREATE TABLE `settings` (
  `sure` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `settings`
--

INSERT INTO `settings` (`sure`) VALUES
('1');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Username`, `Password`) VALUES
('Ishmam', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `AdminKey` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `Password`, `AdminKey`) VALUES
('Admin', '12345', 0);

-- --------------------------------------------------------

--
-- Table structure for table `userselection`
--

CREATE TABLE `userselection` (
  `user` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userselection`
--

INSERT INTO `userselection` (`user`) VALUES
('Open');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
