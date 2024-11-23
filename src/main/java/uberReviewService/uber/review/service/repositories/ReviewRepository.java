package uberReviewService.uber.review.service.repositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************************");
    }
}
