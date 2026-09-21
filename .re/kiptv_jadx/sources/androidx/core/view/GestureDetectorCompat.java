package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.GestureDetector f16085a;

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener, android.os.Handler handler) {
        this.f16085a = new android.view.GestureDetector(context, onGestureListener, handler);
    }
}
