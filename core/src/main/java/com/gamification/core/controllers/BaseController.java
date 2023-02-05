package com.gamification.core.controllers;


import com.gamification.core.RestAddress;
import com.gamification.core.entities.BaseEntity;
import com.gamification.core.model.BaseDTO;
import com.gamification.core.model.Dto2Entity;
import com.gamification.core.model.InputDTO;
import com.gamification.core.model.ResultDTO;
import com.gamification.core.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RequiredArgsConstructor
public abstract class BaseController<DATA extends BaseDTO, Entity extends BaseEntity> {

    private final BaseService<Entity> service;
    private final Dto2Entity<DATA,Entity> mapper;

    @PostMapping(
            value = RestAddress.SAVE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO save(@RequestBody InputDTO<DATA> dto) {
        service.save(mapper.convert(dto.getData()));
        return new ResultDTO("SUCESSFULL");
    }

}
