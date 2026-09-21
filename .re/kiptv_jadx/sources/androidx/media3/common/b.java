package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16401a;

    public /* synthetic */ b(int i3) {
        this.f16401a = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z6;
        switch (this.f16401a) {
            case 0:
                return ((androidx.media3.common.Label) obj).toBundle();
            case 1:
                return androidx.media3.common.Label.fromBundle((android.os.Bundle) obj);
            case 2:
                return androidx.media3.common.Format.lambda$toLogString$0((androidx.media3.common.Label) obj);
            case 3:
                return ((androidx.media3.common.StreamKey) obj).toBundle();
            case 4:
                return ((androidx.media3.common.MediaItem.SubtitleConfiguration) obj).toBundle();
            case 5:
                return androidx.media3.common.StreamKey.fromBundle((android.os.Bundle) obj);
            case 6:
                return androidx.media3.common.MediaItem.SubtitleConfiguration.fromBundle((android.os.Bundle) obj);
            case 7:
                return androidx.media3.common.Format.fromBundle((android.os.Bundle) obj);
            case 8:
                return ((androidx.media3.common.TrackSelectionOverride) obj).toBundle();
            case 9:
                return androidx.media3.common.TrackSelectionOverride.fromBundle((android.os.Bundle) obj);
            case 10:
                return ((androidx.media3.common.Tracks.Group) obj).toBundle();
            case 11:
                return androidx.media3.common.Tracks.Group.fromBundle((android.os.Bundle) obj);
            case 12:
                return androidx.media3.common.audio.DefaultGainProvider.Builder.lambda$new$0((android.util.Pair) obj);
            case 13:
                return androidx.media3.common.text.CueGroup.lambda$static$0((androidx.media3.common.text.Cue) obj);
            case 14:
                return androidx.media3.common.text.Cue.fromBundle((android.os.Bundle) obj);
            case 15:
                return ((androidx.media3.common.text.Cue) obj).toBinderBasedBundle();
            case 16:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$processMoovAtom$2((androidx.media3.extractor.mp4.Track) obj);
            case 17:
                java.lang.String str = (java.lang.String) obj;
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
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 16);
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
                java.util.Collection collection = (java.util.Collection) obj;
                int i9 = p076i4.AbstractC2210n0.f22924k;
                if (collection instanceof p076i4.AbstractC2210n0) {
                    p076i4.AbstractC2210n0 abstractC2210n0 = (p076i4.AbstractC2210n0) collection;
                    abstractC2210n0.getClass();
                    return abstractC2210n0;
                }
                boolean z9 = collection instanceof p076i4.K0;
                int size = z9 ? ((p076i4.C2208m0) ((p076i4.Y0) ((p076i4.K0) collection)).r()).size() : 11;
                p076i4.C2206l0 c2206l0 = new p076i4.C2206l0();
                c2206l0.f22916b = false;
                p076i4.N0 n3 = new p076i4.N0();
                n3.d(size);
                c2206l0.f22915a = n3;
                if (z9) {
                    p076i4.K0 k1 = (p076i4.K0) collection;
                    p076i4.N0 n9 = k1 instanceof p076i4.Y0 ? ((p076i4.Y0) k1).f22853l : null;
                    if (n9 != null) {
                        n3.a(java.lang.Math.max(n3.f22819c, n9.f22819c));
                        i3 = n9.f22819c == 0 ? -1 : 0;
                        while (i3 >= 0) {
                            com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, n9.f22819c);
                            java.lang.Object obj2 = n9.f22817a[i3];
                            com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, n9.f22819c);
                            c2206l0.c(n9.f22818b[i3], obj2);
                            i3++;
                            if (i3 >= n9.f22819c) {
                                i3 = -1;
                            }
                        }
                    } else {
                        p076i4.AbstractC2210n0 abstractC2210n1 = (p076i4.AbstractC2210n0) k1;
                        p076i4.AbstractC2214p0 abstractC2214p0S = abstractC2210n1.s();
                        p076i4.N0 n10 = c2206l0.f22915a;
                        n10.a(java.lang.Math.max(n10.f22819c, abstractC2214p0S.size()));
                        for (p076i4.M0 m8 : abstractC2210n1.s()) {
                            c2206l0.c(m8.a(), m8.f22813a);
                        }
                    }
                } else {
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        c2206l0.a(it.next());
                    }
                }
                java.util.Objects.requireNonNull(c2206l0.f22915a);
                if (c2206l0.f22915a.f22819c == 0) {
                    return p076i4.Y0.f22852o;
                }
                c2206l0.f22916b = true;
                return new p076i4.Y0(c2206l0.f22915a);
        }
    }
}
