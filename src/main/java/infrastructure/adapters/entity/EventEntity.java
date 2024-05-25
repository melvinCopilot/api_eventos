package infrastructure.adapters.entity;

import domain.model.UserModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "eventos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {
    @Id
    private Long eventId;
    private String name;
    private String date;
    private String location;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private UserEntity userEntity;
}
