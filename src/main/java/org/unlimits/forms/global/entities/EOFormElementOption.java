package org.unlimits.forms.global.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOFORM_ELEMENT_OPTION")
public class EOFormElementOption extends EOGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "FORM_ELEMENT_ID", referencedColumnName = "ID")
	private EOFormElement formElement;

	public EOFormElement getFormElement() {
		return formElement;
	}

	public void setFormElement(EOFormElement formElement) {
		this.formElement = formElement;
	}
	
}
