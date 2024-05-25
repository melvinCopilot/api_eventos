package domain.model.gateway;

import domain.model.EventModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventInterface {
     EventModel getEvent(Long id);
     List<EventModel> getAllEvents();

     EventModel saveEvent(EventModel eventModel);
}
