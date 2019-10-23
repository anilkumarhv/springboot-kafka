package in.anil.vtcore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Vehicle implements Serializable {
    private Long id;
    private String vehicleNumber;
    private String vehicleType;
}
