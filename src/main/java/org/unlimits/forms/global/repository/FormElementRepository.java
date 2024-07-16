package org.unlimits.forms.global.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOFormElement;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface FormElementRepository extends CustomRepository<EOFormElement, Long> {

}
