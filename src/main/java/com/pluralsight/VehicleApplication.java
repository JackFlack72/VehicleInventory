package com.pluralsight;

public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
/*
vehicleId,makeModel,color,odometerReading,price
101121,Ford Explorer,Red,45000,13500
101122,Toyota Camry,Blue,60000,11000
101123,Chevrolet Malibu,Black,50000,9700
101124,Honda Civic,White,70000,7500
101125,Subaru Outback,Green,55000,14500
101126,Jeep Wrangler,Yellow,30000,16000
 */
        Vehicle vehicle1 = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[0] = vehicle1;

        Vehicle vehicle2 = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[1] = vehicle2;

        Vehicle vehicle3 = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[2] = vehicle3;

        Vehicle vehicle4 = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[3] = vehicle4;

        Vehicle vehicle5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[4] = vehicle5;

        Vehicle vehicle6 = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        vehicles[5] = vehicle6;

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
