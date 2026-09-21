package p048f1;

import Y6.f;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.m;
import org.videolan.libvlc.media.MediaPlayer;
import p065h1.a;
import p078i6.p;

public final class s implements Comparable {

    public static final s f21666i;
    public static final s j;

    public static final s f21667k;

    public static final s f21668l;

    public static final s f21669m;

    public static final s f21670n;

    public static final s f21671o;

    public final int f21672h;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(RCHTTPStatusCodes.UNSUCCESSFUL);
        s sVar4 = new s(RCHTTPStatusCodes.BAD_REQUEST);
        f21666i = sVar4;
        s sVar5 = new s(500);
        j = sVar5;
        s sVar6 = new s(600);
        f21667k = sVar6;
        s sVar7 = new s(MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
        s sVar8 = new s(MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING);
        s sVar9 = new s(MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR);
        f21668l = sVar4;
        f21669m = sVar5;
        f21670n = sVar6;
        f21671o = sVar7;
        p.B0(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }

    public s(int i3) {
        this.f21672h = i3;
        boolean z6 = false;
        if (1 <= i3 && i3 < 1001) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        a.a("Font weight can be in range [1, 1000]. Current value: " + i3);
    }

    @Override
    public final int compareTo(s sVar) {
        return m.f(this.f21672h, sVar.f21672h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f21672h == ((s) obj).f21672h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21672h;
    }

    public final String toString() {
        return f.j(new StringBuilder("FontWeight(weight="), this.f21672h, ')');
    }
}
