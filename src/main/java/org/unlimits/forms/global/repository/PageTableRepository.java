package org.unlimits.forms.global.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOPageTable;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface PageTableRepository extends CustomRepository<EOPageTable, Long> {

	List<EOPageTable> findAllByRecordStateIn(List<String> statusIds);

	List<EOPageTable> findAllByTypeId(String typeId);

}
