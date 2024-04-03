package org.unlimits.forms.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.global.entities.EOPageTable;

@Repository
@Transactional
public interface PageTableHeaderRepository extends JpaRepository<EOPageTable, Long> {

}
