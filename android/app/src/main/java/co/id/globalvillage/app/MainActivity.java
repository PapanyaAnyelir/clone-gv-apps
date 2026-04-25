package co.id.globalvillage.app;

import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onBackPressed() {
        WebView webView = getBridge().getWebView();
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            // Let the WebView JS handle it via popstate
            webView.evaluateJavascript("history.back()", null);
        }
    }
}
