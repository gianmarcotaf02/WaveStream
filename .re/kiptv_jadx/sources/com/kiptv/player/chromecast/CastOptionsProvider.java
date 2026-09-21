package com.kiptv.player.chromecast;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/kiptv/player/chromecast/CastOptionsProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lx3/b;", "getCastOptions", "(Landroid/content/Context;)Lx3/b;", "", "Lcom/google/android/gms/internal/cast/e;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "player_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CastOptionsProvider {
    public java.util.List<com.google.android.gms.internal.cast.C1735e> getAdditionalSessionProviders(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        return null;
    }

    public p191x3.C3101b getCastOptions(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p184w3.i iVar = new p184w3.i();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        p199y3.a aVar = p191x3.C3101b.f31167z;
        if (aVar != null) {
            return new p191x3.C3101b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, p191x3.C3101b.f31166x, p191x3.C3101b.y);
        }
        throw new java.lang.NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
