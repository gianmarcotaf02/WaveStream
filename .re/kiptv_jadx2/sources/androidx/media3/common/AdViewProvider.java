package androidx.media3.common;

import android.view.ViewGroup;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        Z z6 = AbstractC2186b0.f22868i;
        return S0.f22832l;
    }

    ViewGroup getAdViewGroup();
}
