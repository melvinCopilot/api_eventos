package domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserModel {
    private Long Id;
    private String name;
    private List<EventModel> eventModelList;
}
