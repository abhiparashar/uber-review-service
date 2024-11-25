package uberReviewService.uber.review.service.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import uberReviewService.uber.review.service.models.Booking;
import uberReviewService.uber.review.service.models.Review;
import uberReviewService.uber.review.service.repositories.BookingRepository;
import uberReviewService.uber.review.service.repositories.ReviewRepository;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
   private final ReviewRepository reviewRepository;
   private final BookingRepository  bookingRepository;
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************************");
        Review r = Review.builder()
                .content("Awesome ride")
                .rating(4.9)
                .build();
        Booking b = Booking.builder()
                    .endDate(new Date()).build();

        reviewRepository.save(r);
        bookingRepository.save(b);
        System.out.println(r.getId());
        List<Review>reviews = reviewRepository.findAll();
        for (Review review:reviews){
            System.out.println(review.getContent());
        }
        reviewRepository.deleteById(2L);
    }
}
