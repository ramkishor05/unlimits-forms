package org.unlimits.forms.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unlimits.forms.constants.RecordStatus;
import org.unlimits.forms.global.model.UIPageTable;
import org.unlimits.forms.global.service.PageTableService;

@RestController
@RequestMapping("/api/global/page/table")
@CrossOrigin("*")
public class GlobalPageTableController {

	@Autowired
	PageTableService globalPageTableService;
	
	@PostMapping
	public UIPageTable addPageTable(@RequestBody UIPageTable globalPageTable) {
		return globalPageTableService.savePageTable(globalPageTable);
	}
	
	@PutMapping
	public UIPageTable updatePageTable(@RequestBody UIPageTable globalPageTable) {
		return globalPageTableService.savePageTable(globalPageTable);
	}
	
	@GetMapping
	public List<UIPageTable> getPageTableList() {
		return globalPageTableService.getPageTableList();
	}
	
	@GetMapping("/{id}")
	public UIPageTable getCategoryList(@PathVariable("id") Long id) {
		return globalPageTableService.getPageTable(id);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteCategoryList(@PathVariable("id") Long id) {
		return globalPageTableService.deletePageTable(id);
	}
	
	@GetMapping("/status/{status}")
	public List<UIPageTable> getPageTableList(@PathVariable("status") RecordStatus  dataStatus) {
		return globalPageTableService.getPageTableList(dataStatus);
	}
	
	@GetMapping("/type/{typeId}")
	public List<UIPageTable> getPageTableList(@PathVariable("typeId") String typeId) {
		return globalPageTableService.getPageTable(typeId);
	}
}
