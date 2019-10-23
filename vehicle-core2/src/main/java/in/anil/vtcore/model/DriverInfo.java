package in.anil.vtcore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class DriverInfo implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer rating;
}
