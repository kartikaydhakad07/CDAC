import java.util.Scanner;

class TollBoothRevenueManager {
    float carRate;
    float truckRate;
    float motorcycleRate;
    int numCars;
    int numTrucks;
    int numMotorcycles;
    float totalRevenue;

    public void setTollRates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the toll rate for a Car : ");
        carRate = sc.nextFloat();
        System.out.println("Enter the toll rate for a Truck : ");
        truckRate = sc.nextFloat();
        System.out.println("Enter the toll rate for a Motorcycle : ");
        motorcycleRate = sc.nextFloat();
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cars that passed: ");
        numCars = sc.nextInt(); 
        System.out.println("Enter the number of Trucks that passed: ");
        numTrucks = sc.nextInt();
        System.out.println("Enter the number of Motorcycles that passed: ");
        numMotorcycles = sc.nextInt();
    }
    public void calculateRevenue() {
        totalRevenue = (numCars * carRate) + (numTrucks * truckRate) + (numMotorcycles * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = numCars + numTrucks + numMotorcycles;
        System.out.println("Total number of vehicles passed: " + totalVehicles);
        System.out.println("Total revenue collected: " + String.format("%.2f", totalRevenue));
    }
}
public class Toll{
    public static void main(String[] args) {
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();
        tollBooth.setTollRates();
        tollBooth.acceptRecord();
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }
}
