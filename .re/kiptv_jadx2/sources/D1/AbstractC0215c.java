package D1;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

public abstract class AbstractC0215c {
    public static ContentInfo.Builder h(ClipData clipData, int i3) {
        return new ContentInfo.Builder(clipData, i3);
    }

    public static ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static ScrollCaptureSession k(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static ScrollCaptureTarget l(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }
}
