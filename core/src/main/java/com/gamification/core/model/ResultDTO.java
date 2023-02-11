package com.gamification.core.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResultDTO<D extends BaseDTO> {
    String message;
    List<D> resultList;
}
