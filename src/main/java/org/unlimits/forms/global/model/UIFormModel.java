package org.unlimits.forms.global.model;

import java.util.List;

public class UIFormModel extends UIGlobalItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<UIFormElement> elements;
	
	public UIFormModel() {
	}

	public UIFormModel(Long formId) {
		this.setId(formId);
	}

	public List<UIFormElement> getElements() {
		return elements;
	}

	public void setElements(List<UIFormElement> elements) {
		this.elements = elements;
	}
}
