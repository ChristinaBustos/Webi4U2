package com.unidad2.examen.models.transaction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unidad2.examen.models.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import com.unidad2.examen.models.user.User;

import java.util.Set;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Transaction {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String date;
    @OneToOne
    @JoinColumn(name = "user_id",
            referencedColumnName = "id",
            unique = true)
    @JsonIgnore
    private User user;

    @ManyToMany(mappedBy = "transactions")
    private Set<Product> products;


}
