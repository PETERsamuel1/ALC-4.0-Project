package com.petersamuel.alc40;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutALC extends AppCompatActivity {

    private ProgressBar mLoadingProgress;
    private WebView webView;
    String url = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        mLoadingProgress = (ProgressBar)findViewById(R.id.pb_loading);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_action_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutALC.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mLoadingProgress.setVisibility(View.VISIBLE);

        loadAboutDetails();

    }

    private void loadAboutDetails(){
        webView = (WebView) findViewById(R.id.view_about);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        mLoadingProgress.setVisibility(View.INVISIBLE);
        webView.loadUrl(url);
    }
}
