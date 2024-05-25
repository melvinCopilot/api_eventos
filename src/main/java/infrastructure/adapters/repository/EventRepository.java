package infrastructure.adapters.repository;

import infrastructure.adapters.entity.EventEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EventRepository extends CrudRepository<EventEntity,Long>{
}
