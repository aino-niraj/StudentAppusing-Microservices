package org.appops.studentapp.core;

import java.lang.annotation.Annotation;

import org.appops.core.deployment.ServiceConfiguration;
import org.appops.service.ServiceInitializer;
import org.appops.service.generator.ServiceMetaGenerator;
import org.appops.slim.base.api.ServiceMetaManager;
import org.appops.studentapp.core.StudentService;

import com.google.inject.Inject;
import com.google.inject.Provider;

@StudentService
public class StudentServiceInitializer extends ServiceInitializer {

	
	@Inject
	public StudentServiceInitializer(Provider<ServiceMetaGenerator> serviceMetaGenerator,
			Provider<ServiceMetaManager> serviceMetaManager) {
		super(serviceMetaGenerator, serviceMetaManager);
		
	}
	
	@Override
	public String initialize(String serviceName, ServiceConfiguration config,
			Class<? extends Annotation> serviceAnnotation) {
		addServiceMeta(serviceName, config, serviceAnnotation);
		return serviceName;
	}

}
