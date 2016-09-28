package mrs.domain.service.room;

import mrs.domain.model.ReservableRoom;
import mrs.domain.repository.room.ReservableRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class RoomService {

    @Autowired
    private ReservableRoomRepository reservableRoomRepository;

    public List<ReservableRoom> findreservableRooms(LocalDate date) {
        return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
    }
}
