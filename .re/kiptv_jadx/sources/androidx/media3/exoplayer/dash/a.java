package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return androidx.media3.exoplayer.dash.BaseUrlExclusionList.compareBaseUrl((androidx.media3.exoplayer.dash.manifest.BaseUrl) obj, (androidx.media3.exoplayer.dash.manifest.BaseUrl) obj2);
    }
}
