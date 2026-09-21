package P7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 P7.d[], still in use, count: 1, list:
  (r0v1 P7.d[]) from 0x0058: INVOKE (r0v1 P7.d[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:89)
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
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    NANOSECONDS(java.util.concurrent.TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(java.util.concurrent.TimeUnit.MICROSECONDS),
    MILLISECONDS(java.util.concurrent.TimeUnit.MILLISECONDS),
    SECONDS(java.util.concurrent.TimeUnit.SECONDS),
    MINUTES(java.util.concurrent.TimeUnit.MINUTES),
    HOURS(java.util.concurrent.TimeUnit.HOURS),
    DAYS(java.util.concurrent.TimeUnit.DAYS);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f8178h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(dVarArr);
    }

    public d(java.util.concurrent.TimeUnit timeUnit) {
        super(str, i);
        this.f8178h = timeUnit;
    }

    public static P7.d valueOf(java.lang.String str) {
        return (P7.d) java.lang.Enum.valueOf(P7.d.class, str);
    }

    public static P7.d[] values() {
        return (P7.d[]) f8177o.clone();
    }
}
