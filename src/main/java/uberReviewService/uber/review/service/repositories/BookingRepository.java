package uberReviewService.uber.review.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uberReviewService.uber.review.service.models.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
