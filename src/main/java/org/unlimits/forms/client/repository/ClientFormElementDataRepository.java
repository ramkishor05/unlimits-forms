package org.unlimits.forms.client.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.unlimits.forms.client.entites.EOClientFormElementData;
import org.unlimits.rest.repository.CustomRepository;

@Repository
@Transactional
public interface ClientFormElementDataRepository extends CustomRepository<EOClientFormElementData, Long> {

}
