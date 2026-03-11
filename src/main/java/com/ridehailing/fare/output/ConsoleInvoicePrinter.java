package com.ridehailing.fare.output;

import com.ridehailing.fare.model.RideRequest;
import java.util.List;

public class ConsoleInvoicePrinter implements InvoicePrinter {
    @Override
    public void printInvoice(List<RideRequest> rides, double totalRevenue) {
        System.out.println("\n===== BÁO CÁO DOANH THU CUỐC XE =====");
        System.out.printf("%-20s | %-10s | %-20s | %-15s\n",
                "Khách hàng", "Quãng đường", "Loại dịch vụ", "Cước phí");
        System.out.println("-------------------------------------------------------------------------");

        for (RideRequest ride : rides) {
            System.out.printf("%-20s | %5.1f km  | %-20s | %,.0f VNĐ\n",
                    ride.getCustomerName(),
                    ride.getDistanceKm(),
                    ride.getFareStrategy().getServiceDescription(),
                    ride.getFinalFare());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("TỔNG DOANH THU: %,.0f VNĐ\n", totalRevenue);
        System.out.println("=====================================");
    }
}