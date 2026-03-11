package com.ridehailing.fare.strategy;

public class MotorbikeFare implements FareStrategy {
    private final double RATE_PER_KM = 6000.0; // 6.000 VNĐ/km

    @Override
    public double calculateFare(double distanceKm) {
        if (distanceKm < 0) throw new IllegalArgumentException("Khoảng cách không hợp lệ");
        return distanceKm * RATE_PER_KM;
    }

    @Override
    public String getServiceDescription() {
        return "Xe máy (Bike)";
    }
}