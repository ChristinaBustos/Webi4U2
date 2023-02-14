package com.unidad2.examen.models.user;

import com.unidad2.examen.models.transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 150)
    private String fullname;
    @Column(length = 150)
    private String email;
    @Column(length = 8)
    private String password;
    @Column(length = 150)
    private String wishlist;

    @OneToOne(mappedBy = "user",
            cascade = CascadeType.ALL,
            optional = false)
    private Transaction transaction;

}
