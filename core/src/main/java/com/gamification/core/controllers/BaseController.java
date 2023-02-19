package com.gamification.core.controllers;


import com.gamification.core.RestAddress;
import com.gamification.core.entities.BaseEntity;
import com.gamification.core.mappers.BaseMapper;
import com.gamification.core.model.BaseDTO;
import com.gamification.core.model.InputDTO;
import com.gamification.core.model.ResultDTO;
import com.gamification.core.services.BaseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public abstract class BaseController<D extends BaseDTO, E extends BaseEntity, M extends BaseMapper<D, E>> {
    protected final BaseService<E> service;
    protected final M mapper = Mappers.getMapper(getMapper());

    protected abstract Class<M> getMapper();

    @PostMapping(value = RestAddress.SAVE)
    public ResponseEntity<ResultDTO<BaseDTO>> save(@ApiParam(value = "this is a model that you fill for saving data")
                                                   @RequestBody InputDTO<D> dto) {
        E e = mapper.dto2Entity(dto.getData());
        e.setCreateById(dto.getUserId());//FIXME get from JWT
        e.setCreateDate(LocalDateTime.now());
        service.save(e);
        return new ResponseEntity<>(ResultDTO.builder().message("CREATED").build(), HttpStatus.CREATED);
    }

}
