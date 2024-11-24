package uberReviewService.uber.review.service.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import uberReviewService.uber.review.service.models.Review;
import uberReviewService.uber.review.service.repositories.ReviewRepository;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************************");
        Review r = Review.builder()
                .content("Awesome ride")
                .rating(4.9)
                .build();
        reviewRepository.save(r);
        System.out.println(r.getId());
        List<Review>reviews = reviewRepository.findAll();
        for (Review review:reviews){
            System.out.println(review.getContent());
        }
        reviewRepository.deleteById(2L);
    }
}
