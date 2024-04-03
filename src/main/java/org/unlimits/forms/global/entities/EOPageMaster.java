package org.unlimits.forms.global.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOPAGE_MASTER")
public class EOPageMaster extends  EOGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="PAGE_URL")
	private String pageUrl;
	
	@OneToMany(mappedBy = "pageMaster", cascade = CascadeType.ALL)
	private List<EOPageTable> pageTableList;

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public List<EOPageTable> getPageTableList() {
		return pageTableList;
	}

	public void setPageTableList(List<EOPageTable> pageTableList) {
		this.pageTableList = pageTableList;
	}
}
