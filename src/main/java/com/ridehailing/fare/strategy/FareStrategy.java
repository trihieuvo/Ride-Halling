package com.ridehailing.fare.strategy;

// (ISP) Interface này chỉ định nghĩa trách nhiệm áp dụng giá cước.
public interface FareStrategy {
    double calculateFare(double distanceKm);
    String getServiceDescription();
}