package S;

import android.net.http.HttpEngine;
import android.net.http.UrlResponseInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.SelectRangeGesture;

public abstract class m {
    public static boolean C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static HttpEngine g(Object obj) {
        return (HttpEngine) obj;
    }

    public static UrlResponseInfo i(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static DeleteGesture j(Object obj) {
        return (DeleteGesture) obj;
    }

    public static DeleteRangeGesture k(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static HandwritingGesture l(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static JoinOrSplitGesture m(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static SelectRangeGesture n(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static boolean w(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
