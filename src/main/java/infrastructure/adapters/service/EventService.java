package infrastructure.adapters.service;

import domain.model.EventModel;
import domain.model.gateway.EventInterface;
import infrastructure.adapters.entity.EventEntity;
import infrastructure.adapters.repository.EventRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EventService implements EventInterface {
    EventRepository eventRepository;
    ModelMapper modelMapper;
    @Override
    public EventModel getEvent(Long eventId) {
        return modelMapper.map(eventRepository.findById(eventId),EventModel.class);
    }

    @Override
    public List<EventModel> getAllEvents() {
        List<EventEntity> eventEntityList =StreamSupport.stream(eventRepository.findAll().spliterator(),false).collect(Collectors.toList());
        return Collections.singletonList(modelMapper.map(eventEntityList, EventModel.class));
    }

    @Override
    public EventModel saveEvent(EventModel eventModel) {
        return null;
    }
}
