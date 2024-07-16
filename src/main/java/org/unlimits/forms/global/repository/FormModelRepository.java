package org.unlimits.forms.global.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOFormModel;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface FormModelRepository extends CustomRepository<EOFormModel, Long> {

	List<EOFormModel> findByName(String name);

}
