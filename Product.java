package new_features.pagination;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product {

    private Long id;
    private String name;
    private Double price;
    private Integer qty;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
