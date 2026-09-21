package p085j5;

import B2.a;
import O7.q;
import kotlin.jvm.internal.m;
import p016b6.b;

public final class C2531v implements b {

    public final K f24220a;

    public C2531v(K k9) {
        this.f24220a = k9;
    }

    public final void a(String prefix, int i3, String text) {
        K k9 = this.f24220a;
        m.e(prefix, "prefix");
        m.e(text, "text");
        if (i3 > 30) {
            return;
        }
        String strM = a.m("[", prefix, "] ", q.r1(text).toString());
        if (m.a(strM, k9.H) || k9.f23966G >= 40) {
            return;
        }
        k9.H = strM;
        k9.f23966G++;
        K.w(i3 <= 20 ? "mpv_error" : "mpv_warn", strM);
    }
}
