package taskone;

import java.time.LocalDateTime;

public class SensorAdapter implements MeteoSensor {

    private SensorTemperature sensor;

    public SensorAdapter(SensorTemperature sensor){
        this.sensor = sensor;
    }

    public int getId() {
        return sensor.identifier();
    }

    public Float getTemperature() {
        return (float)sensor.temperature();
    }

    public Float getHumidity() {
        return null;
    }

    public Float getPressure() {
        return null;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensor.year(), 1, 1, 0, 0, 0).plusDays(sensor.day()-1).plusSeconds(sensor.second());
    }
}
