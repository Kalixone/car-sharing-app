package mate.academy.car_sharing_app.dto.payment;

import mate.academy.car_sharing_app.model.Payment;

public record PaymentRequestDto(
        Long rentalId,
        Payment.Type paymentType
) {
}