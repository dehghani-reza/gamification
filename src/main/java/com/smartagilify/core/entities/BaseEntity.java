package com.smartagilify.core.entities;

import com.smartagilify.core.entities.base.HibernateStaticValues;
import com.smartagilify.core.enumerations.EN_STATE;
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
    @Column(name = HibernateStaticValues.CREATE_DATE, nullable = false, updatable = false)
    private LocalDateTime createDate;
    @Column(name = HibernateStaticValues.CREATE_BY_ID, nullable = false, updatable = false)
    private Long createById;
    @Column(name = HibernateStaticValues.UPDATE_DATE)
    private LocalDateTime updateDate;
    @Column(name = HibernateStaticValues.UPDATE_BY_ID)
    private Long updateById;
    @Enumerated(EnumType.STRING)
    @Column(name = HibernateStaticValues.STATE)
    private EN_STATE state;
    @Column(name = HibernateStaticValues.ROW_LEVEL_ID)
    private Integer rowLevelId;
    @Column(name = HibernateStaticValues.PRIORITY)
    private Integer priority;
}
