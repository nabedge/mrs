package mrs.domain.service.room;

import mrs.MrsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MrsApplication.class)
public class RoomServiceTest {

    @Autowired
    private RoomService roomService;

    @Test
    public void findreservableRooms() throws Exception {
        LocalDate date = LocalDate.now();
        roomService.findreservableRooms(date);
    }

}