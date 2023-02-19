package com.gamification.core.model;

import lombok.Data;

@Data
public class InputFilter {
    private Integer pageNumber;
    private Integer pageSize;
    private String where;
    private String orderBy;
    private String groupBy;
    private String having;
    private Boolean fetchDeleted;
}
