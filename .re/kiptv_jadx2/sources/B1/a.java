package B1;

import android.app.NotificationChannel;
import android.app.RemoteAction;
import android.graphics.ColorSpace;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;

public abstract class a {
    public static void B(Object obj) {
    }

    public static NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static RemoteAction f(Object obj) {
        return (RemoteAction) obj;
    }

    public static ColorSpace i(Object obj) {
        return (ColorSpace) obj;
    }

    public static TextClassification m(Object obj) {
        return (TextClassification) obj;
    }

    public static TextClassifier n(Object obj) {
        return (TextClassifier) obj;
    }
}
