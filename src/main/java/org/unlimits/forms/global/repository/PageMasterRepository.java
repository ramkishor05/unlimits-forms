package org.unlimits.forms.global.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOPageMaster;

@Repository
@Transactional
public interface PageMasterRepository extends JpaRepository<EOPageMaster, Long> {

	Optional<EOPageMaster> findByTypeId(String typeId);

}
