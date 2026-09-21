package Q0;

/* JADX INFO: renamed from: Q0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766c implements p175v0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0.C0766c f8394a = new Q0.C0766c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f8395b;

    @Override // p175v0.r
    public final boolean b() {
        java.lang.Boolean bool = f8395b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw p121o0.p.h("canFocus is read before it is written");
    }

    @Override // p175v0.r
    public final void e(boolean z6) {
        f8395b = java.lang.Boolean.valueOf(z6);
    }
}
