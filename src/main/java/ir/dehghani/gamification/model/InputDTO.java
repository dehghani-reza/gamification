package ir.dehghani.gamification.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
public class InputDTO<DATA extends BaseDTO> {

    private DATA data;

}
