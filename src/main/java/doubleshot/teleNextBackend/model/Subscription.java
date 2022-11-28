package doubleshot.teleNextBackend.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "subscriptions")
@Getter @Setter
public class Subscription {

    @Id
    @GeneratedValue(generator =  "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "phone_number")
    private Double phoneNumber;
    @Column(name = "phone_rate")
    private double phoneRate;
    @Column(name = "data_rate")
    private double dataRate;

    private double data;

    public Subscription(){

    }

    public Subscription(User user, double dataRate, double data) {
        this.user = user;
        this.phoneNumber = new Random().nextDouble(100000000,888888888) * 11;
        this.dataRate = dataRate;
        this.data = data;
    }
}
