package in.org.weatherapp.view.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


    public class StackWeather
    {

        /**
         * request : {"type":"City","query":"New York, United States of America","language":"en","unit":"m"}
         * location : {"name":"New York","country":"United States of America","region":"New York","lat":"40.714","lon":"-74.006","timezone_id":"America/New_York","localtime":"2020-07-06 12:23","localtime_epoch":1594038180,"utc_offset":"-4.0"}
         * current : {"observation_time":"04:23 PM","temperature":32,"weather_code":116,"weather_icons":["https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0002_sunny_intervals.png"],"weather_descriptions":["Partly cloudy"],"wind_speed":15,"wind_degree":50,"wind_dir":"NE","pressure":1017,"precip":0,"humidity":33,"cloudcover":25,"feelslike":32,"uv_index":7,"visibility":16,"is_day":"yes"}
         */

        @SerializedName("request")
        private RequestBean request;
        @SerializedName("location")
        private LocationBean location;
        @SerializedName("current")
        private CurrentBean current;

        public RequestBean getRequest() {
            return request;
        }

        public void setRequest(RequestBean request) {
            this.request = request;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public CurrentBean getCurrent() {
            return current;
        }

        public void setCurrent(CurrentBean current) {
            this.current = current;
        }

        public static class RequestBean {
            /**
             * type : City
             * query : New York, United States of America
             * language : en
             * unit : m
             */

            @SerializedName("type")
            private String type;
            @SerializedName("query")
            private String query;
            @SerializedName("language")
            private String language;
            @SerializedName("unit")
            private String unit;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getQuery() {
                return query;
            }

            public void setQuery(String query) {
                this.query = query;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }
        }

        public static class LocationBean {
            /**
             * name : New York
             * country : United States of America
             * region : New York
             * lat : 40.714
             * lon : -74.006
             * timezone_id : America/New_York
             * localtime : 2020-07-06 12:23
             * localtime_epoch : 1594038180
             * utc_offset : -4.0
             */

            @SerializedName("name")
            private String name;
            @SerializedName("country")
            private String country;
            @SerializedName("region")
            private String region;
            @SerializedName("lat")
            private String lat;
            @SerializedName("lon")
            private String lon;
            @SerializedName("timezone_id")
            private String timezoneId;
            @SerializedName("localtime")
            private String localtime;
            @SerializedName("localtime_epoch")
            private double localtimeEpoch;
            @SerializedName("utc_offset")
            private String utcOffset;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTimezoneId() {
                return timezoneId;
            }

            public void setTimezoneId(String timezoneId) {
                this.timezoneId = timezoneId;
            }

            public String getLocaltime() {
                return localtime;
            }

            public void setLocaltime(String localtime) {
                this.localtime = localtime;
            }

            public double getLocaltimeEpoch() {
                return localtimeEpoch;
            }

            public void setLocaltimeEpoch(double localtimeEpoch) {
                this.localtimeEpoch = localtimeEpoch;
            }

            public String getUtcOffset() {
                return utcOffset;
            }

            public void setUtcOffset(String utcOffset) {
                this.utcOffset = utcOffset;
            }
        }

        public static class CurrentBean {
            /**
             * observation_time : 04:23 PM
             * temperature : 32
             * weather_code : 116
             * weather_icons : ["https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0002_sunny_intervals.png"]
             * weather_descriptions : ["Partly cloudy"]
             * wind_speed : 15
             * wind_degree : 50
             * wind_dir : NE
             * pressure : 1017
             * precip : 0
             * humidity : 33
             * cloudcover : 25
             * feelslike : 32
             * uv_index : 7
             * visibility : 16
             * is_day : yes
             */

            @SerializedName("observation_time")
            private String observationTime;
            @SerializedName("temperature")
            private double temperature;
            @SerializedName("weather_code")
            private double weatherCode;
            @SerializedName("wind_speed")
            private double windSpeed;
            @SerializedName("wind_degree")
            private double windDegree;
            @SerializedName("wind_dir")
            private String windDir;
            @SerializedName("pressure")
            private double pressure;
            @SerializedName("precip")
            private double precip;
            @SerializedName("humidity")
            private double humidity;
            @SerializedName("cloudcover")
            private double cloudcover;
            @SerializedName("feelslike")
            private double feelslike;
            @SerializedName("uv_index")
            private double uvIndex;
            @SerializedName("visibility")
            private double visibility;
            @SerializedName("is_day")
            private String isDay;
            @SerializedName("weather_icons")
            private List<String> weatherIcons;
            @SerializedName("weather_descriptions")
            private List<String> weatherDescriptions;

            public String getObservationTime() {
                return observationTime;
            }

            public void setObservationTime(String observationTime) {
                this.observationTime = observationTime;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getWeatherCode() {
                return weatherCode;
            }

            public void setWeatherCode(double weatherCode) {
                this.weatherCode = weatherCode;
            }

            public double getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(double windSpeed) {
                this.windSpeed = windSpeed;
            }

            public double getWindDegree() {
                return windDegree;
            }

            public void setWindDegree(double windDegree) {
                this.windDegree = windDegree;
            }

            public String getWindDir() {
                return windDir;
            }

            public void setWindDir(String windDir) {
                this.windDir = windDir;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getPrecip() {
                return precip;
            }

            public void setPrecip(double precip) {
                this.precip = precip;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getCloudcover() {
                return cloudcover;
            }

            public void setCloudcover(double cloudcover) {
                this.cloudcover = cloudcover;
            }

            public double getFeelslike() {
                return feelslike;
            }

            public void setFeelslike(double feelslike) {
                this.feelslike = feelslike;
            }

            public double getUvIndex() {
                return uvIndex;
            }

            public void setUvIndex(double uvIndex) {
                this.uvIndex = uvIndex;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public String getIsDay() {
                return isDay;
            }

            public void setIsDay(String isDay) {
                this.isDay = isDay;
            }

            public List<String> getWeatherIcons() {
                return weatherIcons;
            }

            public void setWeatherIcons(List<String> weatherIcons) {
                this.weatherIcons = weatherIcons;
            }

            public List<String> getWeatherDescriptions() {
                return weatherDescriptions;
            }

            public void setWeatherDescriptions(List<String> weatherDescriptions) {
                this.weatherDescriptions = weatherDescriptions;
            }
        }
    }