package kr.hansung.pocs.alimi;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

public class SettingsActivity extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);

		//Preference notification = (CheckBoxPreference) findPreference("notification");
		//Preference vibration = (CheckBoxPreference) findPreference("vibration");
		//Preference initializaion = (Preference) findPreference("initialization");
		/*Preference information = (Preference) findPreference("information");
		information
				.setOnPreferenceClickListener(new OnPreferenceClickListener() {
					@Override
					public boolean onPreferenceClick(Preference preference) {
						new AlertDialog.Builder(getApplicationContext())
								.setIcon(R.drawable.pocs_square)
								.setTitle("개발자 정보").setMessage("Server : 한종빈 \n Client : 오준형")
								.setNeutralButton("닫기", null).show();
						return false;
					}
				});*/
	}

	@Override
	@Deprecated
	public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen,
			Preference preference) {

		return super.onPreferenceTreeClick(preferenceScreen, preference);
	}

}
