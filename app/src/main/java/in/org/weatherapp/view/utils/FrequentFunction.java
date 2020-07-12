package in.org.weatherapp.view.utils;

import android.content.Context;
import android.graphics.Path;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import in.org.weatherapp.view.model.OpenWeather;

public class FrequentFunction {

    //pressure from mb to inches
    public static double MbToIn(double mb){
        return (int) (mb*0.0295301*100)/100.0;
    }
    //kmph to meter per second
    public static double kmphToMps(double kmph)
    {
        double m=0.277778 * kmph;
        return (int)(m*100)/100.0;
    }
    //m/s to kmph
    public static double mps_to_kmph(double mps)
    {
        double kmph=(3.6 * mps);
        return (int)(kmph*100)/100.0;
    }
    //mm to in for precipitation
    public static double MMToIn(double mm){
        return (int)(mm*0.0393701*100)/100.0;
    }

    //celcius to farenheigh
    public static double celsiusToFahrenheit(double temp)
    {
        double F=(temp * (9.0/5.0)) + 32.0;
        return (int)(F*100)/100.0;
    }
    //get week days
    public static String getWeekDays(String dateResponse) {

        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd");
        Date dt1=null;
        try {
            dt1 = format1.parse(dateResponse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2=new SimpleDateFormat("EE");
        String finalDay=format2.format(dt1);
        return finalDay;
    }
    //weather three hour interval
    public static String getDayTime(String dateResponse, String zone) {

        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd HH:mm:ss");
        Date dt1=null;
        try {
            dt1 = format1.parse(dateResponse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2=new SimpleDateFormat("EE HH:mm");
        format2.setTimeZone(TimeZone.getTimeZone(zone));
        String finalDay=format2.format(dt1);
        return finalDay;
    }

    //day with time format 12
    public static String getDayTime12(String dateResponse,String zone) {

        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd HH:mm:ss");
        Date dt1=null;
        try {
            dt1 = format1.parse(dateResponse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2=new SimpleDateFormat("EE hh:mm a");
        format2.setTimeZone(TimeZone.getTimeZone(zone));
        String finalDay=format2.format(dt1);
        return finalDay;
    }


    public static String getCityName(Context context,double latitude,double longitude){
        Geocoder geocoder=new Geocoder(context, Locale.getDefault());
        List<Address> addressList= null;
        try {
            addressList=geocoder.getFromLocation(latitude,longitude,1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(addressList.isEmpty())
            return "";
        else
            return addressList.get(0).getLocality();
    }


    public static String getObservationTime(String localTime,String zone)
    {
        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd HH:mm");
        format1.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date=null;
        try {
            date=format1.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format1=new SimpleDateFormat("MMMM, dd HH:mm");
        format1.setTimeZone(TimeZone.getTimeZone(zone));
        String observationTime=format1.format(date);
        return observationTime;

    }
    public static String getObservationTime12(String localTime,String zone)
    {
        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd HH:mm");
            format1.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date=null;
        try {
            date=format1.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format1=new SimpleDateFormat("MMMM, dd hh:mm a");
        format1.setTimeZone(TimeZone.getTimeZone(zone));
        String observationTime=format1.format(date);
        return observationTime;
    }
    public static String getLocalTime12(String zone)
    {

        Date date=new Date();

        DateFormat format1=new SimpleDateFormat("dd-MM-yy  h:mm a");
        format1.setTimeZone(TimeZone.getTimeZone(zone));
        String observationTime=format1.format(date);
        return observationTime;

    }

    public static String getValidDate(String localTime)
    {
        SimpleDateFormat format1=new SimpleDateFormat(	"yyyy-MM-dd");
        Date date=null;
        try {
            date=format1.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format1=new SimpleDateFormat("MMMM, dd ");
        String observationTime=format1.format(date);
        return observationTime;

    }

    public static String getLocalTime(String zone) {

        Date date=new Date();

        DateFormat format1=new SimpleDateFormat("dd-MM-yy  HH:mm");
        format1.setTimeZone(TimeZone.getTimeZone(zone));
        String observationTime=format1.format(date);
        return observationTime;
    }

    public static String changeTimeZone(String sunrise,String zone)
    {
        SimpleDateFormat format1=new SimpleDateFormat(	"HH:mm");
        format1.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date=null;
        try {
            date=format1.parse(sunrise);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format1=new SimpleDateFormat("hh:mm a");
        format1.setTimeZone(TimeZone.getTimeZone(zone));
        String observationTime=format1.format(date);
        return observationTime;

    }
}
