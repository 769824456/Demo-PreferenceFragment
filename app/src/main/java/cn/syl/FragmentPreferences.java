package cn.syl;


import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/*
 * PROJECT_NAME :cn.syl
 * VERSION :[V 1.0.0]
 * AUTHOR : yulong sun
 * CREATE AT : 2015/8/7 12:11
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class FragmentPreferences extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefsFragement()).commit();
    }

    public static class PrefsFragement extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //从xml添加资源
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
