package com.gamification.core.controllers;


import com.gamification.core.RestAddress;
import com.gamification.core.entities.BaseEntity;
import com.gamification.core.mappers.person.BaseMapper;
import com.gamification.core.model.BaseDTO;
import com.gamification.core.model.InputDTO;
import com.gamification.core.model.ResultDTO;
import com.gamification.core.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public abstract class BaseController<D extends BaseDTO, E extends BaseEntity, M extends BaseMapper<D, E>> {
    protected final BaseService<E> service;
    protected final M mapper = Mappers.getMapper(getMapper());

    protected abstract Class<M> getMapper();

    @PostMapping(value = RestAddress.SAVE)
    public ResponseEntity<ResultDTO<BaseDTO>> save(@RequestBody InputDTO<D> dto) {
        service.save(mapper.dto2Entity(dto.getData()));
        return new ResponseEntity<>(ResultDTO.builder().message("CREATED").build(), HttpStatus.CREATED);
    }

}
