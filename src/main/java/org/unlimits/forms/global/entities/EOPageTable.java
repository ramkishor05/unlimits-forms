package org.unlimits.forms.global.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOPAGE_TABLE")
public class EOPageTable  extends EOGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "FORM_MODEL_ID")
	private EOFormModel formModel;
	
	@OneToOne
	@JoinColumn(name = "PAGE_MODEL_ID")
	private EOPageMaster pageMaster;
	
	@OneToMany(mappedBy = "pageTable")
	private List<EOPageTableHeader> headers;

	public EOFormModel getFormModel() {
		return formModel;
	}

	public void setFormModel(EOFormModel formModel) {
		this.formModel = formModel;
	}

	public EOPageMaster getPageMaster() {
		return pageMaster;
	}

	public void setPageMaster(EOPageMaster pageMaster) {
		this.pageMaster = pageMaster;
	}

	public List<EOPageTableHeader> getHeaders() {
		return headers;
	}

	public void setHeaders(List<EOPageTableHeader> headers) {
		this.headers = headers;
	}
	
}
