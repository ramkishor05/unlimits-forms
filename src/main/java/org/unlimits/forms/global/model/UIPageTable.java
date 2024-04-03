package org.unlimits.forms.global.model;

import java.util.List;

public class UIPageTable  extends UIGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UIFormModel formModel;
	
	private List<UIPageTableHeader> headers;

	public UIFormModel getFormModel() {
		return formModel;
	}

	public void setFormModel(UIFormModel formModel) {
		this.formModel = formModel;
	}

	public List<UIPageTableHeader> getHeaders() {
		return headers;
	}

	public void setHeaders(List<UIPageTableHeader> headers) {
		this.headers = headers;
	}
	
}
