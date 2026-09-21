package t5;

import android.util.Log;
import android.webkit.ValueCallback;

public final class z1 implements ValueCallback {

    public final int f28519a;

    @Override
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        switch (this.f28519a) {
            case 0:
                Log.d("TvYouTube", "clean-chrome@load " + str);
                break;
            default:
                Log.d("TvYouTube", "clean-chrome@commit " + str);
                break;
        }
    }
}
