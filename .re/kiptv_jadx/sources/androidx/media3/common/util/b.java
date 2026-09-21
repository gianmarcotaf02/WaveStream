package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16454i;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f16453h = i3;
        this.f16454i = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (this.f16453h) {
            case 0:
                return ((androidx.media3.common.util.ListenerSet) this.f16454i).handleMessage(message);
            default:
                return ((androidx.media3.common.util.StuckPlayerDetector) this.f16454i).handleMessage(message);
        }
    }
}
