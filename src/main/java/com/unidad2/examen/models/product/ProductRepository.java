package com.unidad2.examen.models.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Boolean findAllById(long id);
    @Modifying
    @Query(value = "UPDATE products SET disponibilidad = :disponibilidad WHERE id = :id", nativeQuery = true)
    int updateStatusById(
            @Param("disponibilidad") Boolean disponibilidad,
            @Param("id")Long id);


}
