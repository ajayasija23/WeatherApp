package in.org.weatherapp.view.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefers {
    Context context;
    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor editor;
    public SharedPrefers(Context context)
    {
        this.context=context;
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);

    }
    public static void setDatainPrefs(String key,String value)
    {
        editor=sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }
    public static String getDataFromPrefs(String key)
    {
        String s=sharedPreferences.getString(key,"");
        return s;
    }
}
