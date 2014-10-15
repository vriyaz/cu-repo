package com.cu.spring.batch.app2;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		String[] springConfig = { "job-csv2xml.xml" };
		
		try {
			context = new ClassPathXmlApplicationContext(springConfig);
			
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			Job job = (Job)  context.getBean("helloWorldJob");
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit status: " + execution.getExitStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
