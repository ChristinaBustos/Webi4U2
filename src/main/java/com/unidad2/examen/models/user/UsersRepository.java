package com.unidad2.examen.models.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UsersRepository extends JpaRepository<User, Long> {
    Boolean findAllById(long id);


}
