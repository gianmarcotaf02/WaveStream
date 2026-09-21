package p060g5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 g5.e[], still in use, count: 1, list:
  (r1v2 g5.e[]) from 0x00fa: INVOKE (r1v2 g5.e[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:251)
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
public final class e {
    /* JADX INFO: Fake field, exist only in values array */
    RED("red", 4289527817L, 4286383114L),
    /* JADX INFO: Fake field, exist only in values array */
    GOLD("gold", 4292124695L, 4288311314L),
    /* JADX INFO: Fake field, exist only in values array */
    SILVER("silver", 4288455599L, 4285231744L),
    /* JADX INFO: Fake field, exist only in values array */
    WHITE("white", 4294967295L, 4292138196L),
    /* JADX INFO: Fake field, exist only in values array */
    BROWN("brown", 4285218591L, 4283050258L),
    /* JADX INFO: Fake field, exist only in values array */
    FUCHSIA("fuchsia", 4290782931L, 4286978447L),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN("green", 4279599165L, 4279062824L),
    /* JADX INFO: Fake field, exist only in values array */
    INDIGO("indigo", 4282595530L, 4281413249L),
    /* JADX INFO: Fake field, exist only in values array */
    LIME("lime", 4284850957L, 4283268111L),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE("orange", 4293548044L, 4288690694L),
    /* JADX INFO: Fake field, exist only in values array */
    PURPLE("purple", 4286456526L, 4283964551L),
    /* JADX INFO: Fake field, exist only in values array */
    TEAL("teal", 4279080072L, 4279203438L);

    public static final p060g5.d Companion = new p060g5.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p060g5.e f21882k = new p060g5.e("red", 4289527817L, 4286383114L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f21884m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f21885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21886i;
    public final long j;

    static {
        f21884m = com.google.crypto.tink.shaded.protobuf.q0.t(new p060g5.e[]{r0, new p060g5.e("gold", 4292124695L, 4288311314L), new p060g5.e("silver", 4288455599L, 4285231744L), new p060g5.e("white", 4294967295L, 4292138196L), new p060g5.e("brown", 4285218591L, 4283050258L), new p060g5.e("fuchsia", 4290782931L, 4286978447L), new p060g5.e("green", 4279599165L, 4279062824L), new p060g5.e("indigo", 4282595530L, 4281413249L), new p060g5.e("lime", 4284850957L, 4283268111L), new p060g5.e("orange", 4293548044L, 4288690694L), new p060g5.e("purple", 4286456526L, 4283964551L), new p060g5.e("teal", 4279080072L, 4279203438L)});
    }

    public e(java.lang.String str, long j, long j9) {
        super(str, i);
        this.f21885h = str;
        this.f21886i = j;
        this.j = j9;
    }

    public static p060g5.e valueOf(java.lang.String str) {
        return (p060g5.e) java.lang.Enum.valueOf(p060g5.e.class, str);
    }

    public static p060g5.e[] values() {
        return (p060g5.e[]) f21883l.clone();
    }

    public final long a() {
        if (b()) {
            return p188x0.z.d(4278848010L);
        }
        int i3 = p188x0.C3098s.f31128h;
        return p188x0.C3098s.f31124c;
    }

    public final boolean b() {
        long j = this.f21886i;
        return ((((double) (j & 255)) / 255.0d) * 0.114d) + (((((double) ((j >> 8) & 255)) / 255.0d) * 0.587d) + ((((double) ((j >> 16) & 255)) / 255.0d) * 0.299d)) > 0.7d;
    }
}
