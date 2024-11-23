package uberReviewService.uber.review.service.repositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uberReviewService.uber.review.service.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

}
