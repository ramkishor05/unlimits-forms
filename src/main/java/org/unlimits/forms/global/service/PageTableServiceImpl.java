package org.unlimits.forms.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unlimits.forms.constants.RecordStatus;
import org.unlimits.forms.global.entities.EOPageTable;
import org.unlimits.forms.global.mapper.PageTableMapper;
import org.unlimits.forms.global.model.UIPageTable;
import org.unlimits.forms.global.repository.PageTableRepository;

@Service
public class PageTableServiceImpl implements PageTableService {
	
	@Autowired
	private PageTableRepository pageTableRepository;
	
	@Autowired
	private PageTableMapper pageTableMapper;
	
	@Override
	public UIPageTable savePageTable(UIPageTable unitGroup) {
		EOPageTable eoPageTable=pageTableMapper.mapToDAO(unitGroup);
		pageTableRepository.save(eoPageTable);
		return pageTableMapper.mapToDTO(eoPageTable);
	}

	@Override
	public UIPageTable getPageTable(Long id) {
		return pageTableMapper.mapToDTO(pageTableRepository.getReferenceById(id));
	}

	@Override
	public List<UIPageTable> getPageTableList() {
		return pageTableMapper.mapToDTO(pageTableRepository.findAll());
	}
	
	@Override
	public List<UIPageTable> getPageTableList(RecordStatus dataStatus) {
		List<EOPageTable> findAllByStatus = pageTableRepository.findAllByRecordStateIn(dataStatus.getStatusIds());
		return pageTableMapper.mapToDTO(findAllByStatus);
	}

	@Override
	public List<UIPageTable> getPageTable(String typeId) {
		return pageTableMapper.mapToDTO(pageTableRepository.findAllByTypeId(typeId));
	}

	@Override
	public boolean deletePageTable(Long id) {
		EOPageTable eoPageTable = pageTableRepository.getReferenceById(id);
		eoPageTable.setRecordState(RecordStatus.DACTIVETED.getStatus());
		pageTableRepository.save(eoPageTable);
		return true;
	}

}
