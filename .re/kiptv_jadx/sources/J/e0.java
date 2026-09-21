package J;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 J.e0[], still in use, count: 1, list:
  (r0v1 J.e0[]) from 0x0062: INVOKE (r0v1 J.e0[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:99)
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
public final class e0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(M.e.f7112a, android.R.string.cut, android.R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(M.e.f7113b, android.R.string.copy, android.R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(M.e.f7114c, android.R.string.paste, android.R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(M.e.f7115d, android.R.string.selectAll, android.R.attr.actionModeSelectAllDrawable),
    Autofill(M.e.f7116e, android.os.Build.VERSION.SDK_INT <= 26 ? com.kiptv.tv.R.string.androidx_compose_foundation_autofill : android.R.string.autofill, 0);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f5766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5767i;
    public final int j;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(e0VarArr);
    }

    public e0(java.lang.Object obj, int i3, int i9) {
        super(str, i);
        this.f5766h = obj;
        this.f5767i = i3;
        this.j = i9;
    }

    public static J.e0 valueOf(java.lang.String str) {
        return (J.e0) java.lang.Enum.valueOf(J.e0.class, str);
    }

    public static J.e0[] values() {
        return (J.e0[]) f5765l.clone();
    }
}
