package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p114n2.H {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Class f25593m;

    public D(java.lang.Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f25593m = cls;
            return;
        }
        throw new java.lang.IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // p114n2.H, p114n2.I
    public final java.lang.String b() {
        return this.f25593m.getName();
    }

    @Override // p114n2.H
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final java.lang.Enum d(java.lang.String str) {
        java.lang.Object obj;
        java.lang.Class cls = this.f25593m;
        java.lang.Object[] enumConstants = cls.getEnumConstants();
        kotlin.jvm.internal.m.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i3];
            if (O7.x.r0(((java.lang.Enum) obj).name(), str, true)) {
                break;
            }
            i3++;
        }
        java.lang.Enum r9 = (java.lang.Enum) obj;
        if (r9 != null) {
            return r9;
        }
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Enum value ", str, " not found for type ");
        sbQ.append(cls.getName());
        sbQ.append('.');
        throw new java.lang.IllegalArgumentException(sbQ.toString());
    }
}
