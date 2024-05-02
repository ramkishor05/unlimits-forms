package org.unlimits.forms.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOPAGE_TABLE_HEADER")
public class EOPageTableHeader extends EOGlobalItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "RENDER")
	private String render;

	@JoinColumn(name = "PAGE_TABLE_ID")
	@ManyToOne
	private EOPageTable pageTable;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRender() {
		return render;
	}

	public void setRender(String render) {
		this.render = render;
	}

	public EOPageTable getPageTable() {
		return pageTable;
	}

	public void setPageTable(EOPageTable pageTable) {
		this.pageTable = pageTable;
	}

}
