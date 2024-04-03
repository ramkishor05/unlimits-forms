package org.unlimits.forms.global.entites;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "FORM_MASTER")
public class FormMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String formName;
	
	@OneToMany(mappedBy = "formMaster", cascade = CascadeType.ALL)
	private List<FormElement> elements;
	
	public FormMaster() {
	}

	public FormMaster(Long formId) {
		this.id=formId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public List<FormElement> getElements() {
		for (FormElement formElement: elements) {
			formElement.setFormMaster(this);
			for(FormElementOption elementOption:  formElement.getOptions()) {
				elementOption.setFormElement(formElement);
			}
		}
		return elements;
	}

	public void setElements(List<FormElement> elements) {
		for (FormElement formElement: elements) {
			formElement.setFormMaster(this);
			for(FormElementOption elementOption:  formElement.getOptions()) {
				elementOption.setFormElement(formElement);
			}
		}
		this.elements = elements;
	}
}
