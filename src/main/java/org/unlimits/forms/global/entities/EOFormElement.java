package org.unlimits.forms.global.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EOFORM_ELEMENT")
public class EOFormElement extends EOGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "DEFAULT_VALUE")
	private String defaultValue;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "AUTO_FOCUS")
	private String autofocus;

	@Column(name = "EMPTY_VALUE")
	private String emptyValue;

	@Column(name = "PLACE_HOLDER")
	private String placeholder;

	@Column(name = "AUTOCOMPLETE")
	private String autocomplete;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "WIDGET")
	private String widget;

	@Column(name = "HELP")
	private String help;

	@Column(name = "MIN_LENGTH")
	private String minLength;
	
	@Column(name = "REQUIRED")
	private boolean required;

	@ManyToOne
	@JoinColumn(name = "FORM_MODEL_ID")
	private EOFormModel formModel;

	@OneToMany(mappedBy = "formElement", cascade = CascadeType.ALL)
	private List<EOFormElementOption> options;
	
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutofocus() {
		return autofocus;
	}

	public void setAutofocus(String autofocus) {
		this.autofocus = autofocus;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	public void setEmptyValue(String emptyValue) {
		this.emptyValue = emptyValue;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getAutocomplete() {
		return autocomplete;
	}

	public void setAutocomplete(String autocomplete) {
		this.autocomplete = autocomplete;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWidget() {
		return widget;
	}

	public void setWidget(String widget) {
		this.widget = widget;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getMinLength() {
		return minLength;
	}

	public void setMinLength(String minLength) {
		this.minLength = minLength;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public EOFormModel getFormModel() {
		return formModel;
	}

	public void setFormModel(EOFormModel formModel) {
		this.formModel = formModel;
	}

	public List<EOFormElementOption> getOptions() {
		if(options==null) {
			options=new ArrayList<EOFormElementOption>();
		}
		return options;
	}

	public void setOptions(List<EOFormElementOption> options) {
		this.options = options;
	}

	public EOFormElementOption findOptionByName(String valueOption) {
		return getOptions().stream().filter(option->option.getName().equals(valueOption)).findFirst().orElse(null);
	}

}
