package A1;

import F.F;
import F.m0;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.kiptv.core.model.TMDBVideo;
import java.util.Comparator;
import java.util.Locale;
import p020c0.O;

public final class b implements Comparator {

    public final int f125h;

    public b(int i3) {
        this.f125h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String lowerCase;
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
                return kotlin.jvm.internal.m.f(((m0) obj2).f3477a, ((m0) obj).f3477a);
            case 2:
                return kotlin.jvm.internal.m.f(((F) obj).getIndex(), ((F) obj2).getIndex());
            case 3:
                Q0.F f9 = (Q0.F) obj;
                Q0.F f10 = (Q0.F) obj2;
                float f11 = f9.f8233O.f8282p.f8359L;
                float f12 = f10.f8233O.f8282p.f8359L;
                return f11 == f12 ? kotlin.jvm.internal.m.f(f9.y(), f10.y()) : Float.compare(f11, f12);
            case 4:
                TMDBVideo tMDBVideo = (TMDBVideo) obj;
                TMDBVideo tMDBVideo2 = (TMDBVideo) obj2;
                String str = tMDBVideo.f20346f;
                String lowerCase2 = null;
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                boolean zA = kotlin.jvm.internal.m.a(lowerCase, "trailer");
                String str2 = tMDBVideo2.f20346f;
                if (str2 != null) {
                    lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                }
                if (zA != kotlin.jvm.internal.m.a(lowerCase2, "trailer")) {
                    if (zA) {
                        return -1;
                    }
                    return 1;
                }
                Boolean bool = tMDBVideo.g;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = tMDBVideo2.g;
                if (zBooleanValue == (bool2 != null ? bool2.booleanValue() : false)) {
                    return 0;
                }
                if (zBooleanValue) {
                    return -1;
                }
                return 1;
            case 5:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 6:
                return HlsMediaPlaylist.Interstitial.lambda$new$0((HlsMediaPlaylist.ClientDefinedAttribute) obj, (HlsMediaPlaylist.ClientDefinedAttribute) obj2);
            case 7:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            case 8:
                return kotlin.jvm.internal.m.f(((O) obj).f18176b, ((O) obj2).f18176b);
            default:
                p070h6.k kVar = (p070h6.k) obj;
                p070h6.k kVar2 = (p070h6.k) obj2;
                return (((Number) kVar.f22540i).intValue() - ((Number) kVar.f22539h).intValue()) - (((Number) kVar2.f22540i).intValue() - ((Number) kVar2.f22539h).intValue());
        }
    }
}
