package com.gamification.core.model;

import lombok.Data;

@Data
public class InputDTO<DATA extends BaseDTO> {

    private DATA data;

}
