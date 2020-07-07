package in.org.weatherapp.view.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OpenWeather
{

    /**
     * cod : 200
     * message : 0
     * cnt : 40
     * list : [{"dt":1592730000,"main":{"temp":314.68,"feels_like":312.78,"temp_min":314.68,"temp_max":315.27,"pressure":997,"sea_level":995,"grnd_level":974,"humidity":23,"temp_kf":-0.59},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":16},"wind":{"speed":5.63,"deg":247},"sys":{"pod":"d"},"dt_txt":"2020-06-21 09:00:00"},{"dt":1592740800,"main":{"temp":309.31,"feels_like":303,"temp_min":307.99,"temp_max":309.31,"pressure":994,"sea_level":993,"grnd_level":972,"humidity":36,"temp_kf":1.32},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":40},"wind":{"speed":13.43,"deg":354},"sys":{"pod":"d"},"dt_txt":"2020-06-21 12:00:00"},{"dt":1592751600,"main":{"temp":310.41,"feels_like":307.7,"temp_min":310.16,"temp_max":310.41,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":29,"temp_kf":0.25},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":66},"wind":{"speed":6.83,"deg":250},"sys":{"pod":"n"},"dt_txt":"2020-06-21 15:00:00"},{"dt":1592762400,"main":{"temp":309.99,"feels_like":309.69,"temp_min":309.96,"temp_max":309.99,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":27,"temp_kf":0.03},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":79},"wind":{"speed":2.6,"deg":222},"sys":{"pod":"n"},"dt_txt":"2020-06-21 18:00:00"},{"dt":1592773200,"main":{"temp":309.54,"feels_like":307.88,"temp_min":309.54,"temp_max":309.54,"pressure":994,"sea_level":994,"grnd_level":972,"humidity":27,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":1},"wind":{"speed":4.35,"deg":238},"sys":{"pod":"n"},"dt_txt":"2020-06-21 21:00:00"},{"dt":1592784000,"main":{"temp":309.07,"feels_like":306.21,"temp_min":309.07,"temp_max":309.07,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":32,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":51},"wind":{"speed":7.26,"deg":263},"sys":{"pod":"n"},"dt_txt":"2020-06-22 00:00:00"},{"dt":1592794800,"main":{"temp":310.29,"feels_like":307.15,"temp_min":310.29,"temp_max":310.29,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":35,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":41},"wind":{"speed":9.16,"deg":271},"sys":{"pod":"d"},"dt_txt":"2020-06-22 03:00:00"},{"dt":1592805600,"main":{"temp":314.54,"feels_like":314.46,"temp_min":314.54,"temp_max":314.54,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":25,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":3.72,"deg":274},"sys":{"pod":"d"},"dt_txt":"2020-06-22 06:00:00"},{"dt":1592816400,"main":{"temp":315.82,"feels_like":315.59,"temp_min":315.82,"temp_max":315.82,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":21,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":2.98,"deg":100},"sys":{"pod":"d"},"dt_txt":"2020-06-22 09:00:00"},{"dt":1592827200,"main":{"temp":314.88,"feels_like":314.88,"temp_min":314.88,"temp_max":314.88,"pressure":992,"sea_level":992,"grnd_level":971,"humidity":22,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":39},"wind":{"speed":2.64,"deg":239},"sys":{"pod":"d"},"dt_txt":"2020-06-22 12:00:00"},{"dt":1592838000,"main":{"temp":312.54,"feels_like":312.5,"temp_min":312.54,"temp_max":312.54,"pressure":993,"sea_level":993,"grnd_level":972,"humidity":25,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":66},"wind":{"speed":2.73,"deg":200},"sys":{"pod":"n"},"dt_txt":"2020-06-22 15:00:00"},{"dt":1592848800,"main":{"temp":311.74,"feels_like":310.29,"temp_min":311.74,"temp_max":311.74,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":24,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":4.06,"deg":241},"sys":{"pod":"n"},"dt_txt":"2020-06-22 18:00:00"},{"dt":1592859600,"main":{"temp":310.14,"feels_like":309.66,"temp_min":310.14,"temp_max":310.14,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":27,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":1},"wind":{"speed":2.92,"deg":218},"sys":{"pod":"n"},"dt_txt":"2020-06-22 21:00:00"},{"dt":1592870400,"main":{"temp":309.04,"feels_like":307.68,"temp_min":309.04,"temp_max":309.04,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":32,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":39},"wind":{"speed":5.1,"deg":255},"sys":{"pod":"n"},"dt_txt":"2020-06-23 00:00:00"},{"dt":1592881200,"main":{"temp":311.34,"feels_like":310.62,"temp_min":311.34,"temp_max":311.34,"pressure":999,"sea_level":999,"grnd_level":977,"humidity":34,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":6,"deg":273},"sys":{"pod":"d"},"dt_txt":"2020-06-23 03:00:00"},{"dt":1592892000,"main":{"temp":315.14,"feels_like":313.84,"temp_min":315.14,"temp_max":315.14,"pressure":999,"sea_level":999,"grnd_level":978,"humidity":25,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":6},"wind":{"speed":5.76,"deg":290},"sys":{"pod":"d"},"dt_txt":"2020-06-23 06:00:00"},{"dt":1592902800,"main":{"temp":317.14,"feels_like":315.88,"temp_min":317.14,"temp_max":317.14,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":20,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.63,"deg":333},"sys":{"pod":"d"},"dt_txt":"2020-06-23 09:00:00"},{"dt":1592913600,"main":{"temp":317.22,"feels_like":316.31,"temp_min":317.22,"temp_max":317.22,"pressure":993,"sea_level":993,"grnd_level":973,"humidity":18,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.3,"deg":341},"sys":{"pod":"d"},"dt_txt":"2020-06-23 12:00:00"},{"dt":1592924400,"main":{"temp":314.94,"feels_like":314.68,"temp_min":314.94,"temp_max":314.94,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":20,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":1},"wind":{"speed":2.27,"deg":322},"sys":{"pod":"n"},"dt_txt":"2020-06-23 15:00:00"},{"dt":1592935200,"main":{"temp":314.21,"feels_like":311.35,"temp_min":314.21,"temp_max":314.21,"pressure":995,"sea_level":995,"grnd_level":974,"humidity":21,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":33},"wind":{"speed":6.06,"deg":220},"sys":{"pod":"n"},"dt_txt":"2020-06-23 18:00:00"},{"dt":1592946000,"main":{"temp":310.21,"feels_like":308.14,"temp_min":310.21,"temp_max":310.21,"pressure":995,"sea_level":995,"grnd_level":973,"humidity":34,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":7.29,"deg":230},"sys":{"pod":"n"},"dt_txt":"2020-06-23 21:00:00"},{"dt":1592956800,"main":{"temp":309.31,"feels_like":308.17,"temp_min":309.31,"temp_max":309.31,"pressure":995,"sea_level":995,"grnd_level":973,"humidity":36,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":23},"wind":{"speed":6.05,"deg":234},"sys":{"pod":"n"},"dt_txt":"2020-06-24 00:00:00"},{"dt":1592967600,"main":{"temp":312.67,"feels_like":309.26,"temp_min":312.67,"temp_max":312.67,"pressure":997,"sea_level":997,"grnd_level":975,"humidity":26,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":25},"wind":{"speed":7.94,"deg":277},"sys":{"pod":"d"},"dt_txt":"2020-06-24 03:00:00"},{"dt":1592978400,"main":{"temp":316.11,"feels_like":313.65,"temp_min":316.11,"temp_max":316.11,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":21,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":6.3,"deg":275},"sys":{"pod":"d"},"dt_txt":"2020-06-24 06:00:00"},{"dt":1592989200,"main":{"temp":318.44,"feels_like":316.61,"temp_min":318.44,"temp_max":318.44,"pressure":992,"sea_level":992,"grnd_level":972,"humidity":18,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":5.12,"deg":269},"sys":{"pod":"d"},"dt_txt":"2020-06-24 09:00:00"},{"dt":1593000000,"main":{"temp":317.7,"feels_like":315.32,"temp_min":317.7,"temp_max":317.7,"pressure":990,"sea_level":990,"grnd_level":970,"humidity":18,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":33},"wind":{"speed":5.59,"deg":253},"sys":{"pod":"d"},"dt_txt":"2020-06-24 12:00:00"},{"dt":1593010800,"main":{"temp":315.84,"feels_like":314.88,"temp_min":315.84,"temp_max":315.84,"pressure":991,"sea_level":991,"grnd_level":971,"humidity":20,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":97},"wind":{"speed":3.64,"deg":194},"sys":{"pod":"n"},"dt_txt":"2020-06-24 15:00:00"},{"dt":1593021600,"main":{"temp":313.9,"feels_like":311.55,"temp_min":313.9,"temp_max":313.9,"pressure":993,"sea_level":993,"grnd_level":972,"humidity":23,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":5.93,"deg":261},"sys":{"pod":"n"},"dt_txt":"2020-06-24 18:00:00"},{"dt":1593032400,"main":{"temp":312.15,"feels_like":310.15,"temp_min":312.15,"temp_max":312.15,"pressure":993,"sea_level":993,"grnd_level":972,"humidity":27,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6,"deg":252},"sys":{"pod":"n"},"dt_txt":"2020-06-24 21:00:00"},{"dt":1593043200,"main":{"temp":309.59,"feels_like":307.79,"temp_min":309.59,"temp_max":309.59,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":36,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":7.15,"deg":260},"sys":{"pod":"n"},"dt_txt":"2020-06-25 00:00:00"},{"dt":1593054000,"main":{"temp":311.28,"feels_like":310.16,"temp_min":311.28,"temp_max":311.28,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":33,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":6.23,"deg":273},"sys":{"pod":"d"},"dt_txt":"2020-06-25 03:00:00"},{"dt":1593064800,"main":{"temp":314.62,"feels_like":313.62,"temp_min":314.62,"temp_max":314.62,"pressure":996,"sea_level":996,"grnd_level":975,"humidity":27,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":5.82,"deg":262},"sys":{"pod":"d"},"dt_txt":"2020-06-25 06:00:00"},{"dt":1593075600,"main":{"temp":317.33,"feels_like":315.02,"temp_min":317.33,"temp_max":317.33,"pressure":992,"sea_level":992,"grnd_level":972,"humidity":21,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":5},"wind":{"speed":6.64,"deg":260},"sys":{"pod":"d"},"dt_txt":"2020-06-25 09:00:00"},{"dt":1593086400,"main":{"temp":317.07,"feels_like":314.89,"temp_min":317.07,"temp_max":317.07,"pressure":991,"sea_level":991,"grnd_level":970,"humidity":21,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":43},"wind":{"speed":6.34,"deg":257},"sys":{"pod":"d"},"dt_txt":"2020-06-25 12:00:00"},{"dt":1593097200,"main":{"temp":315.71,"feels_like":313.02,"temp_min":315.71,"temp_max":315.71,"pressure":992,"sea_level":992,"grnd_level":971,"humidity":22,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":59},"wind":{"speed":6.85,"deg":262},"sys":{"pod":"n"},"dt_txt":"2020-06-25 15:00:00"},{"dt":1593108000,"main":{"temp":308.34,"feels_like":303.9,"temp_min":308.34,"temp_max":308.34,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":43,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":77},"wind":{"speed":12.1,"deg":148},"rain":{"3h":1.38},"sys":{"pod":"n"},"dt_txt":"2020-06-25 18:00:00"},{"dt":1593118800,"main":{"temp":310.24,"feels_like":307.58,"temp_min":310.24,"temp_max":310.24,"pressure":994,"sea_level":994,"grnd_level":973,"humidity":36,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":8.75,"deg":229},"sys":{"pod":"n"},"dt_txt":"2020-06-25 21:00:00"},{"dt":1593129600,"main":{"temp":308.64,"feels_like":307.18,"temp_min":308.64,"temp_max":308.64,"pressure":995,"sea_level":995,"grnd_level":974,"humidity":42,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":0},"wind":{"speed":7.76,"deg":245},"rain":{"3h":0.94},"sys":{"pod":"n"},"dt_txt":"2020-06-26 00:00:00"},{"dt":1593140400,"main":{"temp":309.62,"feels_like":308.31,"temp_min":309.62,"temp_max":309.62,"pressure":998,"sea_level":998,"grnd_level":976,"humidity":41,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":7.9,"deg":267},"sys":{"pod":"d"},"dt_txt":"2020-06-26 03:00:00"},{"dt":1593151200,"main":{"temp":313.27,"feels_like":311.66,"temp_min":313.27,"temp_max":313.27,"pressure":997,"sea_level":997,"grnd_level":976,"humidity":30,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":8},"wind":{"speed":7.04,"deg":255},"sys":{"pod":"d"},"dt_txt":"2020-06-26 06:00:00"}]
     * city : {"id":1276330,"name":"Bhādra","coord":{"lat":29.1167,"lon":75.1667},"country":"IN","population":37629,"timezone":19800,"sunrise":1592697656,"sunset":1592748078}
     */

    @SerializedName("cod")
    private String cod;
    @SerializedName("message")
    private int message;
    @SerializedName("cnt")
    private int cnt;
    @SerializedName("city")
    private CityBean city;
    @SerializedName("list")
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1276330
         * name : Bhādra
         * coord : {"lat":29.1167,"lon":75.1667}
         * country : IN
         * population : 37629
         * timezone : 19800
         * sunrise : 1592697656
         * sunset : 1592748078
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("coord")
        private CoordBean coord;
        @SerializedName("country")
        private String country;
        @SerializedName("population")
        private int population;
        @SerializedName("timezone")
        private int timezone;
        @SerializedName("sunrise")
        private int sunrise;
        @SerializedName("sunset")
        private int sunset;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getTimezone() {
            return timezone;
        }

        public void setTimezone(int timezone) {
            this.timezone = timezone;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        public static class CoordBean {
            /**
             * lat : 29.1167
             * lon : 75.1667
             */

            @SerializedName("lat")
            private double lat;
            @SerializedName("lon")
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1592730000
         * main : {"temp":314.68,"feels_like":312.78,"temp_min":314.68,"temp_max":315.27,"pressure":997,"sea_level":995,"grnd_level":974,"humidity":23,"temp_kf":-0.59}
         * weather : [{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}]
         * clouds : {"all":16}
         * wind : {"speed":5.63,"deg":247}
         * sys : {"pod":"d"}
         * dt_txt : 2020-06-21 09:00:00
         * rain : {"3h":1.38}
         */

        @SerializedName("dt")
        private int dt;
        @SerializedName("main")
        private MainBean main;
        @SerializedName("clouds")
        private CloudsBean clouds;
        @SerializedName("wind")
        private WindBean wind;
        @SerializedName("sys")
        private SysBean sys;
        @SerializedName("dt_txt")
        private String dtTxt;
        @SerializedName("rain")
        private RainBean rain;
        @SerializedName("weather")
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDtTxt() {
            return dtTxt;
        }

        public void setDtTxt(String dtTxt) {
            this.dtTxt = dtTxt;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 314.68
             * feels_like : 312.78
             * temp_min : 314.68
             * temp_max : 315.27
             * pressure : 997
             * sea_level : 995
             * grnd_level : 974
             * humidity : 23
             * temp_kf : -0.59
             */

            @SerializedName("temp")
            private double temp;
            @SerializedName("feels_like")
            private double feelsLike;
            @SerializedName("temp_min")
            private double tempMin;
            @SerializedName("temp_max")
            private double tempMax;
            @SerializedName("pressure")
            private int pressure;
            @SerializedName("sea_level")
            private int seaLevel;
            @SerializedName("grnd_level")
            private int grndLevel;
            @SerializedName("humidity")
            private int humidity;
            @SerializedName("temp_kf")
            private double tempKf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getFeelsLike() {
                return feelsLike;
            }

            public void setFeelsLike(double feelsLike) {
                this.feelsLike = feelsLike;
            }

            public double getTempMin() {
                return tempMin;
            }

            public void setTempMin(double tempMin) {
                this.tempMin = tempMin;
            }

            public double getTempMax() {
                return tempMax;
            }

            public void setTempMax(double tempMax) {
                this.tempMax = tempMax;
            }

            public int getPressure() {
                return pressure;
            }

            public void setPressure(int pressure) {
                this.pressure = pressure;
            }

            public int getSeaLevel() {
                return seaLevel;
            }

            public void setSeaLevel(int seaLevel) {
                this.seaLevel = seaLevel;
            }

            public int getGrndLevel() {
                return grndLevel;
            }

            public void setGrndLevel(int grndLevel) {
                this.grndLevel = grndLevel;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTempKf() {
                return tempKf;
            }

            public void setTempKf(double tempKf) {
                this.tempKf = tempKf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 16
             */

            @SerializedName("all")
            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 5.63
             * deg : 247
             */

            @SerializedName("speed")
            private double speed;
            @SerializedName("deg")
            private int deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public int getDeg() {
                return deg;
            }

            public void setDeg(int deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : d
             */

            @SerializedName("pod")
            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class RainBean {
            /**
             * 3h : 1.38
             */

            @SerializedName("3h")
            private double $3h;

            public double get$3h() {
                return $3h;
            }

            public void set$3h(double $3h) {
                this.$3h = $3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 801
             * main : Clouds
             * description : few clouds
             * icon : 02d
             */

            @SerializedName("id")
            private int id;
            @SerializedName("main")
            private String main;
            @SerializedName("description")
            private String description;
            @SerializedName("icon")
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
