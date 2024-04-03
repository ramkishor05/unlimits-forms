package org.unlimits.forms.client.entites;

import static org.unlimits.forms.constants.TableConstants.CUST_BUSINESS_APP_ID;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.unlimits.forms.global.entites.FormMaster;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOCLIENT_FORM_MASTER_DATA")
public class EOClientFormMasterData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	

	@JoinColumn(name = CUST_BUSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;


	@JoinColumn(name = "FORM_MASTER_ID", nullable = false)
	@ManyToOne
	private FormMaster formMaster;


	@OneToMany(mappedBy = "clientFormMasterData")
	private List<EOClientFormElementData> clientElementDataList;

	public EOClientFormMasterData() {
	}

	public EOClientFormMasterData(Long clientId, Long formId) {
		this.formMaster = new FormMaster(formId);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FormMaster getFormMaster() {
		return formMaster;
	}

	public void setFormMaster(FormMaster formMaster) {
		this.formMaster = formMaster;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}

	public List<EOClientFormElementData> getClientElementDataList() {
		if(clientElementDataList==null) {
			clientElementDataList=new ArrayList<EOClientFormElementData>();
		}
		return clientElementDataList;
	}

	public void setClientElementDataList(List<EOClientFormElementData> clientElementDataList) {
		this.clientElementDataList = clientElementDataList;
	}

}
