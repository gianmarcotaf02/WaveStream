package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.z[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.z[]) from 0x0030: INVOKE (r0v1 com.kiptv.core.model.z[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:49)
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
/* JADX INFO: renamed from: com.kiptv.core.model.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1965z {
    j("both", "home.params.both"),
    f20878k("myList", "myList.title"),
    f20879l("recent", "livetv.recentlyWatched");

    public static final com.kiptv.core.model.C1964y Companion = new com.kiptv.core.model.C1964y();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f20881n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20883i;

    static {
        f20881n = com.google.crypto.tink.shaded.protobuf.q0.t(new com.kiptv.core.model.EnumC1965z[]{r0, r1, r2});
    }

    public EnumC1965z(java.lang.String str, java.lang.String str2) {
        super(str, i);
        this.f20882h = str;
        this.f20883i = str2;
    }

    public static com.kiptv.core.model.EnumC1965z valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1965z) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1965z.class, str);
    }

    public static com.kiptv.core.model.EnumC1965z[] values() {
        return (com.kiptv.core.model.EnumC1965z[]) f20880m.clone();
    }
}
