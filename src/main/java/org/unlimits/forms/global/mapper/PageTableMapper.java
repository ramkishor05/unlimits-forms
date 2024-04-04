package org.unlimits.forms.global.mapper;

import static org.unlimits.forms.constants.CommanConstants.APP_GLOBAL_PACKAGE_IMPL;
import static org.unlimits.forms.constants.CommanConstants.SPRING;

import org.mapstruct.Mapper;
import org.unlimits.forms.global.entities.EOPageTable;
import org.unlimits.forms.global.model.UIPageTable;
import org.unlimits.forms.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = APP_GLOBAL_PACKAGE_IMPL)
public interface PageTableMapper  extends GenericMapper<EOPageTable, UIPageTable>{

}
