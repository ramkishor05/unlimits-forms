package org.unlimits.forms.client.entites;

import java.io.Serializable;

import org.unlimits.forms.global.entities.EOFormElement;
import org.unlimits.forms.global.entities.EOFormElementOption;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOCLIENT_FORM_ELEMENT_DATA")
public class EOClientFormElementData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "FORM_ELEMENT_VALUE", nullable = false)
	private String formElementValue;

	@JoinColumn(name = "FORM_ELEMENT_ID", nullable = false)
	@ManyToOne
	private EOFormElement formElement;

	@JoinColumn(name = "FORM_ELEMENT_OPTION_ID")
	@ManyToOne
	private EOFormElementOption option;

	@JoinColumn(name = "CLIENT_FORM_MASTER_ID", nullable = false)
	@ManyToOne
	private EOClientFormMasterData clientFormMasterData;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormElementValue() {
		return formElementValue;
	}

	public void setFormElementValue(String formElementValue) {
		this.formElementValue = formElementValue;
	}

	public EOFormElement getFormElement() {
		return formElement;
	}

	public void setFormElement(EOFormElement formElement) {
		this.formElement = formElement;
	}

	public EOFormElementOption getOption() {
		return option;
	}

	public void setOption(EOFormElementOption option) {
		this.option = option;
	}

	public EOClientFormMasterData getClientFormMasterData() {
		return clientFormMasterData;
	}

	public void setClientFormMasterData(EOClientFormMasterData clientFormMasterData) {
		this.clientFormMasterData = clientFormMasterData;
	}

}
