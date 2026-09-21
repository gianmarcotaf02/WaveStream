package p099l5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l5.b[], still in use, count: 1, list:
  (r0v1 l5.b[]) from 0x0024: INVOKE (r0v1 l5.b[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:37)
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
/* JADX INFO: renamed from: l5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2549b {
    ExoPlayer(androidx.media3.database.DatabaseProvider.TABLE_PREFIX),
    MPV("MPV"),
    VLC("VLC");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f24774m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f24775h;

    static {
        f24774m = com.google.crypto.tink.shaded.protobuf.q0.t(enumC2549bArr);
    }

    public EnumC2549b(java.lang.String str) {
        super(str, i);
        this.f24775h = str;
    }

    public static p099l5.EnumC2549b valueOf(java.lang.String str) {
        return (p099l5.EnumC2549b) java.lang.Enum.valueOf(p099l5.EnumC2549b.class, str);
    }

    public static p099l5.EnumC2549b[] values() {
        return (p099l5.EnumC2549b[]) f24773l.clone();
    }
}
