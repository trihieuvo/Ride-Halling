package com.ridehailing.fare.output;

import com.ridehailing.fare.model.RideRequest;
import java.util.List;

public interface InvoicePrinter {
    void printInvoice(List<RideRequest> rides, double totalRevenue);
}