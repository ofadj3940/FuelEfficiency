/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.Scanner;

/**
 *
 * @author ofadj3940
 */
public class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       Vehicle car = new Car();
       Vehicle hCar = new Hybrid_Car();
       Vehicle truck = new Truck();
       Vehicle mCycle = new Motorcycle();
       
       
       System.out.println("Please enter the amount of fuel you would\n"
               + "to find how far the cars can travel");
       
       double userIn = sc.nextDouble();
       
       System.out.println("Car distance:"+car.getDistance(userIn)
                         +"\nHybrid Car distance:"+hCar.getDistance(userIn)
                         +"\nTruck distance:"+truck.getDistance(userIn)
                         +"\nMotorcyle distance:"+mCycle.getDistance(userIn));
       
       
    }
    
}
