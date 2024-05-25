package infrastructure.adapters.entity;

import domain.model.EventModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    private Long userId;
    private String name;
    @OneToMany(mappedBy = "userEntity")
    private List<EventEntity> eventEntityList;
}
