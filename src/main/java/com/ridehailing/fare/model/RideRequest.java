package com.ridehailing.fare.model;

import com.ridehailing.fare.strategy.FareStrategy;

public class RideRequest {
    private String customerName;
    private double distanceKm;
    // DIP: Phụ thuộc vào interface FareStrategy
    private FareStrategy fareStrategy;

    public RideRequest(String customerName, double distanceKm, FareStrategy fareStrategy) {
        this.customerName = customerName;
        this.distanceKm = distanceKm;
        this.fareStrategy = fareStrategy;
    }

    // Tự tính cước phí của chuyến đi
    public double getFinalFare() {
        return fareStrategy.calculateFare(distanceKm);
    }

    public String getCustomerName() { return customerName; }
    public double getDistanceKm() { return distanceKm; }
    public FareStrategy getFareStrategy() { return fareStrategy; }
}