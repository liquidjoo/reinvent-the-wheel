package liquidjoo.reinventthewheel.example;

import javax.persistence.*;

@Entity
@Table(name = "wheel_info")
public class Wheel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer size;

    @Column
    private Integer price;
}
