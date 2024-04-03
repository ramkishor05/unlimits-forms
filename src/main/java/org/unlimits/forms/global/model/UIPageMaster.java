package org.unlimits.forms.global.model;

import java.util.List;

public class UIPageMaster extends  UIGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pageUrl;
	
	private List<UIPageTable> pageTableList;

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public List<UIPageTable> getPageTableList() {
		return pageTableList;
	}

	public void setPageTableList(List<UIPageTable> pageTableList) {
		this.pageTableList = pageTableList;
	}
	
	
	
}
