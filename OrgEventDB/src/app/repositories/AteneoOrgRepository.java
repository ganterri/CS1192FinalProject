package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entities.AteneoOrg;

@Repository
public interface AteneoOrgRepository extends JpaRepository<AteneoOrg, Long>{

}
