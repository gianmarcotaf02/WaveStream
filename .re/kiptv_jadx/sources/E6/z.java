package E6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E6.z f3225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E6.z f3226i;
    public static final E6.z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ E6.z[] f3227k;

    static {
        E6.z zVar = new E6.z("INVARIANT", 0);
        f3225h = zVar;
        E6.z zVar2 = new E6.z(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, 1);
        f3226i = zVar2;
        E6.z zVar3 = new E6.z(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT, 2);
        j = zVar3;
        E6.z[] zVarArr = {zVar, zVar2, zVar3};
        f3227k = zVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(zVarArr);
    }

    public static E6.z valueOf(java.lang.String str) {
        return (E6.z) java.lang.Enum.valueOf(E6.z.class, str);
    }

    public static E6.z[] values() {
        return (E6.z[]) f3227k.clone();
    }
}
