import client from "./client";

export const completeRental = ({
    rentalId,
    acceptance
}) => client.post('/rental-service/complete-rental', {
    rentalId,
    acceptance
});

export const getRentalByRentalId = owner => client.get(`/rental-service/${owner}/my_rentals`);

export const getRentalsByOwner = owner => client.get(`/rental-service/${owner}/borrow_rentals`);

export const requestRentals = owner => client.get(`/rental-service/${owner}/request-rentals`);

export const borrowRentals = owner => client.get(`/rental-service/${owner}/borrow_rentals`);