package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.H[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.H[]) from 0x0020: INVOKE (r0v1 com.kiptv.core.model.H[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:33)
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
public final class H {
    j("week", "home.params.thisWeek"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23("day", "home.params.today");

    public static final com.kiptv.core.model.G Companion = new com.kiptv.core.model.G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f19787l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f19789i;

    static {
        f19787l = com.google.crypto.tink.shaded.protobuf.q0.t(new com.kiptv.core.model.H[]{r0, new com.kiptv.core.model.H("day", "home.params.today")});
    }

    public H(java.lang.String str, java.lang.String str2) {
        super(str, i);
        this.f19788h = str;
        this.f19789i = str2;
    }

    public static com.kiptv.core.model.H valueOf(java.lang.String str) {
        return (com.kiptv.core.model.H) java.lang.Enum.valueOf(com.kiptv.core.model.H.class, str);
    }

    public static com.kiptv.core.model.H[] values() {
        return (com.kiptv.core.model.H[]) f19786k.clone();
    }
}
