package A1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f125h;

    public /* synthetic */ b(int i3) {
        this.f125h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String lowerCase;
        switch (this.f125h) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b9 = bArr[i3];
                    byte b10 = bArr2[i3];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
            case 1:
                return kotlin.jvm.internal.m.f(((F.m0) obj2).f3477a, ((F.m0) obj).f3477a);
            case 2:
                return kotlin.jvm.internal.m.f(((F.F) obj).getIndex(), ((F.F) obj2).getIndex());
            case 3:
                Q0.F f9 = (Q0.F) obj;
                Q0.F f10 = (Q0.F) obj2;
                float f11 = f9.f8233O.f8282p.f8359L;
                float f12 = f10.f8233O.f8282p.f8359L;
                return f11 == f12 ? kotlin.jvm.internal.m.f(f9.y(), f10.y()) : java.lang.Float.compare(f11, f12);
            case 4:
                com.kiptv.core.model.TMDBVideo tMDBVideo = (com.kiptv.core.model.TMDBVideo) obj;
                com.kiptv.core.model.TMDBVideo tMDBVideo2 = (com.kiptv.core.model.TMDBVideo) obj2;
                java.lang.String str = tMDBVideo.f20346f;
                java.lang.String lowerCase2 = null;
                if (str != null) {
                    lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                boolean zA = kotlin.jvm.internal.m.a(lowerCase, "trailer");
                java.lang.String str2 = tMDBVideo2.f20346f;
                if (str2 != null) {
                    lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                }
                if (zA != kotlin.jvm.internal.m.a(lowerCase2, "trailer")) {
                    if (zA) {
                        return -1;
                    }
                    return 1;
                }
                java.lang.Boolean bool = tMDBVideo.g;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                java.lang.Boolean bool2 = tMDBVideo2.g;
                if (zBooleanValue == (bool2 != null ? bool2.booleanValue() : false)) {
                    return 0;
                }
                if (zBooleanValue) {
                    return -1;
                }
                return 1;
            case 5:
                return androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor.compare((androidx.media3.datasource.cache.CacheSpan) obj, (androidx.media3.datasource.cache.CacheSpan) obj2);
            case 6:
                return androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.lambda$new$0((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute) obj, (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute) obj2);
            case 7:
                return androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.lambda$static$0((androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj, (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj2);
            case 8:
                return kotlin.jvm.internal.m.f(((p020c0.O) obj).f18176b, ((p020c0.O) obj2).f18176b);
            default:
                p070h6.k kVar = (p070h6.k) obj;
                p070h6.k kVar2 = (p070h6.k) obj2;
                return (((java.lang.Number) kVar.f22540i).intValue() - ((java.lang.Number) kVar.f22539h).intValue()) - (((java.lang.Number) kVar2.f22540i).intValue() - ((java.lang.Number) kVar2.f22539h).intValue());
        }
    }
}
