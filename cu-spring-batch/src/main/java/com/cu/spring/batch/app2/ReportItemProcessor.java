package com.cu.spring.batch.app2;

import org.springframework.batch.item.ItemProcessor;

public class ReportItemProcessor implements ItemProcessor<Report, Report>{

	@Override public Report process(Report item) throws Exception {
		System.out.println("processing ... " + item);
		item.setStaffName("Cu:" + item.getStaffName());
		return item;
	}
}
