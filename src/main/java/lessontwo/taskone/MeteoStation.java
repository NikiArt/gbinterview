package lessontwo.taskone;

public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoStore();
		
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);
		
		SensorTemperature st500 = new ST500Info().getData();
		meteoDb.save(new SensorAdapter(st500));
	}
}