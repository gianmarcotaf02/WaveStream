package D5;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f2166i;
    public final /* synthetic */ java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f2168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f2170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f2171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f2172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p020c0.C1675d0 f2173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p020c0.C1675d0 f2174r;

    public D0(long j, p194x6.j jVar, java.util.List list, long j9, java.util.List list2, boolean z6, kotlin.jvm.functions.Function0 function0, p194x6.j jVar2, p020c0.X x9, p020c0.C1675d0 c1675d0, p020c0.C1675d0 c1675d1) {
        this.f2165h = j;
        this.f2166i = jVar;
        this.j = list;
        this.f2167k = j9;
        this.f2168l = list2;
        this.f2169m = z6;
        this.f2170n = function0;
        this.f2171o = jVar2;
        this.f2172p = x9;
        this.f2173q = c1675d0;
        this.f2174r = c1675d1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        if (I0.c.c(event) != 2) {
            return java.lang.Boolean.FALSE;
        }
        long jA = I0.c.a(event.getKeyCode());
        boolean zA = I0.a.a(jA, this.f2165h);
        p020c0.X x9 = this.f2172p;
        p194x6.j jVar = this.f2166i;
        p020c0.C1675d0 c1675d0 = this.f2174r;
        java.util.List list = this.j;
        boolean z6 = false;
        p020c0.C1675d0 c1675d1 = this.f2173q;
        if (!zA) {
            boolean zA2 = I0.a.a(jA, this.f2167k);
            java.util.List list2 = this.f2168l;
            if (zA2) {
                if (((java.lang.Boolean) x9.getValue()).booleanValue()) {
                    int iG = c1675d1.g() + 1;
                    int iA0 = p078i6.p.A0(list);
                    if (iG > iA0) {
                        iG = iA0;
                    }
                    if (iG != c1675d1.g()) {
                        c1675d1.h(iG);
                        jVar.invoke(((C5.g2) list.get(iG)).f1336a);
                    }
                } else {
                    int iG2 = c1675d0.g() + 1;
                    int iA1 = p078i6.p.A0(list2);
                    if (iG2 > iA1) {
                        iG2 = iA1;
                    }
                    c1675d0.h(iG2);
                }
            } else if (I0.a.a(jA, I0.a.f4548e)) {
                if (!((java.lang.Boolean) x9.getValue()).booleanValue() && this.f2169m) {
                    x9.setValue(java.lang.Boolean.TRUE);
                }
            } else {
                if (!I0.a.a(jA, I0.a.f4549f)) {
                    if (I0.a.a(jA, I0.a.f4551i) || I0.a.a(jA, I0.a.f4560s)) {
                        if (((java.lang.Boolean) x9.getValue()).booleanValue()) {
                            x9.setValue(java.lang.Boolean.FALSE);
                        } else {
                            com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = (com.kiptv.core.model.XtreamLiveStream) p078i6.o.k1(c1675d0.g(), list2);
                            if (xtreamLiveStream != null) {
                                this.f2171o.invoke(xtreamLiveStream);
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z6);
                }
                if (((java.lang.Boolean) x9.getValue()).booleanValue()) {
                    x9.setValue(java.lang.Boolean.FALSE);
                } else {
                    this.f2170n.invoke();
                }
            }
        } else if (((java.lang.Boolean) x9.getValue()).booleanValue()) {
            int iG3 = c1675d1.g() - 1;
            int i3 = iG3 >= 0 ? iG3 : 0;
            if (i3 != c1675d1.g()) {
                c1675d1.h(i3);
                jVar.invoke(((C5.g2) list.get(i3)).f1336a);
            }
        } else {
            int iG4 = c1675d0.g() - 1;
            c1675d0.h(iG4 >= 0 ? iG4 : 0);
        }
        z6 = true;
        return java.lang.Boolean.valueOf(z6);
    }
}
