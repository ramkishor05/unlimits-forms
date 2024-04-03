package org.unlimits.forms.global.entities;

import org.unlimits.forms.entities.EOEntityObject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOPAGE_TABLE_HEADER")
public class EOPageTableHeader extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "TYPE")
	private String type;

	@JoinColumn(name = "PAGE_TABLE_ID")
	private EOPageTable pageTable;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public EOPageTable getPageTable() {
		return pageTable;
	}

	public void setPageTable(EOPageTable pageTable) {
		this.pageTable = pageTable;
	}

}
