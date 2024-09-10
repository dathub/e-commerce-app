package com.dat.ecomservice.customer.error;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {
}
