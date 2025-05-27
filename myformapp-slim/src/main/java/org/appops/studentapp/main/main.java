//package org.appops.studentapp.main;
//
//import java.util.Scanner;
//
//import com.google.inject.AbstractModule;
//import com.google.inject.Guice;
//import com.google.inject.Injector;
//import com.google.inject.Singleton;
//import org.appops.studentapp.actions.*;
//import org.appops.studentapp.core.*;
//
//import java.util.Scanner;
//
//public class main {
//	
//	
//	//guice module -> module(abstctModule) : binding provide
//	 protected static class StudentAppModule extends AbstractModule {
//	        @Override
//	        protected void configure() {
//	        
//	            bind(StudentManager.class).in(Singleton.class);
//	            
//	            bind(Scanner.class).toInstance(new Scanner(System.in));
////	         
////	            bind(Menu.class).in(Singleton.class);
//	        }
//	    }
//
//    public static void main(String[] args) {
//    	//created injector from module
//    	 Injector injector = Guice.createInjector(new StudentAppModule());
//    	 //created menu from injector
//    	 Menu menu = injector.getInstance(Menu.class);
//
//
//        menu.addMenuItem(new MenuItem(1, "Add Student",injector.getInstance(AddStudentAction.class)));
//        menu.addMenuItem(new MenuItem(2, "View Single Student",injector.getInstance(DisplayStudentAction.class)));
//        menu.addMenuItem(new MenuItem(3,"View All Students",injector.getInstance(ViewAllStudentsAction.class)));
//        menu.addMenuItem(new MenuItem(4,"Delete Student",injector.getInstance(DeleteStudentAction.class)));
//        menu.addMenuItem(new MenuItem(5,"Update student",injector.getInstance(UpdateStudentAction.class)));
//        menu.addMenuItem(new MenuItem(6, "Exit",injector.getInstance(ExitAction.class)));
//            
////        menu.addMenuItem(new MenuItem(2, "View Single Student", new DisplayStudentAction(manager, scanner)));
//
//
//       
//        menu.run();
// 
//    }
//}