package lessontwo.tasktwo;

class Programm{
	public static void main(String[] args){
		Report report = new Report(new PrintReport());
		report.calculate();
		report.output();
		report.setReport(new DisplayReport());
		report.output();
	}
}