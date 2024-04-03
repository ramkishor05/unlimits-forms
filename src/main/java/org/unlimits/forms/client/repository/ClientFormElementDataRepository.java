package org.unlimits.forms.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.client.entites.EOClientFormElementData;

@Repository
@Transactional
public interface ClientFormElementDataRepository extends JpaRepository<EOClientFormElementData, Long> {

	List<EOClientFormElementData> findAllByClientFormMasterDataId(Long clientFormMasterDataId);

	List<EOClientFormElementData> findByFormElementIdAndClientFormMasterDataId(Long key, Long id);
}
