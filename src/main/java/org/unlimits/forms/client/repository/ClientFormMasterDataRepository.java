package org.unlimits.forms.client.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.client.entites.EOClientFormMasterData;

@Repository
@Transactional
public interface ClientFormMasterDataRepository extends JpaRepository<EOClientFormMasterData, Long>{

	Optional<EOClientFormMasterData> findByClientMasterIdAndFormMasterId(Long clientId, Long formId);

}
