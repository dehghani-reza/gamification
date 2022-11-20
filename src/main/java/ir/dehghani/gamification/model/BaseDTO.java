package ir.dehghani.gamification.model;

import lombok.*;

import java.time.LocalDateTime;

@Data@NoArgsConstructor
public abstract class BaseDTO {

    private Long id;
    private Short version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
