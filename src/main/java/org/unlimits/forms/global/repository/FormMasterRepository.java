package org.unlimits.forms.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entites.FormMaster;

@Repository
@Transactional
public interface  FormMasterRepository extends JpaRepository<FormMaster, Long> {
	
	List<FormMaster>findByFormName(String name);

}
