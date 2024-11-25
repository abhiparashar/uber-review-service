package uberReviewService.uber.review.service.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Review review;
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    private Long totalDistance;

    @Temporal(value = TemporalType.TIMESTAMP )
    private Date startDate;
    @Temporal(value = TemporalType.TIMESTAMP )
    private Date endDate;
}
