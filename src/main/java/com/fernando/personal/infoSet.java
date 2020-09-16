package com.fernando.personal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class infoSet {

    private ParseJsonInfo instance;
    private String icon;

    public infoSet(String jsonObj) throws IOException {
       instance = new ParseJsonInfo(jsonObj);
       instance.parse();
    }

    //return new ImageIcon(this.getClass().getResource("/125x125/sun.png")).getImage();
    public Image setIcon()
    {
        icon = instance.retrieveSpexIcon(0);
        if(icon.equals("rain"))
        return new ImageIcon(this.getClass().getResource("/125x125/rainCloud.png")).getImage();
        if(icon.equals("clear-day"))
        return new ImageIcon(this.getClass().getResource("/125x125/sun.png")).getImage();
        if(icon.equals("partly-cloudy-day"))
        return new ImageIcon(this.getClass().getResource("/125x125/sunCloud.png")).getImage();
        else
        return new ImageIcon(this.getClass().getResource("/125x125/storm.png")).getImage();

    }

    public Image miniSet(String labelID)
    {
        if(labelID.equals("precipProb"))
            return new ImageIcon(this.getClass().getResource("/50x50/sprinkle.png")).getImage();
        if(labelID.equals("pressure"))
            return new ImageIcon(this.getClass().getResource("/50x50/pressure.png")).getImage();
        if(labelID.equals("wind"))
            return new ImageIcon(this.getClass().getResource("/50x50/wind.png")).getImage();
        if(labelID.equals("humidity"))
            return new ImageIcon(this.getClass().getResource("/50x50/humidity.png")).getImage();
        else
        return new ImageIcon(this.getClass().getResource("/125x125/storm.png")).getImage();

    }
    public Image miniDay(int day)
    {
        icon = instance.retrieveSpexIcon(day);
        if(icon.equals("rain"))
            return new ImageIcon(this.getClass().getResource("/75x75/rainCloud.png")).getImage();
        if(icon.equals("clear-day"))
            return new ImageIcon(this.getClass().getResource("/75x75/sun.png")).getImage();
        if(icon.equals("partly-cloudy-day"))
            return new ImageIcon(this.getClass().getResource("/75x75/sunCloud.png")).getImage();
        return new ImageIcon(this.getClass().getResource("/75x75/storm.png")).getImage();
    }

    public Image setBackground()
    {
        return new ImageIcon(this.getClass().getResource("/weatherBackground.jpg")).getImage();

    }

    public String setTime() {
        String date = instance.retrieveSpexTime(0);
        timeConverter tc = new timeConverter(date);
        return tc.getTime();
    }

    public String setSum()
    {
        return instance.retrieveSpexSum(0);
    }

    public String setPrecipProb() {
        String prob = instance.retrieveSpexPrecProb(0);
        StringBuilder sb = new StringBuilder();
        sb.append(prob.substring(2,prob.length()));
        sb.append("%");
        return sb.toString();
    }

    public String setWindSpeed() {
        String speed = instance.retrieveSpexWind(0);
        StringBuilder sb = new StringBuilder();
        sb.append(speed);
        sb.append(" mph");
        return sb.toString();
    }

    public String setPressure() {
        String pressure = instance.retrieveSpexPres(0);
        StringBuilder sb = new StringBuilder();
        sb.append(pressure);
        sb.append(" mBar");
        return sb.toString();
    }

    public String setHumidity() {
        String humidity = instance.retrieveSpexHum(0);
        StringBuilder sb = new StringBuilder();
        sb.append(humidity.substring(2, humidity.length()));
        sb.append("%");
        return sb.toString();
    }

    public String setMaxTemp(int day) {
        String maxTemp = instance.retrieveSpexMaxTemp(day);
        StringBuilder sb = new StringBuilder();
        sb.append(maxTemp);
        sb.append(" ℉");
        return sb.toString();
    }

    public String setMinTemp(int day) {
        String maxTemp = instance.retrieveSpexMinTemp(day);
        StringBuilder sb = new StringBuilder();
        sb.append(maxTemp);
        sb.append(" ℉");
        return sb.toString();
    }
}
