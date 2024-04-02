package com.exam;

import java.util.List;
import java.util.ArrayList;
class Vehicle {
   String id, type;
   boolean available;
   int availableDays;
   public Vehicle(String id, String type, boolean available, int availableDays) {
this.id
= id; this.type = type; this.available = available; this.availableDays = availableDays;
   }
}
class RentalRequest {
   String vehicleType;
   int rentalPeriod;
   public RentalRequest(String vehicleType, int rentalPeriod) {
       this.vehicleType = vehicleType; this.rentalPeriod = rentalPeriod;
   }
}
class InvalidRentalPeriodException extends Exception {
   public InvalidRentalPeriodException(String message) { super(message); }
}
class VehicleUnavailableException extends Exception {
   public VehicleUnavailableException(String message) { super(message); }
}
class VehicleRentalSystem {
   List<Vehicle> vehicles;
   public VehicleRentalSystem(List<Vehicle> vehicles) { this.vehicles = vehicles; }
   public void processRentalRequest(RentalRequest rentalRequest) throws VehicleUnavailableException, InvalidRentalPeriodException {
       if (rentalRequest.rentalPeriod < 1) throw new InvalidRentalPeriodException("Invalid rental period.");
       for (Vehicle vehicle : vehicles) {
           if (vehicle.type.equals(rentalRequest.vehicleType) && vehicle.available && vehicle.availableDays >= rentalRequest.rentalPeriod) {
               vehicle.available = false; vehicle.availableDays -= rentalRequest.rentalPeriod;
               double totalCharge = rentalRequest.rentalPeriod * 50.0; // Assuming a flat rate of $30 per day
               System.out.println("Rental Confirmation:\n- Vehicle ID: " +
vehicle.id
+ "\n- Rental Period: " + rentalRequest.rentalPeriod + " days\n- Total Rental Charge: $" + totalCharge);
               return;
           }
       }
       throw new VehicleUnavailableException("Requested vehicle type \"" + rentalRequest.vehicleType + "\" is unavailable.");
   }
}