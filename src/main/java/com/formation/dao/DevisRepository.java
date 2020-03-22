package com.formation.dao;

import com.formation.entitie.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DevisRepository extends JpaRepository<Devis,Long> {

    public Collection<Devis> findByClient_Id(Long id);

}
