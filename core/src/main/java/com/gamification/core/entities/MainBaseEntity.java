package com.gamification.core.entities;

import com.gamification.core.entities.base.HibernateStaticValues;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class MainBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = HibernateStaticValues.ID_SEQ_GENERATOR)
    private Long id;
    private String ip;
    @Version
    Long version;
}
