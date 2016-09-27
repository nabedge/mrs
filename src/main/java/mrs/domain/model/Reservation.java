package mrs.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import java.time.LocalTime;

@Entity
@Data
public class Reservation implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "reserved_date"), @JoinColumn(name = "room_id")})
    private ReservableRoom reservableRoom;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
