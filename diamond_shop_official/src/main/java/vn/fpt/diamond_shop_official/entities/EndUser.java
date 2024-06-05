package vn.fpt.diamond_shop_official.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "END_USER")
public class EndUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "isMale")
    private boolean isMale;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "create_at")
    private String createAt;

    @Column(name = "update_at")
    private String updateAt;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "address")
    private Long address;
}
