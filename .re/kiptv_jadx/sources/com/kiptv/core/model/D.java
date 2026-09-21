package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 com.kiptv.core.model.D[], still in use, count: 1, list:
  (r1v2 com.kiptv.core.model.D[]) from 0x0062: INVOKE (r1v2 com.kiptv.core.model.D[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:99)
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
public final class D {
    f19714l("rank", "home.trakt.sort.listOrder", "asc"),
    f19715m("added", "home.trakt.sort.added", "desc"),
    f19716n("released", "home.trakt.sort.released", "desc"),
    f19717o(io.ktor.http.LinkHeader.Parameters.Title, "home.trakt.sort.title", "asc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF75("percentage", "home.trakt.sort.rating", "desc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF89("popularity", "home.trakt.sort.popularity", "desc");

    public static final com.kiptv.core.model.C Companion;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.kiptv.core.model.D f19713k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f19719q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f19721i;
    public final java.lang.String j;

    static {
        com.kiptv.core.model.D d4 = f19714l;
        f19719q = com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
        Companion = new com.kiptv.core.model.C();
        f19713k = d4;
    }

    public D(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str, i);
        this.f19720h = str;
        this.f19721i = str2;
        this.j = str3;
    }

    public static com.kiptv.core.model.D valueOf(java.lang.String str) {
        return (com.kiptv.core.model.D) java.lang.Enum.valueOf(com.kiptv.core.model.D.class, str);
    }

    public static com.kiptv.core.model.D[] values() {
        return (com.kiptv.core.model.D[]) f19718p.clone();
    }
}
