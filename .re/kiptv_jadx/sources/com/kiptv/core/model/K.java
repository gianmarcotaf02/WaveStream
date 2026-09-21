package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.K[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.K[]) from 0x0123: INVOKE (r0v1 com.kiptv.core.model.K[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:292)
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
public final class K {
    /* JADX INFO: Fake field, exist only in values array */
    EF11(10759, "ACTION", "genres.action"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(35, "COMEDY", "genres.comedy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(18, "DRAMA", "genres.drama"),
    /* JADX INFO: Fake field, exist only in values array */
    EF53(9648, "THRILLER", "genres.thriller"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67(9648, "HORROR", "genres.horror"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81(10765, "SCI_FI", "genres.sciFi"),
    /* JADX INFO: Fake field, exist only in values array */
    EF95(10759, "ADVENTURE", "genres.adventure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109(10749, "ROMANCE", "genres.romance"),
    /* JADX INFO: Fake field, exist only in values array */
    EF124(16, "ANIMATION", "genres.animation"),
    /* JADX INFO: Fake field, exist only in values array */
    EF139(10765, "FANTASY", "genres.fantasy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF154(80, "CRIME", "genres.crime"),
    /* JADX INFO: Fake field, exist only in values array */
    EF169(10751, "FAMILY", "genres.family"),
    /* JADX INFO: Fake field, exist only in values array */
    EF184(9648, "MYSTERY", "genres.mystery"),
    /* JADX INFO: Fake field, exist only in values array */
    EF199(99, "DOCUMENTARY", "genres.documentary"),
    /* JADX INFO: Fake field, exist only in values array */
    EF214(18, "MUSIC", "genres.music"),
    /* JADX INFO: Fake field, exist only in values array */
    EF231(99, "HISTORY", "genres.history"),
    /* JADX INFO: Fake field, exist only in values array */
    EF246(10768, "WAR", "genres.war"),
    /* JADX INFO: Fake field, exist only in values array */
    EF261(37, "WESTERN", "genres.western");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f19811l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19813i;
    public final java.lang.String j;

    static {
        f19811l = com.google.crypto.tink.shaded.protobuf.q0.t(kArr);
    }

    public K(int i3, java.lang.String str, java.lang.String str2) {
        super(str, i);
        this.f19812h = i;
        this.f19813i = i3;
        this.j = str2;
    }

    public static com.kiptv.core.model.K valueOf(java.lang.String str) {
        return (com.kiptv.core.model.K) java.lang.Enum.valueOf(com.kiptv.core.model.K.class, str);
    }

    public static com.kiptv.core.model.K[] values() {
        return (com.kiptv.core.model.K[]) f19810k.clone();
    }
}
