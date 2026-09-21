package com.kiptv.core.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kiptv.core.model.T[], still in use, count: 1, list:
  (r0v1 com.kiptv.core.model.T[]) from 0x004e: INVOKE (r0v1 com.kiptv.core.model.T[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:79)
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
public final class T {
    NEW("badges.new"),
    NEW_MOVIE("badges.newMovie"),
    NEW_SERIES("badges.newSeries"),
    NEW_SEASON("badges.newSeason"),
    NEW_EPISODES("badges.newEpisodes"),
    NEW_EPISODE("badges.newEpisode");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20121h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(tArr);
    }

    public T(java.lang.String str) {
        super(str, i);
        this.f20121h = str;
    }

    public static com.kiptv.core.model.T valueOf(java.lang.String str) {
        return (com.kiptv.core.model.T) java.lang.Enum.valueOf(com.kiptv.core.model.T.class, str);
    }

    public static com.kiptv.core.model.T[] values() {
        return (com.kiptv.core.model.T[]) f20120o.clone();
    }
}
