package net.mooctest;

public class Vehicle {
    private String vehicleType; // �������� e.g., "Standard Vehicle", "Heavy Vehicle"
    private double maxLoad; // ���������
    private boolean requiresTollFreeRoute; // ָʾ�Ƿ�Ӧ�ܿ��շѹ�·
    private double fuelCapacity; //������ص�����
    private double currentFuel; // ��ǰȼ�ͻ��ص���
    private double fuelConsumptionPerKm; // ÿ�����ȼ��/��������
    private double minFuelAtEnd; // ����Ŀ�ĵغ�����ʣ��ȼ����λ
    private boolean emergencyVehicle; // ָʾ�Ƿ�Ϊ��������

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
