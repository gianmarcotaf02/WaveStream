package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.F[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.F[]) from 0x002a: INVOKE (r0v1 com.kiptv.core.model.F[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:43)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class F {
    RECOMMENDATIONS("recommendations"),
    WATCHLIST("watchlist"),
    LIST("list");

    public static final com.kiptv.core.model.E Companion = new com.kiptv.core.model.E();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f19765m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19766h;

    static {
        f19765m = com.google.crypto.tink.shaded.protobuf.q0.t(new com.kiptv.core.model.F[]{r0, r1, r2});
    }

    public F(java.lang.String str) {
        super(str, i);
        this.f19766h = str;
    }

    public static com.kiptv.core.model.F valueOf(java.lang.String str) {
        return (com.kiptv.core.model.F) java.lang.Enum.valueOf(com.kiptv.core.model.F.class, str);
    }

    public static com.kiptv.core.model.F[] values() {
        return (com.kiptv.core.model.F[]) f19764l.clone();
    }
}
