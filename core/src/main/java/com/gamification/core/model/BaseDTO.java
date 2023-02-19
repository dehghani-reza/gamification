package com.gamification.core.model;

import com.gamification.core.enumeration.EN_STATE;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
@Data
@NoArgsConstructor
@ApiModel(description = "This is a common data between all of models.")
public abstract class BaseDTO {
    @ApiModelProperty(notes = "this is a unique id for model")
    private Long id;
    @ApiModelProperty(notes = "this is machine's ip")
    private String ip;
    @ApiModelProperty(notes = "this is for handling optimistic locking")
    private Long version;
    @ApiModelProperty(notes = "this is for handling state of data. e.g. deleted,updated and ...")
    private EN_STATE state;
    @ApiModelProperty(notes = "this is row level")
    private Integer rowLevelId;
    @ApiModelProperty(notes = "this is priority")
    private Integer priority;
}
