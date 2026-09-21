package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends p080i8.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f23291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f23292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p080i8.a f23293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23294f;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(java.lang.Integer num, java.lang.Integer num2, p080i8.a setter, java.lang.String name, boolean z6) {
        kotlin.jvm.internal.m.e(setter, "setter");
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.Integer num3 = num.equals(num2) ? num : null;
        super(name, num3);
        this.f23291c = num;
        this.f23292d = num2;
        this.f23293e = setter;
        this.f23294f = z6;
        if (num3 == null || new D6.g(1, 9, 1).d(num3.intValue())) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid length for field " + name + ": " + num3).toString());
    }

    @Override // p080i8.d
    public final p080i8.f a(p080i8.c cVar, java.lang.String str, int i3, int i9) {
        java.lang.Integer numValueOf;
        java.lang.Integer num = this.f23292d;
        if (num != null && i9 - i3 > num.intValue()) {
            return new B3.z(num.intValue(), 6);
        }
        java.lang.Integer num2 = this.f23291c;
        if (num2 != null && i9 - i3 < num2.intValue()) {
            return new B3.z(num2.intValue(), 5);
        }
        int iCharAt = 0;
        while (true) {
            if (i3 >= i9) {
                numValueOf = java.lang.Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i3) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i3++;
        }
        if (numValueOf == null) {
            return p080i8.e.f23259h;
        }
        boolean z6 = this.f23294f;
        int iIntValue = numValueOf.intValue();
        if (z6) {
            iIntValue = -iIntValue;
        }
        java.lang.Object objR = this.f23293e.r(cVar, java.lang.Integer.valueOf(iIntValue));
        if (objR == null) {
            return null;
        }
        return new U0.a(objR);
    }
}
