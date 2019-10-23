package in.anil.vtcore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleLocation implements Serializable {
    private Long vehicleId;
    private Boolean online;    //weather vehicle is online or offline
    private Boolean available;    // is vehicle ready to take bookings or not
    private Double latitude;
    private Double longitude;

    public VehicleLocation(Boolean online, Boolean available, Double latitude, Double longitude) {
        super();
        this.online = online;
        this.available = available;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
