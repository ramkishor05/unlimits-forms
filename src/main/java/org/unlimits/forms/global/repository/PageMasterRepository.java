package org.unlimits.forms.global.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOPageMaster;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface PageMasterRepository extends CustomRepository<EOPageMaster, Long> {

	Optional<EOPageMaster> findByTypeId(String typeId);

}
