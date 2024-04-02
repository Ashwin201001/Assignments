package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Vehiclemain {
	   public static void main(String[] args) {
	       List<Vehicle> vehicles = new ArrayList<>();
	       vehicles.add(new Vehicle("1", "Fourwheeler", true, 5));
	       vehicles.add(new Vehicle("2", "Twowheeler", true, 2));
	       VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);
	       RentalRequest request = new RentalRequest("Fourwheeler", 3);
	       try { rentalSystem.processRentalRequest(request); }
	       catch (VehicleUnavailableException | InvalidRentalPeriodException e) { System.out.println("Exception: " + e.getMessage()); }
	   }
	}