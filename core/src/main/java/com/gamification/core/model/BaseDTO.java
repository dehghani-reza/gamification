package com.gamification.core.model;

import com.gamification.core.enumeration.EN_STATE;
import lombok.*;
@Data
@NoArgsConstructor
public abstract class BaseDTO {
    private Long id;
    private Long hashCode;
    private String ip;
    private Long version;
    private EN_STATE state;
    private Integer rowLevelId;
    private Integer priority;
}
