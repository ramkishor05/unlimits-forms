package org.unlimits.forms.global.model;

import java.util.ArrayList;
import java.util.List;

public class UIFormElement extends UIGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String defaultValue;

	private String type;

	private String title;

	private String autofocus;

	private String emptyValue;

	private String placeholder;

	private String autocomplete;

	private String description;

	private String widget;

	private String help;

	private String minLength;
	
	private boolean required;

	private List<UIFormElementOption> options;
	
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

	public List<UIFormElementOption> getOptions() {
		if(options==null) {
			options=new ArrayList<UIFormElementOption>();
		}
		return options;
	}

	public void setOptions(List<UIFormElementOption> options) {
		this.options = options;
	}

	public UIFormElementOption findOptionByName(String valueOption) {
		return getOptions().stream().filter(option->option.getName().equals(valueOption)).findFirst().orElse(null);
	}

}
