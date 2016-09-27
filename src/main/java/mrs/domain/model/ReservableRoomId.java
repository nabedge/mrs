package mrs.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
@Data
@NoArgsConstructor
public class ReservableRoomId implements Serializable {

    private Integer roomId;

    private LocalDate reservedDate;

    public ReservableRoomId(Integer roomId, LocalDate reservedDate) {
        this.roomId = roomId;
        this.reservedDate = reservedDate;
    }




}
