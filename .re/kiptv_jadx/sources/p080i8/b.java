package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p080i8.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23255c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f23256d;

    public b(java.lang.String str) {
        super("the predefined string ".concat(str), java.lang.Integer.valueOf(str.length()));
        this.f23256d = str;
    }

    @Override // p080i8.d
    public final p080i8.f a(p080i8.c cVar, java.lang.String str, int i3, int i9) {
        switch (this.f23255c) {
            case 0:
                java.lang.String string = str.subSequence(i3, i9).toString();
                java.lang.String str2 = (java.lang.String) this.f23256d;
                if (kotlin.jvm.internal.m.a(string, str2)) {
                    return null;
                }
                return new N6.A(str2);
            default:
                int i10 = i9 - i3;
                if (i10 < 1) {
                    return new B3.z(1, 5);
                }
                if (i10 > 9) {
                    return new B3.z(9, 6);
                }
                int iCharAt = 0;
                while (i3 < i9) {
                    iCharAt = (iCharAt * 10) + (str.charAt(i3) - '0');
                    i3++;
                }
                java.lang.Object objR = ((p063g8.r) this.f23256d).r(cVar, new p055f8.a(iCharAt, i10));
                if (objR == null) {
                    return null;
                }
                return new U0.a(objR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p063g8.r setter, java.lang.String name) {
        super(name, null);
        kotlin.jvm.internal.m.e(setter, "setter");
        kotlin.jvm.internal.m.e(name, "name");
        this.f23256d = setter;
    }
}
