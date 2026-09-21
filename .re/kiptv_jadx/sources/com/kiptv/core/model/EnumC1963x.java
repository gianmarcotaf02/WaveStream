package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.x[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.x[]) from 0x002c: INVOKE (r0v1 com.kiptv.core.model.x[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:45)
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
/* JADX INFO: renamed from: com.kiptv.core.model.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1963x {
    j("both", "home.params.both"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23("movies", "movies.title"),
    /* JADX INFO: Fake field, exist only in values array */
    EF35("series", "series.title");

    public static final com.kiptv.core.model.C1962w Companion = new com.kiptv.core.model.C1962w();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f20860l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20862i;

    static {
        f20860l = com.google.crypto.tink.shaded.protobuf.q0.t(new com.kiptv.core.model.EnumC1963x[]{r0, new com.kiptv.core.model.EnumC1963x("movies", "movies.title"), new com.kiptv.core.model.EnumC1963x("series", "series.title")});
    }

    public EnumC1963x(java.lang.String str, java.lang.String str2) {
        super(str, i);
        this.f20861h = str;
        this.f20862i = str2;
    }

    public static com.kiptv.core.model.EnumC1963x valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1963x) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1963x.class, str);
    }

    public static com.kiptv.core.model.EnumC1963x[] values() {
        return (com.kiptv.core.model.EnumC1963x[]) f20859k.clone();
    }
}
