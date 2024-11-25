package uberReviewService.uber.review.service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "passenger")
    List<Booking>bookings = new ArrayList<>();

}
