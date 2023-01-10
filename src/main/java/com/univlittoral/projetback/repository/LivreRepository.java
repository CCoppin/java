
  package com.univlittoral.projetback.repository;
  
  import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
  
  
  import com.univlittoral.projetback.entity.LivreEntity;
  
 
  @Repository 
  public interface LivreRepository extends JpaRepository<LivreEntity, Long> {
	  
	  @Query("SELECT l FROM LivreEntity l ORDER BY l.nom")
	  List<LivreEntity> findAllLiv();
  
  }
 