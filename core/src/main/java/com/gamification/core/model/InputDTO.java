package com.gamification.core.model;

import lombok.Data;

@Data
public class InputDTO<D extends BaseDTO> {
    private Long userId;
    private D data;
}
