package com.fernando.personal;

import java.util.Date;

public class timeConverter {
    /**
     *
     * In order to return the time (excluding the time stamp (PDT/EST/...))
     * we should search time to find the first index of :
     *then we get the time by using time.substring(index-2, index+8)
     * then we have to check the hour
     * if(time.substring(index-2,index+1).equals("12"))
     * then do math i dont want to think about rn
     */
    public  String subject;

    public timeConverter(String time)
    {
        this.subject = time;
    }

    public  String getTime() {
    int test  = Integer.valueOf(subject);
    Date time=new Date((long)test *1000);
    String data = time.toString();
    String str = findTime(data);
    StringBuilder sb = new StringBuilder();
    sb.append(data.substring(0,11));
    sb.append(changeTime(str));
    return sb.toString();
    }

    public String changeTime(String s) {
        String meridiem;
        String hour=s.substring(0,2);
        String minute=s.substring(3,5);
        String second=s.substring(6,8);
        int hr = Integer.valueOf(hour);
        if((hr>=0 && hr<=11 )|| hr ==24)
            meridiem= "AM";
            else
        {
            meridiem="PM";
            hr-=12;
        }
        if(hr==0)
        {
            hr=12;
        }
            hour = String.valueOf(hr);
            StringBuilder sb = new StringBuilder();
            sb.append(hour);
            sb.append(":");
            sb.append(minute);
            sb.append(" ");
            sb.append(meridiem);
            return sb.toString();
    }

    public String getDay()
    {
        int test  = Integer.valueOf(subject);
        Date time=new Date((long)test *1000);
        String data = time.toString();
        String str = getDay(data);
        return str;

    }

    private String findTime(String str) {
        int place = str.indexOf(':');
        return str.substring(place-2, place+6);
    }



    private String getDay(String str)
    {
    return str.substring(0,4);
    }


}
