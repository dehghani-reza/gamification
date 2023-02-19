package com.gamification.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InputFilter {
    private Integer pageNumber;
    private Integer pageSize;
    private String where;
    private String orderBy;
    private String groupBy;
    private String having;
    private Boolean fetchDeleted;
}
