package com.bluelife.test.webviewbugtest;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by slomka.jin on 2016/1/26.
 */
public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}