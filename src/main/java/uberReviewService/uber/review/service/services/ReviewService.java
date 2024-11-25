package uberReviewService.uber.review.service.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import uberReviewService.uber.review.service.models.Booking;
import uberReviewService.uber.review.service.models.Review;
import uberReviewService.uber.review.service.repositories.BookingRepository;
import uberReviewService.uber.review.service.repositories.ReviewRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    ReviewRepository reviewRepository;
    BookingRepository  bookingRepository;
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************************");
        Review r = Review.builder()
                .content("Amazing ride")
                .rating(4.9)
                .build();
        Booking b = Booking.builder()
                .review(r)
                .endDate(new Date())
                .build();
        bookingRepository.save(b);
        System.out.println(r.getId());
        List<Review>reviews = reviewRepository.findAll();
        for (Review review:reviews){
            System.out.println(review.getContent());
        }
        Optional<Booking> b = bookingRepository.findById(1L);
        if(b.isPresent()){
            bookingRepository.delete(b.get());
        }

//        reviewRepository.deleteById(2L);
    }
}
