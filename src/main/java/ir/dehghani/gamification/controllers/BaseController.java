package ir.dehghani.gamification.controllers;


import ir.dehghani.gamification.model.Dto2Entity;
import ir.dehghani.gamification.RestAddress;
import ir.dehghani.gamification.entities.BaseEntity;
import ir.dehghani.gamification.model.BaseDTO;
import ir.dehghani.gamification.model.InputDTO;
import ir.dehghani.gamification.model.ResultDTO;
import ir.dehghani.gamification.services.BaseService;
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
