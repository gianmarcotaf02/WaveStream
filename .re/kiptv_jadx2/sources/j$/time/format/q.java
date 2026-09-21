package j$.time.format;

public final class q implements InterfaceC2508e {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;

    public static final q[] f23723a;

    @Override
    public final boolean p(x xVar, StringBuilder sb) {
        return true;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f23723a.clone();
    }

    static {
        q qVar = new q("SENSITIVE", 0);
        SENSITIVE = qVar;
        q qVar2 = new q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        q qVar3 = new q("STRICT", 2);
        STRICT = qVar3;
        q qVar4 = new q("LENIENT", 3);
        LENIENT = qVar4;
        f23723a = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    @Override
    public final int r(v vVar, CharSequence charSequence, int i3) {
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

    @Override
    public final String toString() {
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
        throw new IllegalStateException("Unreachable");
    }
}
