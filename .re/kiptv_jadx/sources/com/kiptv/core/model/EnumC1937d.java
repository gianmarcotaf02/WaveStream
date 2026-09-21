package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.d[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.d[]) from 0x002a: INVOKE (r0v1 com.kiptv.core.model.d[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:43)
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
/* JADX INFO: renamed from: com.kiptv.core.model.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1937d {
    MOVIES("movies.title"),
    SERIES("series.title"),
    LIVE("livetv.title");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f20747m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20748h;

    static {
        f20747m = com.google.crypto.tink.shaded.protobuf.q0.t(enumC1937dArr);
    }

    public EnumC1937d(java.lang.String str) {
        super(str, i);
        this.f20748h = str;
    }

    public static com.kiptv.core.model.EnumC1937d valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1937d) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1937d.class, str);
    }

    public static com.kiptv.core.model.EnumC1937d[] values() {
        return (com.kiptv.core.model.EnumC1937d[]) f20746l.clone();
    }
}
