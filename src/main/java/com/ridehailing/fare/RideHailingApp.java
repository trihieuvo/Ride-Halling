package com.ridehailing.fare;

import com.ridehailing.fare.model.RideRequest;
import com.ridehailing.fare.output.ConsoleInvoicePrinter;
import com.ridehailing.fare.output.InvoicePrinter;
import com.ridehailing.fare.service.RevenueCalculator;
import com.ridehailing.fare.strategy.CarFare;
import com.ridehailing.fare.strategy.FareStrategy;
import com.ridehailing.fare.strategy.MotorbikeFare;

import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        System.out.println("--- KHỞI ĐỘNG HỆ THỐNG TÍNH CƯỚC XE (SOLID DEMO) ---\n");

        // 1. Cấu hình & Lắp ráp dependencies
        RevenueCalculator calculator = new RevenueCalculator();
        InvoicePrinter printer = new ConsoleInvoicePrinter();

        // 2. Tạo các chiến lược tính cước (Strategies)
        FareStrategy bikeStrategy = new MotorbikeFare();
        FareStrategy carStrategy = new CarFare();

        // 3. Khởi tạo danh sách các chuyến đi
        RideRequest ride1 = new RideRequest("Nguyễn Văn A", 5.5, bikeStrategy);
        RideRequest ride2 = new RideRequest("Trần Thị B", 12.0, carStrategy);
        RideRequest ride3 = new RideRequest("Lê Văn C", 2.0, bikeStrategy);

        List<RideRequest> dailyRides = List.of(ride1, ride2, ride3);

        // 4. Tính toán và In báo cáo
        double totalRevenue = calculator.calculateTotalRevenue(dailyRides);
        printer.printInvoice(dailyRides, totalRevenue);
    }
}