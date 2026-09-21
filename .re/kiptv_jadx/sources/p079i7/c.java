package p079i7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p110m7.p[] f23215d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i3, p110m7.p[] pVarArr) {
        if (pVarArr == null) {
            throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i9 = 1;
        int length = pVarArr.length - 1;
        if (length != 0) {
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    i9 = 1 + i10;
                }
            }
            throw new java.lang.IllegalStateException("Empty enum: " + pVarArr.getClass());
        }
        super(i3, i9, 1, (byte) 0);
        this.f23215d = pVarArr;
    }

    public final java.lang.Object e(int i3) {
        int i9 = (1 << this.f21112c) - 1;
        int i10 = this.f21111b;
        int i11 = (i3 & (i9 << i10)) >> i10;
        for (p110m7.p pVar : this.f23215d) {
            if (pVar.a() == i11) {
                return pVar;
            }
        }
        return null;
    }
}
