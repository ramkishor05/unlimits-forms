package org.unlimits.forms.global.model;

import org.unlimits.forms.model.UIEntityObject;

public abstract class UIGlobalItem extends UIEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String idenNo;
	
	private String name;
	
	private String logoUrl;
	
	private String description;
	
	private String typeId;
	
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
