package jjtorri.webviewapp;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mainWebView = (WebView) findViewById(R.id.main_webview);
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ;
        mainWebView.addJavascriptInterface(
                new AndroidId(
                           Settings.Secure.getString(getApplicationContext().getContentResolver(),
                           Settings.Secure.ANDROID_ID)),
                       "androidId");
        mainWebView.loadUrl("file:///android_asset/test.html");
    }
}
