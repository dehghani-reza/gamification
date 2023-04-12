package com.gamification.core.model;

import com.gamification.core.enumeration.EN_ACTION_TYPE;
import lombok.Data;

import java.util.List;

@Data
public class InputDTO<D extends BaseDTO> {
    private EN_ACTION_TYPE actionType;
    private Long fieldId;
    private String hashCode;
    private Long userId;
    private String session;
    private D data;
    private List<InputFilter> inputFilterList;
}
