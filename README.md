#Shared Preferences
* STEP - 1 (Get Shared Preference Object)
```
SharedPreferences sharedPreferences = getSharedPreferences(Constant.ME, MODE_PRIVATE);
```
* STEP - 2 (Get Editor for Shared Preference)
```
if (null != sharedPreferences)
sharedPreferencesEditor = sharedPreferences.edit();
```
* STEP - 3 (Steore data to SP through editor)
```
sharedPreferencesEditor.putString(Constant.preference.DATA, input);
```
* STEP - 4 (Apply or commmit changes)
```
sharedPreferencesEditor.apply();
//or
sharedPreferencesEditor.commit();
```
* STEP - 5 (Retrive data)
```
sharedPreferences.getString(Constant.preference.DATA, getResources().getString(R.string.text_no_data))
```

