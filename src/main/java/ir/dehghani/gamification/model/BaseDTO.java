package ir.dehghani.gamification.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class BaseDTO extends MainBaseDTO{
    private LocalDateTime createDate;
    private Long createById;
    private LocalDateTime updateDate;
    private Long updateById;
    private LocalDateTime deleteDate;
    private Long deleteById;
    private Boolean isDeleted;
    private Integer rowLevelId;
    private Integer priority;
}
