package androidx.media3.session;

import android.graphics.Bitmap;

public final class n1 implements p068h4.j {

    public final int f17083a;

    public final Object f17084b;

    public n1(int i3, Object obj) {
        this.f17083a = i3;
        this.f17084b = obj;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f17083a) {
            case 0:
                return ((SizeAvoidingBitmapLoader) this.f17084b).scaleIfNecessary((Bitmap) obj);
            case 1:
                return ((MediaSessionService) this.f17084b).lambda$onUpdateNotification$3((RuntimeException) obj);
            default:
                return ((SizeLimitedBitmapLoader) this.f17084b).scaleIfNecessary((Bitmap) obj);
        }
    }
}
