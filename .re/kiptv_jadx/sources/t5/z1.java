package t5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z1 implements android.webkit.ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28519a;

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        switch (this.f28519a) {
            case 0:
                android.util.Log.d("TvYouTube", "clean-chrome@load " + str);
                break;
            default:
                android.util.Log.d("TvYouTube", "clean-chrome@commit " + str);
                break;
        }
    }
}
