package uberReviewService.uber.review.service.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "booking_review")
public class Review extends BaseModel {

    private Double rating;

    @Column(nullable = false)
    private String content;

    @Override
    public String toString() {
        return "Review: " + this.content + " " + this.rating + " " + this.createdAt;
    }
}
