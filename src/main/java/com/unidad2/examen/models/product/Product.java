package com.unidad2.examen.models.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unidad2.examen.models.transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 150)
    private String name;
    @Column(nullable = false,length = 150)
    private String category;
    @Column(nullable = false,length = 150)
    private int precio;
    @Column(columnDefinition = "TINYINT DEFAULT 1")
    private Boolean disponibilidad;

    @ManyToMany
    @JoinTable(name = "transaction_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id"))
    @JsonIgnore
    private Set<Transaction> transaction;

}
