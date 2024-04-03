package org.unlimits.forms;

import java.util.List;

import org.brijframework.json.schema.factories.JsonSchemaDataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.unlimits.forms.global.entities.EOFormElement;
import org.unlimits.forms.global.entities.EOFormElementOption;
import org.unlimits.forms.global.entities.EOFormModel;
import org.unlimits.forms.global.entities.EOPageMaster;
import org.unlimits.forms.global.entities.EOPageTable;
import org.unlimits.forms.global.repository.FormElementOptionRepository;
import org.unlimits.forms.global.repository.FormElementRepository;
import org.unlimits.forms.global.repository.FormModelRepository;
import org.unlimits.forms.global.repository.PageMasterRepository;
import org.unlimits.forms.global.repository.PageTableRepository;

@Component
public class FormListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private FormModelRepository formModelRepository;
	
	@Autowired
	private FormElementRepository formElementRepository;
	
	@Autowired
	private FormElementOptionRepository formElementOptionRepository;
	
	@Autowired
	private PageMasterRepository pageMasterRepository;
	
	@Autowired
	private PageTableRepository pageTableRepository;

	@Value("${spring.db.datajson.upload}")
	boolean upload;

	@Override
	public void onApplicationEvent(final ContextRefreshedEvent event) {
		if (upload) {

			JsonSchemaDataFactory instance = JsonSchemaDataFactory.getInstance();
			pageMasterRepository.deleteAll();
			pageTableRepository.deleteAll();
			formElementOptionRepository.deleteAll();
			formElementRepository.deleteAll();
			formModelRepository.deleteAll();
			
			List<EOFormModel> eoFormModelJson = instance.getAll(EOFormModel.class);

			eoFormModelJson.forEach(eoFormModel -> {
				EOFormModel eoFormModelSave = formModelRepository.saveAndFlush(eoFormModel);
				eoFormModel.setId(eoFormModelSave.getId());
			});
			
			List<EOFormElement> eoFormElementJson = instance.getAll(EOFormElement.class);

			eoFormElementJson.forEach(eoFormElement -> {
				EOFormElement eoFormElementSave = formElementRepository.saveAndFlush(eoFormElement);
				eoFormElement.setId(eoFormElementSave.getId());
			});
			
			List<EOFormElementOption> eoFormElementOptionsJson = instance.getAll(EOFormElementOption.class);

			eoFormElementOptionsJson.forEach(eoFormElement -> {
				EOFormElementOption eoFormElementOptionSave = formElementOptionRepository.saveAndFlush(eoFormElement);
				eoFormElement.setId(eoFormElementOptionSave.getId());
			});
			
			List<EOPageMaster> eoPageMasterJson = instance.getAll(EOPageMaster.class);
			eoPageMasterJson.forEach(eoPageMaster -> {
				EOPageMaster eoPageMasterSave = pageMasterRepository.saveAndFlush(eoPageMaster);
				eoPageMaster.setId(eoPageMasterSave.getId());
			});
			
			List<EOPageTable> eoPageTableJson = instance.getAll(EOPageTable.class);

			eoPageTableJson.forEach(eoPageTable -> {
				EOPageTable eoPageTableSave = pageTableRepository.saveAndFlush(eoPageTable);
				eoPageTable.setId(eoPageTableSave.getId());
			});

		}
	}
}