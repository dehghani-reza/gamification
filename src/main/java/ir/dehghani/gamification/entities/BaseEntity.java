package ir.dehghani.gamification.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseEntity extends MainBaseEntity {
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
