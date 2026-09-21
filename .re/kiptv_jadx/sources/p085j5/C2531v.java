package p085j5;

/* JADX INFO: renamed from: j5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2531v implements p016b6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p085j5.K f24220a;

    public /* synthetic */ C2531v(p085j5.K k9) {
        this.f24220a = k9;
    }

    public final void a(java.lang.String prefix, int i3, java.lang.String text) {
        p085j5.K k9 = this.f24220a;
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(text, "text");
        if (i3 > 30) {
            return;
        }
        java.lang.String strM = B2.a.m("[", prefix, "] ", O7.q.r1(text).toString());
        if (kotlin.jvm.internal.m.a(strM, k9.H) || k9.f23966G >= 40) {
            return;
        }
        k9.H = strM;
        k9.f23966G++;
        p085j5.K.w(i3 <= 20 ? "mpv_error" : "mpv_warn", strM);
    }
}
