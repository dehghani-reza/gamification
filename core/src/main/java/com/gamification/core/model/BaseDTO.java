package com.gamification.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data@NoArgsConstructor
public abstract class BaseDTO {

    private Long id;
    private Short version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
