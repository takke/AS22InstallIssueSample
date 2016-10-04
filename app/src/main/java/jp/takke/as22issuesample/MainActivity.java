package jp.takke.as22issuesample;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            PackageInfo pinfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_META_DATA);
            final TextView text1 = (TextView) findViewById(R.id.text1);
            text1.setText("r" + pinfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
        }
    }
}
