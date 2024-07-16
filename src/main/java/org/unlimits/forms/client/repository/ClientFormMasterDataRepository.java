package org.unlimits.forms.client.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.client.entites.EOClientFormMasterData;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface ClientFormMasterDataRepository extends CustomRepository<EOClientFormMasterData, Long>{


}

