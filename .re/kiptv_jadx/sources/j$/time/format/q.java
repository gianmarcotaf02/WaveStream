package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements j$.time.format.InterfaceC2508e {
    public static final j$.time.format.q INSENSITIVE;
    public static final j$.time.format.q LENIENT;
    public static final j$.time.format.q SENSITIVE;
    public static final j$.time.format.q STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.format.q[] f23723a;

    @Override // j$.time.format.InterfaceC2508e
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        return true;
    }

    public static j$.time.format.q valueOf(java.lang.String str) {
        return (j$.time.format.q) java.lang.Enum.valueOf(j$.time.format.q.class, str);
    }

    public static j$.time.format.q[] values() {
        return (j$.time.format.q[]) f23723a.clone();
    }

    static {
        j$.time.format.q qVar = new j$.time.format.q("SENSITIVE", 0);
        SENSITIVE = qVar;
        j$.time.format.q qVar2 = new j$.time.format.q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        j$.time.format.q qVar3 = new j$.time.format.q("STRICT", 2);
        STRICT = qVar3;
        j$.time.format.q qVar4 = new j$.time.format.q("LENIENT", 3);
        LENIENT = qVar4;
        f23723a = new j$.time.format.q[]{qVar, qVar2, qVar3, qVar4};
    }

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            vVar.f23738b = true;
            return i3;
        }
        if (iOrdinal == 1) {
            vVar.f23738b = false;
            return i3;
        }
        if (iOrdinal == 2) {
            vVar.f23739c = true;
            return i3;
        }
        if (iOrdinal != 3) {
            return i3;
        }
        vVar.f23739c = false;
        return i3;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }
}
