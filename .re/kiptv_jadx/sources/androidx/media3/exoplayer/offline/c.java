package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16703i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f16702h = i3;
        this.f16703i = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (this.f16702h) {
            case 0:
                return ((androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer) this.f16703i).handleDownloadHelperCallbackMessage(message);
            default:
                return ((androidx.media3.exoplayer.offline.DownloadManager) this.f16703i).handleMainMessage(message);
        }
    }
}
