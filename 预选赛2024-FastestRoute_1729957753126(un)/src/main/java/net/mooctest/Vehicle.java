package net.mooctest;

public class Vehicle {
    private String vehicleType; // 车辆类型 e.g., "Standard Vehicle", "Heavy Vehicle"
    private double maxLoad; // 最大负载能力
    private boolean requiresTollFreeRoute; // 指示是否应避开收费公路
    private double fuelCapacity; //油箱或电池的容量
    private double currentFuel; // 当前燃油或电池电量
    private double fuelConsumptionPerKm; // 每公里的燃料/电力消耗
    private double minFuelAtEnd; // 到达目的地后的最低剩余燃油油位
    private boolean emergencyVehicle; // 指示是否为紧急车辆

    public Vehicle(String vehicleType, double maxLoad, boolean requiresTollFreeRoute,
                   double fuelCapacity, double currentFuel, double fuelConsumptionPerKm,
                   double minFuelAtEnd, boolean emergencyVehicle) {
        this.vehicleType = vehicleType;
        this.maxLoad = maxLoad;
        this.requiresTollFreeRoute = requiresTollFreeRoute;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.minFuelAtEnd = minFuelAtEnd;
        this.emergencyVehicle = emergencyVehicle;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public boolean requiresTollFreeRoute() {
        return requiresTollFreeRoute;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double getMinFuelAtEnd() {
        return minFuelAtEnd;
    }

    public boolean isEmergencyVehicle() {
        return emergencyVehicle;
    }

    public void consumeFuel(double distance) {
        this.currentFuel -= distance * fuelConsumptionPerKm;
    }

    public boolean needsRefueling(double distanceToEnd) {
        return (currentFuel - distanceToEnd * fuelConsumptionPerKm) < minFuelAtEnd;
    }

    public void refuel(double amount) {
        this.currentFuel = Math.min(fuelCapacity, this.currentFuel + amount);
    }
}
