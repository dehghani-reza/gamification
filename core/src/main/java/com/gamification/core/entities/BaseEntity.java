package com.gamification.core.entities;

import com.gamification.core.enumeration.EN_STATE;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseEntity extends MainBaseEntity {
    @Column(name = "CREATE_DATE", nullable = false, updatable = false)
    private LocalDateTime createDate;
    @Column(name = "CREATE_BY_ID", nullable = false, updatable = false)
    private Long createById;
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;
    @Column(name = "UPDATE_BY_ID")
    private Long updateById;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATE")
    private EN_STATE state;
    @Column(name = "ROW_LEVEL_ID")
    private Integer rowLevelId;
    @Column(name = "PRIORITY")
    private Integer priority;
}
