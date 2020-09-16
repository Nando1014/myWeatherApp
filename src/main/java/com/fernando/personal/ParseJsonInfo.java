package com.fernando.personal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ParseJsonInfo {
    private InputStream inputStream;
    private InputStreamReader isr;
    private JsonElement ele;
    private JsonObject jobj;
    private String time;
    private String summary;
    private String icon;
    private String sunriseT;
    private String sunsetT;
    private String moonPhase;
    private String pIntens;
    private String pIntensMax;
    private String pIntensMaxT;
    private String pProb;
    private String pType;
    private String tempH;
    private String tempHTime;
    private String tempL;
    private String tempLTime;
    private String apTempH;
    private String apTempHTime;
    private String apTempLow;
    private String apTempLowTime;
    private String dewP;
    private String humidity;
    private String pressure;
    private String wSpeed;
    private String wGust;
    private String wGustTime;
    private String wBearing;
    private String cloudC;
    private String uvIndex;
    private String uvIndexTime;
    private String visibility;
    private String ozone;
    private String tempMin;
    private String tempMinTime;
    private String tempMax;
    private String tempMaxTime;
    private String apTempMax;
    private String apTempMaxTime;
    private String apTempMin;
    private String apTempMinTime;
    //Create a list of lists
    public ArrayList<ArrayList<String>> data;
    public ArrayList<String> currentDay;

    private String jsonObject;


    public ParseJsonInfo(String jsonObj) {
        this.jsonObject = jsonObj;
    }


    public void parse() throws IOException {
        createFile cf = new createFile(jsonObject);
        cf.create();

        data = new ArrayList<ArrayList<String>>();
        inputStream = getClass().getClassLoader().getResourceAsStream("weatherData.json");
        isr = new InputStreamReader(inputStream);
        ele = new JsonParser().parse(isr);
        jobj = ele.getAsJsonObject();
        jobj = jobj.getAsJsonObject("daily");
        JsonArray jarr = jobj.getAsJsonArray("data");
        for (int i = 0; i < 7; i++) {
            jobj = jarr.get(i).getAsJsonObject();
            createData(jarr);
        }

        cf.delete();

    }

    private void createData(JsonArray jarr) {
        time = jobj.get("time").getAsString();
        summary = jobj.get("summary").getAsString();
        icon = jobj.get("icon").getAsString();
        sunriseT = jobj.get("sunriseTime").getAsString();
        sunsetT = jobj.get("sunsetTime").getAsString();
        moonPhase = jobj.get("moonPhase").getAsString();
        pIntens = jobj.get("precipIntensity").getAsString();
        pIntensMax = jobj.get("precipIntensityMax").getAsString();
        pIntensMaxT = jobj.get("precipIntensityMaxTime").getAsString();
        pProb = jobj.get("precipProbability").getAsString();
        try {
            pType = jobj.get("precipType").getAsString();
        } catch (NullPointerException e) {
            pType = "--";
        }
        tempH = jobj.get("temperatureHigh").getAsString();
        tempHTime = jobj.get("temperatureHighTime").getAsString();
        tempL = jobj.get("temperatureLow").getAsString();
        tempLTime = jobj.get("temperatureLowTime").getAsString();
        apTempH = jobj.get("apparentTemperatureHigh").getAsString();
        apTempMaxTime = jobj.get("apparentTemperatureHighTime").getAsString();
        apTempLow = jobj.get("apparentTemperatureLow").getAsString();
        apTempLowTime = jobj.get("apparentTemperatureLowTime").getAsString();
        dewP = jobj.get("dewPoint").getAsString();
        humidity = jobj.get("humidity").getAsString();
        pressure = jobj.get("pressure").getAsString();
        wSpeed = jobj.get("windSpeed").getAsString();
        wGust = jobj.get("windGust").getAsString();
        wGustTime = jobj.get("windGustTime").getAsString();
        wBearing = jobj.get("windBearing").getAsString();
        cloudC = jobj.get("cloudCover").getAsString();
        uvIndex = jobj.get("uvIndex").getAsString();
        uvIndexTime = jobj.get("uvIndexTime").getAsString();
        visibility = jobj.get("visibility").getAsString();
        ozone = jobj.get("ozone").getAsString();
        tempMin = jobj.get("temperatureMin").getAsString();
        tempMinTime = jobj.get("temperatureMinTime").getAsString();
        tempMax = jobj.get("temperatureMax").getAsString();
        tempMaxTime = jobj.get("temperatureMaxTime").getAsString();
        apTempMin = jobj.get("apparentTemperatureMin").getAsString();
        apTempMinTime = jobj.get("apparentTemperatureMinTime").getAsString();
        apTempMax = jobj.get("apparentTemperatureMax").getAsString();
        apTempMaxTime = jobj.get("apparentTemperatureMaxTime").getAsString();

        ArrayList<String> oneDay = new ArrayList<String>();
        oneDay.add(time);
        oneDay.add(summary);
        oneDay.add(icon);
        oneDay.add(sunriseT);
        oneDay.add(sunsetT);
        oneDay.add(moonPhase);
        oneDay.add(pIntens);
        oneDay.add(pIntensMax);
        oneDay.add(pIntensMaxT);
        oneDay.add(pProb);
        try {
            oneDay.add(pType);
        } catch (NullPointerException e) {
            throw e;
        }
        oneDay.add(tempH);
        oneDay.add(tempHTime);
        oneDay.add(tempL);
        oneDay.add(tempLTime);
        oneDay.add(apTempH);
        oneDay.add(apTempHTime);
        oneDay.add(apTempLow);
        oneDay.add(apTempLowTime);
        oneDay.add(dewP);
        oneDay.add(humidity);
        oneDay.add(pressure);
        oneDay.add(wSpeed);
        oneDay.add(wGust);
        oneDay.add(wGustTime);
        oneDay.add(wBearing);
        oneDay.add(cloudC);
        oneDay.add(uvIndex);
        oneDay.add(uvIndexTime);
        oneDay.add(visibility);
        oneDay.add(ozone);
        oneDay.add(tempMin);
        oneDay.add(tempMinTime);
        oneDay.add(tempMax);
        oneDay.add(tempMaxTime);
        oneDay.add(apTempMin);
        oneDay.add(apTempMinTime);
        oneDay.add(apTempMax);
        oneDay.add(apTempMaxTime);

        data.add(oneDay);

    }

    /**
     * Get data from one specific day, the first day in this case
     */

    public void retrieveDailyInfo(int day) {
        currentDay = data.get(day);
        String currentTime, currentHumidity, currentPressure, currentWindSpeed,
                currentMaxTemp, currentMinTemp, currentSummary, iconQualifier,
                currentPercipProb;
        currentTime = currentDay.get(0);
        timeConverter tc = new timeConverter(currentTime);
        currentTime = tc.getTime();
        //currentTime = tc.changeTime(currentTime);
        currentSummary = currentDay.get(1);
        iconQualifier = currentDay.get(2);
        currentPercipProb = currentDay.get(9);
        currentMaxTemp = currentDay.get(11);
        currentMinTemp = currentDay.get(13);
        currentHumidity = currentDay.get(20);
        currentPressure = currentDay.get(21);
        currentWindSpeed = currentDay.get(22);
       System.out.println(" "+currentTime);
      /*  System.out.println("Today's Max Tempature: "+ currentMaxTemp);
        System.out.println("Today's Min Tempature: "+ currentMinTemp);
        System.out.println("Today's Humidity: "+currentHumidity);
        System.out.println("Today's Pressure: "+ currentPressure);
        System.out.println("Today's Wind Speed: " +currentWindSpeed);
        System.out.println("Today's Chance of Rain: "+ currentPercipProb);
        System.out.println("Today's Icon should be: " + iconQualifier);
        System.out.println("Today's Summary: "+ currentSummary);
        System.out.println("-------------------------------Information for Today has been retrieved-------------------------");
      */
    }

    private void retrieveDays() {
        ArrayList<String> times = new ArrayList<String>();
        for (ArrayList<String> list : data)
            times.add(list.get(0));
        for (String str : times) {
            timeConverter tc = new timeConverter(str);
            str = tc.getDay();
            System.out.println("Time:" + str);
        }
        System.out.println("------------------------------------Days have been stored------------------------");
    }

    private void retrieveTemps() {
        // we have to retrieve the max temp for all days
        ArrayList<String> temps = new ArrayList<String>();
        for (ArrayList<String> list : data)
            temps.add(list.get(11));
        for (String str : temps)
            System.out.println("Temp of Day:" + str);
    }

    public String retrieveSpexTime (int day) {
        return data.get(day).get(0);
    }
    public String retrieveSpexSum (int day) {
        return data.get(day).get(1);
    }
    public String retrieveSpexIcon(int day) {
        return data.get(day).get(2);
    }
    public String retrieveSpexPrecProb (int day) {
        return data.get(day).get(9);
    }
    public String retrieveSpexMaxTemp (int day) {
        return data.get(day).get(11);
    }
    public String retrieveSpexMinTemp(int day) {
        return data.get(day).get(13);
    }
    public String retrieveSpexHum (int day) {
        return data.get(day).get(20);
    }
    public String retrieveSpexPres(int day) {
        return data.get(day).get(21);
    }
    public String retrieveSpexWind(int day) {
        return data.get(day).get(22);
    }



}