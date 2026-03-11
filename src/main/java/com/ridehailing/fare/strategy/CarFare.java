package com.ridehailing.fare.strategy;

public class CarFare implements FareStrategy {
    private final double RATE_PER_KM = 12500.0; // 12.500 VNĐ/km

    @Override
    public double calculateFare(double distanceKm) {
        if (distanceKm < 0) throw new IllegalArgumentException("Khoảng cách không hợp lệ");
        return distanceKm * RATE_PER_KM;
    }

    @Override
    public String getServiceDescription() {
        return "Ô tô 4 chỗ (Car)";
    }
}