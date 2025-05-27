package org.appops.studentapp.injectior;

import org.appops.core.annotation.ImplModule;
import org.appops.service.injection.ServiceModule;
import org.appops.studentapp.core.StudentService;

@ImplModule(serviceName = StudentService.class)
public class StudentImplModule extends ServiceModule {
	@Override
	public void configureModule() {

	}

}
