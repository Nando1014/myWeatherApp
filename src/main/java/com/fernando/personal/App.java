package com.fernando.personal;

import com.google.gson.JsonObject;
import tk.plogitech.darksky.forecast.*;
import tk.plogitech.darksky.forecast.model.Forecast;
import tk.plogitech.darksky.forecast.model.Latitude;
import tk.plogitech.darksky.forecast.model.Longitude;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ForecastException, IOException {
       APIKey myKey = new APIKey("c4541c339ebf7d6ddca258df8528e217");
        DarkSkyClient client = new DarkSkyClient();
        ForecastRequest request = new ForecastRequestBuilder()
                .key(myKey)
                .language(ForecastRequestBuilder.Language.en)
                .units(ForecastRequestBuilder.Units.us)
                .exclude(ForecastRequestBuilder.Block.currently)
                .exclude(ForecastRequestBuilder.Block.minutely)
                .exclude(ForecastRequestBuilder.Block.hourly)
                .location(new GeoCoordinates(new Longitude( -122.28553), new Latitude( 38.29714))).build();
                String forecast = client.forecastJsonString(request);


        WeatherGUI gui = null;
        try {
            gui = new WeatherGUI(forecast);
        } catch (IOException e) {
            e.printStackTrace();
        }
        gui.run();

    }
}
