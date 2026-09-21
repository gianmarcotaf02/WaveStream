package K0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/r;", "LQ0/X;", "LK0/s;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class r extends Q0.X {
    @Override // Q0.X
    public final p137q0.o e() {
        return new K0.C0670s(K0.w.f6736b, null);
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
        if (!(obj instanceof K0.r)) {
            return false;
        }
        ((K0.r) obj).getClass();
        K0.C0653a c0653a = K0.w.f6736b;
        return c0653a.equals(c0653a);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        K0.C0670s c0670s = (K0.C0670s) oVar;
        K0.C0653a c0653a = K0.w.f6736b;
        if (kotlin.jvm.internal.m.a(c0670s.f6703w, c0653a)) {
            return;
        }
        c0670s.f6703w = c0653a;
        if (c0670s.f6704x) {
            c0670s.P0();
        }
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + (androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED * 31);
    }

    public final java.lang.String toString() {
        return "PointerHoverIconModifierElement(icon=" + K0.w.f6736b + ", overrideDescendants=false)";
    }
}
