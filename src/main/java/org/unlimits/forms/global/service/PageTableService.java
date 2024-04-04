package org.unlimits.forms.global.service;

import java.util.List;

import org.unlimits.forms.constants.RecordStatus;
import org.unlimits.forms.global.model.UIPageTable;

public interface PageTableService {

	UIPageTable savePageTable(UIPageTable globalPageTable);

	List<UIPageTable> getPageTableList();

	UIPageTable getPageTable(Long id);

	boolean deletePageTable(Long id);

	List<UIPageTable> getPageTableList(RecordStatus dataStatus);

	List<UIPageTable> getPageTable(String typeId);

}
