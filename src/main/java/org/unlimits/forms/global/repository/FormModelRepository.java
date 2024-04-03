package org.unlimits.forms.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOFormModel;

@Repository
@Transactional
public interface FormModelRepository extends JpaRepository<EOFormModel, Long> {

	List<EOFormModel> findByName(String name);

}
