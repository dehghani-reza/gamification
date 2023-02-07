package com.gamification.core.model;


import com.gamification.core.entities.BaseEntity;

public abstract class Dto2Entity<DATA extends BaseDTO, Entity extends BaseEntity> {

    public abstract Entity convert(DATA dto);
}
