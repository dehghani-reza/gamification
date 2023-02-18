package com.gamification.core.controllers;


import com.gamification.core.RestAddress;
import com.gamification.core.entities.BaseEntity;
import com.gamification.core.enumeration.EN_STATE;
import com.gamification.core.exception.BusinessException;
import com.gamification.core.mappers.person.BaseMapper;
import com.gamification.core.model.BaseDTO;
import com.gamification.core.model.InputDTO;
import com.gamification.core.model.ResultDTO;
import com.gamification.core.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;

@RequiredArgsConstructor
public abstract class BaseController<D extends BaseDTO, E extends BaseEntity, M extends BaseMapper<D, E>> {
    protected final BaseService<E> service;
    protected final M mapper = Mappers.getMapper(getMapper());

    protected abstract Class<M> getMapper();

    @PostMapping(value = RestAddress.SAVE)
    public ResponseEntity<ResultDTO<D>> save(@RequestBody InputDTO<D> dto) {
        E e = mapper.dto2Entity(dto.getData());
        //TODO set these in service
        e.setState(EN_STATE.CREATED);
        e.setCreateById(dto.getUserId());//TODO get from JWT
        e.setCreateDate(LocalDateTime.now());
        E save = service.save(e);
        return new ResponseEntity<>(ResultDTO.<D>builder()
                .resultList(Collections.singletonList(mapper.entity2Dto(save)))
                .message("CREATED")
                .build(), HttpStatus.CREATED);
    }

    @GetMapping(value = RestAddress.FIND_ALL)
    public ResponseEntity<ResultDTO<D>> loadAll() {
        return new ResponseEntity<>(ResultDTO.<D>builder()
                .resultList(mapper.entity2Dto(service.findAll()))
                .message("FIND ALL SUCCESSFULLY")
                .build(), HttpStatus.OK);
    }

    @GetMapping(value = RestAddress.FIND_BY_ID)
    public ResponseEntity<ResultDTO<D>> loadById(@PathVariable Long id) {
        E entity = service.findById(id).orElseThrow(() -> new BusinessException("ID IS NOT VALID"));
        return new ResponseEntity<>(ResultDTO.<D>builder()
                .resultList(Collections.singletonList(mapper.entity2Dto(entity)))
                .message("FIND SUCCESSFULLY")
                .build(), HttpStatus.OK);
    }

    @PutMapping(value = RestAddress.UPDATE)
    public ResponseEntity<ResultDTO<D>> update(@RequestBody InputDTO<D> dto) {
        E e = mapper.dto2Entity(dto.getData());
        //TODO set these in service
        e.setState(EN_STATE.UPDATED);
        e.setUpdateById(dto.getUserId());//TODO get from JWT
        e.setUpdateDate(LocalDateTime.now());
        E save = service.save(e);
        return new ResponseEntity<>(ResultDTO.<D>builder()
                .resultList(Collections.singletonList(mapper.entity2Dto(save)))
                .message("UPDATED")
                .build(), HttpStatus.OK);
    }

    @DeleteMapping(value = RestAddress.DELETE)
    public ResponseEntity<ResultDTO<D>> delete(@RequestBody InputDTO<D> dto) {
        E e = mapper.dto2Entity(dto.getData());
        //TODO set these in service
        e.setState(EN_STATE.DELETED);
        e.setUpdateById(dto.getUserId());//TODO get from JWT
        e.setUpdateDate(LocalDateTime.now());
        service.save(e);
        return new ResponseEntity<>(ResultDTO.<D>builder()
                .message("DELETED")
                .build(), HttpStatus.NO_CONTENT);
    }

}
