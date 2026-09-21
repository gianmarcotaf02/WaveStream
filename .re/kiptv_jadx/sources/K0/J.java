package K0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/J;", "LQ0/X;", "LK0/K;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class J extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q0.C0778l f6657b;

    public J(Q0.C0778l c0778l) {
        this.f6657b = c0778l;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new K0.K(J.AbstractC0549n.f5849c, this.f6657b);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.J)) {
            return false;
        }
        K0.J j = (K0.J) obj;
        j.getClass();
        K0.C0653a c0653a = J.AbstractC0549n.f5849c;
        return c0653a.equals(c0653a) && kotlin.jvm.internal.m.a(this.f6657b, j.f6657b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        K0.K k9 = (K0.K) oVar;
        K0.C0653a c0653a = J.AbstractC0549n.f5849c;
        if (!kotlin.jvm.internal.m.a(k9.f6703w, c0653a)) {
            k9.f6703w = c0653a;
            if (k9.f6704x) {
                k9.P0();
            }
        }
        k9.f6702v = this.f6657b;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED * 31, 31, false);
        Q0.C0778l c0778l = this.f6657b;
        return iF + (c0778l != null ? c0778l.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "StylusHoverIconModifierElement(icon=" + J.AbstractC0549n.f5849c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f6657b + ')';
    }
}
