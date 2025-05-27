package org.appops.studentapp.core;

import java.io.IOException;

import org.appops.core.ServiceException;
import org.appops.service.entrypoint.ServiceEntryPoint;



public class StudentServiceEntryPoint extends ServiceEntryPoint{
	public static void main(String[] args) throws IOException, ServiceException {
		new StudentServiceEntryPoint().startService(args);
	}
}
