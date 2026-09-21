package androidx.media3.common;

import android.os.Bundle;
import android.util.Pair;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p076i4.AbstractC2210n0;
import p076i4.AbstractC2214p0;
import p076i4.C2206l0;
import p076i4.C2208m0;
import p076i4.K0;
import p076i4.M0;
import p076i4.N0;
import p076i4.Y0;

public final class b implements p068h4.j {

    public final int f16401a;

    public b(int i3) {
        this.f16401a = i3;
    }

    @Override
    public final Object apply(Object obj) {
        boolean z6;
        switch (this.f16401a) {
            case 0:
                return ((Label) obj).toBundle();
            case 1:
                return Label.fromBundle((Bundle) obj);
            case 2:
                return Format.lambda$toLogString$0((Label) obj);
            case 3:
                return ((StreamKey) obj).toBundle();
            case 4:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 5:
                return StreamKey.fromBundle((Bundle) obj);
            case 6:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 7:
                return Format.fromBundle((Bundle) obj);
            case 8:
                return ((TrackSelectionOverride) obj).toBundle();
            case 9:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 10:
                return ((Tracks.Group) obj).toBundle();
            case 11:
                return Tracks.Group.fromBundle((Bundle) obj);
            case 12:
                return DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
            case 13:
                return CueGroup.lambda$static$0((Cue) obj);
            case 14:
                return Cue.fromBundle((Bundle) obj);
            case 15:
                return ((Cue) obj).toBinderBasedBundle();
            case 16:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            case 17:
                String str = (String) obj;
                p068h4.a aVar = l4.a.g;
                aVar.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length < 0) {
                        z6 = true;
                    } else if (aVar.c(str.charAt(length))) {
                        length--;
                    } else {
                        z6 = false;
                    }
                }
                if (z6 && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            default:
                Collection collection = (Collection) obj;
                int i9 = AbstractC2210n0.f22924k;
                if (collection instanceof AbstractC2210n0) {
                    AbstractC2210n0 abstractC2210n0 = (AbstractC2210n0) collection;
                    abstractC2210n0.getClass();
                    return abstractC2210n0;
                }
                boolean z9 = collection instanceof K0;
                int size = z9 ? ((C2208m0) ((Y0) ((K0) collection)).r()).size() : 11;
                C2206l0 c2206l0 = new C2206l0();
                c2206l0.f22916b = false;
                N0 n3 = new N0();
                n3.d(size);
                c2206l0.f22915a = n3;
                if (z9) {
                    K0 k1 = (K0) collection;
                    N0 n9 = k1 instanceof Y0 ? ((Y0) k1).f22853l : null;
                    if (n9 != null) {
                        n3.a(Math.max(n3.f22819c, n9.f22819c));
                        i3 = n9.f22819c == 0 ? -1 : 0;
                        while (i3 >= 0) {
                            AbstractC1864o0.R(i3, n9.f22819c);
                            Object obj2 = n9.f22817a[i3];
                            AbstractC1864o0.R(i3, n9.f22819c);
                            c2206l0.c(n9.f22818b[i3], obj2);
                            i3++;
                            if (i3 >= n9.f22819c) {
                                i3 = -1;
                            }
                        }
                    } else {
                        AbstractC2210n0 abstractC2210n1 = (AbstractC2210n0) k1;
                        AbstractC2214p0 abstractC2214p0S = abstractC2210n1.s();
                        N0 n10 = c2206l0.f22915a;
                        n10.a(Math.max(n10.f22819c, abstractC2214p0S.size()));
                        for (M0 m8 : abstractC2210n1.s()) {
                            c2206l0.c(m8.a(), m8.f22813a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        c2206l0.a(it.next());
                    }
                }
                Objects.requireNonNull(c2206l0.f22915a);
                if (c2206l0.f22915a.f22819c == 0) {
                    return Y0.f22852o;
                }
                c2206l0.f22916b = true;
                return new Y0(c2206l0.f22915a);
        }
    }
}
