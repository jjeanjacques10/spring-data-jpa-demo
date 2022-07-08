package com.jjeanjacques.shinobi.repository;

import com.jjeanjacques.shinobi.models.Shinobi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShinobiRepository extends JpaRepository<Shinobi, Long> {

    List<Shinobi> findAll();
    Optional<Shinobi> findById(Long id);

    @Query("SELECT s FROM Shinobi s WHERE name LIKE %:name%")
    List<Shinobi> findByNameLikeQuery(String name);

}
