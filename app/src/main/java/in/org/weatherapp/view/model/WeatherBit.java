package in.org.weatherapp.view.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherBit
{

    /**
     * data : [{"moonrise_ts":1593908297,"wind_cdir":"WSW","rh":62,"pres":1002.45,"high_temp":35,"sunset_ts":1593908858,"ozone":309.409,"moon_phase":0.999161,"wind_gust_spd":6.5,"snow_depth":0,"clouds":17,"ts":1593835260,"sunrise_ts":1593856866,"app_min_temp":23.5,"wind_spd":1.98115,"pop":65,"wind_cdir_full":"west-southwest","slp":1012.24,"moon_phase_lunation":0.47,"valid_date":"2020-07-04","app_max_temp":35.8,"vis":23.1,"dewpt":20.1,"snow":0,"uv":10.6621,"weather":{"icon":"r01d","code":500,"description":"Light rain"},"wind_dir":245,"max_dhi":null,"clouds_hi":4,"precip":5.0625,"low_temp":23.2,"max_temp":35,"moonset_ts":1593857697,"datetime":"2020-07-04","temp":29.2,"min_temp":22.8,"clouds_mid":0,"clouds_low":15},{"moonrise_ts":1593997973,"wind_cdir":"SE","rh":81,"pres":1004.36,"high_temp":33.5,"sunset_ts":1593995246,"ozone":300.618,"moon_phase":0.980676,"wind_gust_spd":6.4,"snow_depth":0,"clouds":46,"ts":1593921660,"sunrise_ts":1593943297,"app_min_temp":24,"wind_spd":2.09337,"pop":50,"wind_cdir_full":"southeast","slp":1014.19,"moon_phase_lunation":0.5,"valid_date":"2020-07-05","app_max_temp":37,"vis":23.1,"dewpt":22.8,"snow":0,"uv":9.77609,"weather":{"icon":"c03d","code":803,"description":"Broken clouds"},"wind_dir":127,"max_dhi":null,"clouds_hi":22,"precip":3.25,"low_temp":23.1,"max_temp":33.5,"moonset_ts":1593947745,"datetime":"2020-07-05","temp":27,"min_temp":23,"clouds_mid":5,"clouds_low":40},{"moonrise_ts":1594087193,"wind_cdir":"S","rh":64,"pres":1003.3,"high_temp":34,"sunset_ts":1594081632,"ozone":297.305,"moon_phase":0.939254,"wind_gust_spd":6.34715,"snow_depth":0,"clouds":62,"ts":1594008060,"sunrise_ts":1594029728,"app_min_temp":23.4,"wind_spd":2.55151,"pop":40,"wind_cdir_full":"south","slp":1016.86,"moon_phase_lunation":0.54,"valid_date":"2020-07-06","app_max_temp":35.6,"vis":24.1326,"dewpt":19.9,"snow":0,"uv":9.18493,"weather":{"icon":"c03d","code":803,"description":"Broken clouds"},"wind_dir":183,"max_dhi":null,"clouds_hi":57,"precip":2,"low_temp":23.1,"max_temp":34.2,"moonset_ts":1594037862,"datetime":"2020-07-06","temp":27.9,"min_temp":22.8,"clouds_mid":0,"clouds_low":5},{"moonrise_ts":1594173593,"wind_cdir":"SSW","rh":64,"pres":1003.58,"high_temp":32.5,"sunset_ts":1594168016,"ozone":295.067,"moon_phase":0.878702,"wind_gust_spd":7.71558,"snow_depth":0,"clouds":75,"ts":1594094460,"sunrise_ts":1594116160,"app_min_temp":23.6,"wind_spd":2.86588,"pop":20,"wind_cdir_full":"south-southwest","slp":1016.96,"moon_phase_lunation":0.57,"valid_date":"2020-07-07","app_max_temp":33.6,"vis":24.135,"dewpt":19.6,"snow":0,"uv":3.62471,"weather":{"icon":"c04d","code":804,"description":"Overcast clouds"},"wind_dir":194,"max_dhi":null,"clouds_hi":74,"precip":0.125,"low_temp":21.4,"max_temp":32.5,"moonset_ts":1594127928,"datetime":"2020-07-07","temp":27.4,"min_temp":22.9,"clouds_mid":0,"clouds_low":2},{"moonrise_ts":1594262398,"wind_cdir":"SSW","rh":76,"pres":1001.35,"high_temp":32.2,"sunset_ts":1594254399,"ozone":287.843,"moon_phase":0.803239,"wind_gust_spd":7.04061,"snow_depth":0,"clouds":30,"ts":1594180860,"sunrise_ts":1594202593,"app_min_temp":21.9,"wind_spd":2.61309,"pop":75,"wind_cdir_full":"south-southwest","slp":1014.7,"moon_phase_lunation":0.6,"valid_date":"2020-07-08","app_max_temp":32.7,"vis":22.797,"dewpt":20.8,"snow":0,"uv":8.1203,"weather":{"icon":"r01d","code":500,"description":"Light rain"},"wind_dir":196,"max_dhi":null,"clouds_hi":19,"precip":8.375,"low_temp":21.9,"max_temp":30.1,"moonset_ts":1594217882,"datetime":"2020-07-08","temp":25.6,"min_temp":21.3,"clouds_mid":0,"clouds_low":11},{"moonrise_ts":1594350869,"wind_cdir":"SE","rh":80,"pres":998.657,"high_temp":31.4,"sunset_ts":1594340779,"ozone":283.533,"moon_phase":0.716959,"wind_gust_spd":9.45726,"snow_depth":0,"clouds":70,"ts":1594267260,"sunrise_ts":1594289027,"app_min_temp":23.7,"wind_spd":2.80259,"pop":70,"wind_cdir_full":"southeast","slp":1012.23,"moon_phase_lunation":0.64,"valid_date":"2020-07-09","app_max_temp":35.7,"vis":24.1351,"dewpt":22.1,"snow":0,"uv":5.44818,"weather":{"icon":"t02d","code":201,"description":"Thunderstorm with rain"},"wind_dir":139,"max_dhi":null,"clouds_hi":54,"precip":7.0625,"low_temp":23.7,"max_temp":32.5,"moonset_ts":1594307716,"datetime":"2020-07-09","temp":26.1,"min_temp":22.9,"clouds_mid":2,"clouds_low":31},{"moonrise_ts":1594439098,"wind_cdir":"S","rh":83,"pres":998.716,"high_temp":29.4,"sunset_ts":1594427159,"ozone":281.82,"moon_phase":0.623554,"wind_gust_spd":9.70494,"snow_depth":0,"clouds":99,"ts":1594353660,"sunrise_ts":1594375462,"app_min_temp":24.6,"wind_spd":3.74495,"pop":90,"wind_cdir_full":"south","slp":1012.15,"moon_phase_lunation":0.67,"valid_date":"2020-07-10","app_max_temp":32.6,"vis":21.7336,"dewpt":22.9,"snow":0,"uv":3.26485,"weather":{"icon":"t03d","code":202,"description":"Thunderstorm with heavy rain"},"wind_dir":169,"max_dhi":null,"clouds_hi":99,"precip":24.1875,"low_temp":23.6,"max_temp":29.8,"moonset_ts":1594397459,"datetime":"2020-07-10","temp":26,"min_temp":23.6,"clouds_mid":32,"clouds_low":11},{"moonrise_ts":1594440770,"wind_cdir":"S","rh":87,"pres":995.541,"high_temp":32.3,"sunset_ts":1594513536,"ozone":284.943,"moon_phase":0.526269,"wind_gust_spd":11.1054,"snow_depth":0,"clouds":83,"ts":1594440060,"sunrise_ts":1594461898,"app_min_temp":24.5,"wind_spd":3.75235,"pop":85,"wind_cdir_full":"south","slp":1008.64,"moon_phase_lunation":0.71,"valid_date":"2020-07-11","app_max_temp":33.7,"vis":18.576,"dewpt":23.2,"snow":0,"uv":3.4052,"weather":{"icon":"t03d","code":202,"description":"Thunderstorm with heavy rain"},"wind_dir":183,"max_dhi":null,"clouds_hi":72,"precip":19.5,"low_temp":22,"max_temp":29.6,"moonset_ts":1594487157,"datetime":"2020-07-11","temp":25.6,"min_temp":23.6,"clouds_mid":45,"clouds_low":44},{"moonrise_ts":1594528762,"wind_cdir":"S","rh":71,"pres":994.164,"high_temp":37.4,"sunset_ts":1594599912,"ozone":295.194,"moon_phase":0.428053,"wind_gust_spd":5.62435,"snow_depth":0,"clouds":8,"ts":1594526460,"sunrise_ts":1594548334,"app_min_temp":22.6,"wind_spd":2.32796,"pop":55,"wind_cdir_full":"south","slp":1007.1,"moon_phase_lunation":0.74,"valid_date":"2020-07-12","app_max_temp":35.4,"vis":22.7275,"dewpt":21.1,"snow":0,"uv":9.97408,"weather":{"icon":"c02d","code":801,"description":"Few clouds"},"wind_dir":172,"max_dhi":null,"clouds_hi":2,"precip":3.8125,"low_temp":24.1,"max_temp":32.9,"moonset_ts":1594576864,"datetime":"2020-07-12","temp":27.3,"min_temp":21.7,"clouds_mid":0,"clouds_low":6},{"moonrise_ts":1594616745,"wind_cdir":"WSW","rh":58,"pres":997.597,"high_temp":36.9,"sunset_ts":1594686286,"ozone":288.546,"moon_phase":0.331802,"wind_gust_spd":6.44035,"snow_depth":0,"clouds":0,"ts":1594612860,"sunrise_ts":1594634771,"app_min_temp":24.6,"wind_spd":2.04613,"pop":0,"wind_cdir_full":"west-southwest","slp":1010.82,"moon_phase_lunation":0.77,"valid_date":"2020-07-13","app_max_temp":38.5,"vis":24.135,"dewpt":19.8,"snow":0,"uv":10.4806,"weather":{"icon":"c01d","code":800,"description":"Clear Sky"},"wind_dir":238,"max_dhi":null,"clouds_hi":0,"precip":0,"low_temp":25.6,"max_temp":37.9,"moonset_ts":1594666626,"datetime":"2020-07-13","temp":29.9,"min_temp":23.9,"clouds_mid":0,"clouds_low":0},{"moonrise_ts":1594704790,"wind_cdir":"SSW","rh":51,"pres":998.212,"high_temp":34.9,"sunset_ts":1594772659,"ozone":284.416,"moon_phase":0.240667,"wind_gust_spd":7.01628,"snow_depth":0,"clouds":0,"ts":1594699260,"sunrise_ts":1594721209,"app_min_temp":26,"wind_spd":3.18058,"pop":0,"wind_cdir_full":"south-southwest","slp":1011.43,"moon_phase_lunation":0.81,"valid_date":"2020-07-14","app_max_temp":40.6,"vis":24.1351,"dewpt":19.4,"snow":0,"uv":10.4736,"weather":{"icon":"c01d","code":800,"description":"Clear Sky"},"wind_dir":209,"max_dhi":null,"clouds_hi":0,"precip":0,"low_temp":25.9,"max_temp":37,"moonset_ts":1594756480,"datetime":"2020-07-14","temp":31.3,"min_temp":25.7,"clouds_mid":0,"clouds_low":0},{"moonrise_ts":1594792969,"wind_cdir":"SSW","rh":57,"pres":1000.06,"high_temp":34.7,"sunset_ts":1594859030,"ozone":283.206,"moon_phase":0.158281,"wind_gust_spd":10.6217,"snow_depth":0,"clouds":0,"ts":1594785660,"sunrise_ts":1594807648,"app_min_temp":27.1,"wind_spd":3.74586,"pop":0,"wind_cdir_full":"south-southwest","slp":1013.26,"moon_phase_lunation":0.84,"valid_date":"2020-07-15","app_max_temp":40.7,"vis":24.1349,"dewpt":21.3,"snow":0,"uv":10.4607,"weather":{"icon":"c01d","code":800,"description":"Clear Sky"},"wind_dir":192,"max_dhi":null,"clouds_hi":0,"precip":0,"low_temp":25.4,"max_temp":36.1,"moonset_ts":1594846427,"datetime":"2020-07-15","temp":31.3,"min_temp":25.6,"clouds_mid":0,"clouds_low":0},{"moonrise_ts":1594881365,"wind_cdir":"SSW","rh":63,"pres":1003.66,"high_temp":36.1,"sunset_ts":1594945399,"ozone":284.394,"moon_phase":0.0888356,"wind_gust_spd":7.51395,"snow_depth":0,"clouds":0,"ts":1594872060,"sunrise_ts":1594894087,"app_min_temp":26.4,"wind_spd":3.47184,"pop":0,"wind_cdir_full":"south-southwest","slp":1016.85,"moon_phase_lunation":0.88,"valid_date":"2020-07-16","app_max_temp":38,"vis":24.135,"dewpt":21.6,"snow":0,"uv":10.4425,"weather":{"icon":"c01d","code":800,"description":"Clear Sky"},"wind_dir":196,"max_dhi":null,"clouds_hi":0,"precip":0,"low_temp":22.4,"max_temp":34.4,"moonset_ts":1594936429,"datetime":"2020-07-16","temp":30,"min_temp":25.6,"clouds_mid":0,"clouds_low":0},{"moonrise_ts":1594970066,"wind_cdir":"SSW","rh":61,"pres":1004.4,"high_temp":34.9,"sunset_ts":1595031767,"ozone":283.763,"moon_phase":0.0368658,"wind_gust_spd":7.01104,"snow_depth":0,"clouds":31,"ts":1594958460,"sunrise_ts":1594980527,"app_min_temp":26.3,"wind_spd":3.30242,"pop":0,"wind_cdir_full":"south-southwest","slp":1017.58,"moon_phase_lunation":0.91,"valid_date":"2020-07-17","app_max_temp":37.5,"vis":24.1351,"dewpt":20.9,"snow":0,"uv":10.4272,"weather":{"icon":"c02d","code":802,"description":"Scattered clouds"},"wind_dir":205,"max_dhi":null,"clouds_hi":31,"precip":0,"low_temp":25.9,"max_temp":34.9,"moonset_ts":1595026390,"datetime":"2020-07-17","temp":30.3,"min_temp":25.6,"clouds_mid":0,"clouds_low":5},{"moonrise_ts":1595059153,"wind_cdir":"SW","rh":59,"pres":1004.53,"high_temp":34.6,"sunset_ts":1595118133,"ozone":289.311,"moon_phase":0.00671176,"wind_gust_spd":10.4332,"snow_depth":0,"clouds":90,"ts":1595044860,"sunrise_ts":1595066968,"app_min_temp":26.5,"wind_spd":4.10439,"pop":10,"wind_cdir_full":"southwest","slp":1017.93,"moon_phase_lunation":0.94,"valid_date":"2020-07-18","app_max_temp":36.7,"vis":24.135,"dewpt":20.4,"snow":0,"uv":3.79318,"weather":{"icon":"c04d","code":804,"description":"Overcast clouds"},"wind_dir":225,"max_dhi":null,"clouds_hi":88,"precip":0.3125,"low_temp":24.8,"max_temp":34.7,"moonset_ts":1595116186,"datetime":"2020-07-18","temp":30.3,"min_temp":24.8,"clouds_mid":0,"clouds_low":2},{"moonrise_ts":1595148680,"wind_cdir":"WSW","rh":58,"pres":1003.75,"high_temp":36.1,"sunset_ts":1595204497,"ozone":302.584,"moon_phase":0.00178147,"wind_gust_spd":7.32145,"snow_depth":0,"clouds":50,"ts":1595131260,"sunrise_ts":1595153409,"app_min_temp":26,"wind_spd":2.6762,"pop":45,"wind_cdir_full":"west-southwest","slp":1017.3,"moon_phase_lunation":0.98,"valid_date":"2020-07-19","app_max_temp":38.1,"vis":24.1351,"dewpt":20.3,"snow":0,"uv":10.343,"weather":{"icon":"c03d","code":803,"description":"Broken clouds"},"wind_dir":241,"max_dhi":null,"clouds_hi":50,"precip":2.375,"low_temp":22.3,"max_temp":36.1,"moonset_ts":1595205704,"datetime":"2020-07-19","temp":30.8,"min_temp":22.3,"clouds_mid":39,"clouds_low":6}]
     * city_name : Raleigh
     * lon : -78.63861
     * timezone : America/New_York
     * lat : 35.7721
     * country_code : US
     * state_code : NC
     */

    @SerializedName("city_name")
    private String cityName;
    @SerializedName("lon")
    private String lon;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("lat")
    private String lat;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("state_code")
    private String stateCode;
    @SerializedName("data")
    private List<DataBean> data;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * moonrise_ts : 1593908297
         * wind_cdir : WSW
         * rh : 62
         * pres : 1002.45
         * high_temp : 35
         * sunset_ts : 1593908858
         * ozone : 309.409
         * moon_phase : 0.999161
         * wind_gust_spd : 6.5
         * snow_depth : 0
         * clouds : 17
         * ts : 1593835260
         * sunrise_ts : 1593856866
         * app_min_temp : 23.5
         * wind_spd : 1.98115
         * pop : 65
         * wind_cdir_full : west-southwest
         * slp : 1012.24
         * moon_phase_lunation : 0.47
         * valid_date : 2020-07-04
         * app_max_temp : 35.8
         * vis : 23.1
         * dewpt : 20.1
         * snow : 0
         * uv : 10.6621
         * weather : {"icon":"r01d","code":500,"description":"Light rain"}
         * wind_dir : 245
         * max_dhi : null
         * clouds_hi : 4
         * precip : 5.0625
         * low_temp : 23.2
         * max_temp : 35
         * moonset_ts : 1593857697
         * datetime : 2020-07-04
         * temp : 29.2
         * min_temp : 22.8
         * clouds_mid : 0
         * clouds_low : 15
         */

        @SerializedName("moonrise_ts")
        private double moonriseTs;
        @SerializedName("wind_cdir")
        private String windCdir;
        @SerializedName("rh")
        private double rh;
        @SerializedName("pres")
        private double pres;
        @SerializedName("high_temp")
        private double highTemp;
        @SerializedName("sunset_ts")
        private double sunsetTs;
        @SerializedName("ozone")
        private double ozone;
        @SerializedName("moon_phase")
        private double moonPhase;
        @SerializedName("wind_gust_spd")
        private double windGustSpd;
        @SerializedName("snow_depth")
        private double snowDepth;
        @SerializedName("clouds")
        private double clouds;
        @SerializedName("ts")
        private double ts;
        @SerializedName("sunrise_ts")
        private double sunriseTs;
        @SerializedName("app_min_temp")
        private double appMinTemp;
        @SerializedName("wind_spd")
        private double windSpd;
        @SerializedName("pop")
        private double pop;
        @SerializedName("wind_cdir_full")
        private String windCdirFull;
        @SerializedName("slp")
        private double slp;
        @SerializedName("moon_phase_lunation")
        private double moonPhaseLunation;
        @SerializedName("valid_date")
        private String validDate;
        @SerializedName("app_max_temp")
        private double appMaxTemp;
        @SerializedName("vis")
        private double vis;
        @SerializedName("dewpt")
        private double dewpt;
        @SerializedName("snow")
        private double snow;
        @SerializedName("uv")
        private double uv;
        @SerializedName("weather")
        private WeatherBean weather;
        @SerializedName("wind_dir")
        private double windDir;
        @SerializedName("max_dhi")
        private Object maxDhi;
        @SerializedName("clouds_hi")
        private double cloudsHi;
        @SerializedName("precip")
        private double precip;
        @SerializedName("low_temp")
        private double lowTemp;
        @SerializedName("max_temp")
        private double maxTemp;
        @SerializedName("moonset_ts")
        private double moonsetTs;
        @SerializedName("datetime")
        private String datetime;
        @SerializedName("temp")
        private double temp;
        @SerializedName("min_temp")
        private double minTemp;
        @SerializedName("clouds_mid")
        private double cloudsMid;
        @SerializedName("clouds_low")
        private double cloudsLow;

        public double getMoonriseTs() {
            return moonriseTs;
        }

        public void setMoonriseTs(double moonriseTs) {
            this.moonriseTs = moonriseTs;
        }

        public String getWindCdir() {
            return windCdir;
        }

        public void setWindCdir(String windCdir) {
            this.windCdir = windCdir;
        }

        public double getRh() {
            return (int) (rh*100)/100.0;
        }

        public void setRh(double rh) {
            this.rh = rh;
        }

        public double getPres() {
            return (int) (pres*100)/100.0;
        }

        public void setPres(double pres) {
            this.pres = pres;
        }

        public double getHighTemp() {
            return highTemp;
        }

        public void setHighTemp(double highTemp) {
            this.highTemp = highTemp;
        }

        public double getSunsetTs() {
            return sunsetTs;
        }

        public void setSunsetTs(double sunsetTs) {
            this.sunsetTs = sunsetTs;
        }

        public double getOzone() {
            return ozone;
        }

        public void setOzone(double ozone) {
            this.ozone = ozone;
        }

        public double getMoonPhase() {
            return moonPhase;
        }

        public void setMoonPhase(double moonPhase) {
            this.moonPhase = moonPhase;
        }

        public double getWindGustSpd() {
            return windGustSpd;
        }

        public void setWindGustSpd(double windGustSpd) {
            this.windGustSpd = windGustSpd;
        }

        public double getSnowDepth() {
            return snowDepth;
        }

        public void setSnowDepth(double snowDepth) {
            this.snowDepth = snowDepth;
        }

        public double getClouds() {
            return clouds;
        }

        public void setClouds(double clouds) {
            this.clouds = clouds;
        }

        public double getTs() {
            return ts;
        }

        public void setTs(double ts) {
            this.ts = ts;
        }

        public double getSunriseTs() {
            return sunriseTs;
        }

        public void setSunriseTs(double sunriseTs) {
            this.sunriseTs = sunriseTs;
        }

        public double getAppMinTemp() {
            return appMinTemp;
        }

        public void setAppMinTemp(double appMinTemp) {
            this.appMinTemp = appMinTemp;
        }

        public double getWindSpd() {
            return (int) (windSpd*100)/100.0;
        }

        public void setWindSpd(double windSpd) {
            this.windSpd = windSpd;
        }

        public double getPop() {
            return pop;
        }

        public void setPop(double pop) {
            this.pop = pop;
        }

        public String getWindCdirFull() {
            return windCdirFull;
        }

        public void setWindCdirFull(String windCdirFull) {
            this.windCdirFull = windCdirFull;
        }

        public double getSlp() {
            return slp;
        }

        public void setSlp(double slp) {
            this.slp = slp;
        }

        public double getMoonPhaseLunation() {
            return moonPhaseLunation;
        }

        public void setMoonPhaseLunation(double moonPhaseLunation) {
            this.moonPhaseLunation = moonPhaseLunation;
        }

        public String getValidDate() {
            return validDate;
        }

        public void setValidDate(String validDate) {
            this.validDate = validDate;
        }

        public double getAppMaxTemp() {
            return appMaxTemp;
        }

        public void setAppMaxTemp(double appMaxTemp) {
            this.appMaxTemp = appMaxTemp;
        }

        public double getVis() {
            return vis;
        }

        public void setVis(double vis) {
            this.vis = vis;
        }

        public double getDewpt() {
            return dewpt;
        }

        public void setDewpt(double dewpt) {
            this.dewpt = dewpt;
        }

        public double getSnow() {
            return snow;
        }

        public void setSnow(double snow) {
            this.snow = snow;
        }

        public double getUv() {
            return (int) (uv*100)/100.0;
        }

        public void setUv(double uv) {
            this.uv = uv;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
        }

        public double getWindDir() {
            return windDir;
        }

        public void setWindDir(double windDir) {
            this.windDir = windDir;
        }

        public Object getMaxDhi() {
            return maxDhi;
        }

        public void setMaxDhi(Object maxDhi) {
            this.maxDhi = maxDhi;
        }

        public double getCloudsHi() {
            return cloudsHi;
        }

        public void setCloudsHi(double cloudsHi) {
            this.cloudsHi = cloudsHi;
        }

        public double getPrecip() {
            return (precip*100)/100.0;
        }

        public void setPrecip(double precip) {
            this.precip = precip;
        }

        public double getLowTemp() {
            return lowTemp;
        }

        public void setLowTemp(double lowTemp) {
            this.lowTemp = lowTemp;
        }

        public double getMaxTemp() {
            return (int) (maxTemp*100)/100.0;
        }

        public void setMaxTemp(double maxTemp) {
            this.maxTemp = maxTemp;
        }

        public double getMoonsetTs() {
            return moonsetTs;
        }

        public void setMoonsetTs(double moonsetTs) {
            this.moonsetTs = moonsetTs;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getMinTemp() {
            return (int) (minTemp*100)/100.0;
        }

        public void setMinTemp(double minTemp) {
            this.minTemp = minTemp;
        }

        public double getCloudsMid() {
            return cloudsMid;
        }

        public void setCloudsMid(double cloudsMid) {
            this.cloudsMid = cloudsMid;
        }

        public double getCloudsLow() {
            return cloudsLow;
        }

        public void setCloudsLow(double cloudsLow) {
            this.cloudsLow = cloudsLow;
        }

        public static class WeatherBean {
            /**
             * icon : r01d
             * code : 500
             * description : Light rain
             */

            @SerializedName("icon")
            private String icon;
            @SerializedName("code")
            private double code;
            @SerializedName("description")
            private String description;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public double getCode() {
                return code;
            }

            public void setCode(double code) {
                this.code = code;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}
