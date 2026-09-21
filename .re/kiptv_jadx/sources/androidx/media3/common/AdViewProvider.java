package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface AdViewProvider {
    default java.util.List<androidx.media3.common.AdOverlayInfo> getAdOverlayInfos() {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    android.view.ViewGroup getAdViewGroup();
}
