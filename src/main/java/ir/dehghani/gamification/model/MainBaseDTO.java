package ir.dehghani.gamification.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public abstract class MainBaseDTO implements Serializable {
    private Long id;
    private String ip;
    Long version;
}
