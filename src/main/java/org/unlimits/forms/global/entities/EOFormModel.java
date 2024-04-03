package org.unlimits.forms.global.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOFORM_MODEL")
public class EOFormModel extends EOGlobalItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "formModel", cascade = CascadeType.ALL)
	private List<EOFormElement> elements;
	
	public EOFormModel() {
	}

	public List<EOFormElement> getElements() {
		for (EOFormElement formElement: elements) {
			formElement.setFormModel(this);
			for(EOFormElementOption elementOption:  formElement.getOptions()) {
				elementOption.setFormElement(formElement);
			}
		}
		return elements;
	}

	public void setElements(List<EOFormElement> elements) {
		for (EOFormElement formElement: elements) {
			formElement.setFormModel(this);
			for(EOFormElementOption elementOption:  formElement.getOptions()) {
				elementOption.setFormElement(formElement);
			}
		}
		this.elements = elements;
	}
}
