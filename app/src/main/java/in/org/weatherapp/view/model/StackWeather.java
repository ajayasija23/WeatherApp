package in.org.weatherapp.view.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StackWeather
{


    /**
     * data : [{"rh":39.7,"pod":"n","lon":75.9,"pres":969.712,"timezone":"Asia/Kolkata","ob_time":"2020-07-11 16:00","country_code":"IN","clouds":22,"ts":1594483235,"solar_rad":0,"state_code":"10","city_name":"Tohāna","wind_spd":4.22419,"wind_cdir_full":"south-southwest","wind_cdir":"SSW","slp":993.46,"vis":24,"h_angle":-90,"sunset":"13:52","dni":0,"dewpt":21.1,"snow":0,"uv":0,"precip":0,"wind_dir":209,"sunrise":"00:02","ghi":0,"dhi":0,"aqi":81,"lat":29.7,"weather":{"icon":"c02n","code":802,"description":"Scattered Clouds"},"datetime":"2020-07-11:15","temp":37,"station":"AV559","elev_angle":-21.92,"app_temp":41}]
     * count : 1
     */

    @SerializedName("count")
    private double count;
    @SerializedName("data")
    private List<DataBean> data;

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * rh : 39.7
         * pod : n
         * lon : 75.9
         * pres : 969.712
         * timezone : Asia/Kolkata
         * ob_time : 2020-07-11 16:00
         * country_code : IN
         * clouds : 22
         * ts : 1594483235
         * solar_rad : 0
         * state_code : 10
         * city_name : Tohāna
         * wind_spd : 4.22419
         * wind_cdir_full : south-southwest
         * wind_cdir : SSW
         * slp : 993.46
         * vis : 24
         * h_angle : -90
         * sunset : 13:52
         * dni : 0
         * dewpt : 21.1
         * snow : 0
         * uv : 0
         * precip : 0
         * wind_dir : 209
         * sunrise : 00:02
         * ghi : 0
         * dhi : 0
         * aqi : 81
         * lat : 29.7
         * weather : {"icon":"c02n","code":802,"description":"Scattered Clouds"}
         * datetime : 2020-07-11:15
         * temp : 37
         * station : AV559
         * elev_angle : -21.92
         * app_temp : 41
         */

        @SerializedName("rh")
        private double rh;
        @SerializedName("pod")
        private String pod;
        @SerializedName("lon")
        private double lon;
        @SerializedName("pres")
        private double pres;
        @SerializedName("timezone")
        private String timezone;
        @SerializedName("ob_time")
        private String obTime;
        @SerializedName("country_code")
        private String countryCode;
        @SerializedName("clouds")
        private double clouds;
        @SerializedName("ts")
        private long ts;
        @SerializedName("solar_rad")
        private double solarRad;
        @SerializedName("state_code")
        private String stateCode;
        @SerializedName("city_name")
        private String cityName;
        @SerializedName("wind_spd")
        private double windSpd;
        @SerializedName("wind_cdir_full")
        private String windCdirFull;
        @SerializedName("wind_cdir")
        private String windCdir;
        @SerializedName("slp")
        private double slp;
        @SerializedName("vis")
        private double vis;
        @SerializedName("h_angle")
        private double hAngle;
        @SerializedName("sunset")
        private String sunset;
        @SerializedName("dni")
        private double dni;
        @SerializedName("dewpt")
        private double dewpt;
        @SerializedName("snow")
        private double snow;
        @SerializedName("uv")
        private double uv;
        @SerializedName("precip")
        private double precip;
        @SerializedName("wind_dir")
        private double windDir;
        @SerializedName("sunrise")
        private String sunrise;
        @SerializedName("ghi")
        private double ghi;
        @SerializedName("dhi")
        private double dhi;
        @SerializedName("aqi")
        private double aqi;
        @SerializedName("lat")
        private double lat;
        @SerializedName("weather")
        private WeatherBean weather;
        @SerializedName("datetime")
        private String datetime;
        @SerializedName("temp")
        private double temp;
        @SerializedName("station")
        private String station;
        @SerializedName("elev_angle")
        private double elevAngle;
        @SerializedName("app_temp")
        private double appTemp;

        public double getRh() {
            return rh;
        }

        public void setRh(double rh) {
            this.rh = rh;
        }

        public String getPod() {
            return pod;
        }

        public void setPod(String pod) {
            this.pod = pod;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getPres() {
            return (int) (pres*100)/100.0;
        }

        public void setPres(double pres) {
            this.pres = pres;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getObTime() {
            return obTime;
        }

        public void setObTime(String obTime) {
            this.obTime = obTime;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public double getClouds() {
            return clouds;
        }

        public void setClouds(double clouds) {
            this.clouds = clouds;
        }

        public long getTs() {
            return ts;
        }

        public void setTs(long ts) {
            this.ts = ts;
        }

        public double getSolarRad() {
            return solarRad;
        }

        public void setSolarRad(double solarRad) {
            this.solarRad = solarRad;
        }

        public String getStateCode() {
            return stateCode;
        }

        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public double getWindSpd() {
            return windSpd;
        }

        public void setWindSpd(double windSpd) {
            this.windSpd = windSpd;
        }

        public String getWindCdirFull() {
            return windCdirFull;
        }

        public void setWindCdirFull(String windCdirFull) {
            this.windCdirFull = windCdirFull;
        }

        public String getWindCdir() {
            return windCdir;
        }

        public void setWindCdir(String windCdir) {
            this.windCdir = windCdir;
        }

        public double getSlp() {
            return slp;
        }

        public void setSlp(double slp) {
            this.slp = slp;
        }

        public double getVis() {
            return vis;
        }

        public void setVis(double vis) {
            this.vis = vis;
        }

        public double getHAngle() {
            return hAngle;
        }

        public void setHAngle(double hAngle) {
            this.hAngle = hAngle;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public double getDni() {
            return dni;
        }

        public void setDni(double dni) {
            this.dni = dni;
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
            return uv;
        }

        public void setUv(double uv) {
            this.uv = uv;
        }

        public double getPrecip() {
            return precip;
        }

        public void setPrecip(double precip) {
            this.precip = precip;
        }

        public double getWindDir() {
            return windDir;
        }

        public void setWindDir(double windDir) {
            this.windDir = windDir;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public double getGhi() {
            return ghi;
        }

        public void setGhi(double ghi) {
            this.ghi = ghi;
        }

        public double getDhi() {
            return dhi;
        }

        public void setDhi(double dhi) {
            this.dhi = dhi;
        }

        public double getAqi() {
            return aqi;
        }

        public void setAqi(double aqi) {
            this.aqi = aqi;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
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

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public double getElevAngle() {
            return elevAngle;
        }

        public void setElevAngle(double elevAngle) {
            this.elevAngle = elevAngle;
        }

        public double getAppTemp() {
            return appTemp;
        }

        public void setAppTemp(double appTemp) {
            this.appTemp = appTemp;
        }

        public static class WeatherBean {
            /**
             * icon : c02n
             * code : 802
             * description : Scattered Clouds
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

