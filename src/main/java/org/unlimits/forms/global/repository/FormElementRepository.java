package org.unlimits.forms.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOFormElement;

@Repository
@Transactional
public interface FormElementRepository extends JpaRepository<EOFormElement, Long> {

}
