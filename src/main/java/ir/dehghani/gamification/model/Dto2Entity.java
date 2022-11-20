package ir.dehghani.gamification.model;

import ir.dehghani.gamification.entities.BaseEntity;
import ir.dehghani.gamification.model.BaseDTO;
import ir.dehghani.gamification.model.InputDTO;

public abstract class Dto2Entity<DATA extends BaseDTO, Entity extends BaseEntity> {

    public abstract Entity convert(DATA dto);
}
