package com.kiptv.player.chromecast;

import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.cast.C1735e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p184w3.i;
import p191x3.C3101b;
import p199y3.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/kiptv/player/chromecast/CastOptionsProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lx3/b;", "getCastOptions", "(Landroid/content/Context;)Lx3/b;", "", "Lcom/google/android/gms/internal/cast/e;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "player_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CastOptionsProvider {
    public List<C1735e> getAdditionalSessionProviders(Context context) {
        m.e(context, "context");
        return null;
    }

    public C3101b getCastOptions(Context context) {
        m.e(context, "context");
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = C3101b.f31167z;
        if (aVar != null) {
            return new C3101b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, C3101b.f31166x, C3101b.y);
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
