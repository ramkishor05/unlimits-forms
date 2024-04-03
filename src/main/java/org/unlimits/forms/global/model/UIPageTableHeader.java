package org.unlimits.forms.global.model;

import org.unlimits.forms.model.UIEntityObject;

public class UIPageTableHeader extends UIEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String label;

	private String type;

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

}
