package com.gamification.core.mappers.person;

public interface BaseMapper<D, E> {
    D entity2Dto(E entity);
    E dto2Entity(D dto);
}
