package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p136q.w f7714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0.w0[] f7715b;

    static {
        p136q.w wVar = new p136q.w(8);
        O0.w0.f7707a.getClass();
        O0.x0 x0Var = O0.v0.g;
        wVar.h(1, x0Var);
        O0.x0 x0Var2 = O0.v0.f7703f;
        wVar.h(2, x0Var2);
        O0.x0 x0Var3 = O0.v0.f7699b;
        wVar.h(4, x0Var3);
        O0.x0 x0Var4 = O0.v0.f7701d;
        wVar.h(8, x0Var4);
        O0.x0 x0Var5 = O0.v0.f7704h;
        wVar.h(16, x0Var5);
        O0.x0 x0Var6 = O0.v0.f7702e;
        wVar.h(32, x0Var6);
        O0.x0 x0Var7 = O0.v0.f7705i;
        wVar.h(64, x0Var7);
        O0.x0 x0Var8 = O0.v0.f7700c;
        wVar.h(128, x0Var8);
        f7714a = wVar;
        f7715b = new O0.w0[]{x0Var, x0Var2, x0Var3, x0Var7, x0Var5, x0Var6, x0Var4, O0.v0.j, x0Var8};
    }

    public static final void a(Q0.K k9, O0.C0726o c0726o, long j, int i3, int i9) {
        if (O0.AbstractC0735y.g(j, -1L)) {
            return;
        }
        k9.a(c0726o.f7666b, (int) ((j >>> 48) & 65535));
        k9.a(c0726o.f7667c, (int) ((j >>> 32) & 65535));
        k9.a(c0726o.f7668d, i3 - ((int) ((j >>> 16) & 65535)));
        k9.a(c0726o.f7669e, i9 - ((int) (j & 65535)));
    }
}
