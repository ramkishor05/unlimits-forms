package org.unlimits.forms.client.entites;

import static org.unlimits.forms.constants.TableConstants.APP_ID;
import static org.unlimits.forms.constants.TableConstants.BUSINESS_ID;
import static org.unlimits.forms.constants.TableConstants.CUST_BUSINESS_APP;
import static org.unlimits.forms.constants.TableConstants.CUST_ID;
import static org.unlimits.forms.constants.TableConstants.EOCUST_BUSINESS_APP;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_BUSINESS_APP, uniqueConstraints = {
		@UniqueConstraint(columnNames = { APP_ID, CUST_ID, BUSINESS_ID }) })
public class EOCustBusinessApp extends EOCustObject {

	private static final long serialVersionUID = 1L;

	@Column(name = APP_ID, nullable = false)
	private long appId;

	@Column(name = CUST_ID, nullable = false)
	private long custId;

	@Column(name = BUSINESS_ID, nullable = false)
	private long businessId;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOClientFormMasterData> clientFormMasterDataList;

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public Set<EOClientFormMasterData> getClientFormMasterDataList() {
		return clientFormMasterDataList;
	}

	public void setClientFormMasterDataList(Set<EOClientFormMasterData> clientFormMasterDataList) {
		this.clientFormMasterDataList = clientFormMasterDataList;
	}

}
