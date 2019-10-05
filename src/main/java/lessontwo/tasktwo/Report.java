package lessontwo.tasktwo;

import java.util.ArrayList;
import java.util.List;
class Report{
	private List<ReportItem> items;	// Отчетные данные
	private IReport report;

	public Report(IReport report) {
		this.report = report;
	}

	public void setReport(IReport report) {
		this.report = report;
	}

	// расчет отчетных данных
	public void calculate(){
		items =  new ArrayList<ReportItem>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));
	}
	
	public void output(){
		report.output(items);
	}
}