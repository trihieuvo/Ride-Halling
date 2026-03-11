package com.ridehailing.fare.service;

import com.ridehailing.fare.model.RideRequest;
import java.util.List;

public class RevenueCalculator {
    // OCP & LSP: Nhận danh sách các RideRequest, tính tổng không cần biết chi tiết bên trong.
    public double calculateTotalRevenue(List<RideRequest> rides) {
        double total = 0;
        for (RideRequest ride : rides) {
            total += ride.getFinalFare();
        }
        return total;
    }
}