package org.unlimits.forms.global.entities;

import static org.unlimits.forms.constants.TableConstants.LOGO_URL;
import static org.unlimits.forms.constants.TableConstants.DESCRIPTION;
import static org.unlimits.forms.constants.TableConstants.IDEN_NO;
import static org.unlimits.forms.constants.TableConstants.INSTRUCTIONS;
import static org.unlimits.forms.constants.TableConstants.NAME;
import static org.unlimits.forms.constants.TableConstants.TYPE_ID;

import org.unlimits.forms.entities.EOEntityObject;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EOGlobalItem extends EOEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name=IDEN_NO)
	private String idenNo;
	
	@Column(name=NAME)
	private String name;
	
	@Column(name=LOGO_URL)
	@Lob
	private String logoUrl;
	
	@Column(name=DESCRIPTION)
	@Lob
	private String description;
	
	@Column(name=TYPE_ID)
	private String typeId;
	
	@Lob
	@Column(name=INSTRUCTIONS)
	private String instructions;

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

}
