package U;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextSelection;

public abstract class AbstractC0944q {
    public static Notification.Builder d(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel e(int i3, String str, String str2) {
        return new NotificationChannel(str, str2, i3);
    }

    public static NotificationChannel g(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static AudioFocusRequest.Builder k(int i3) {
        return new AudioFocusRequest.Builder(i3);
    }

    public static AudioFocusRequest p(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static AutofillId s(Object obj) {
        return (AutofillId) obj;
    }

    public static TextClassificationManager t(Object obj) {
        return (TextClassificationManager) obj;
    }

    public static TextSelection u(Object obj) {
        return (TextSelection) obj;
    }

    public static Class v() {
        return TextClassificationManager.class;
    }

    public static void w() {
    }
}
