package O0;

/* JADX INFO: renamed from: O0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721j implements O0.InterfaceC0719h {
    @Override // O0.InterfaceC0719h
    public final long a(long j, long j9) {
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(1.0f)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(1.0f)));
        int i3 = O0.m0.f7659a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0.C0721j)) {
            return false;
        }
        ((O0.C0721j) obj).getClass();
        return java.lang.Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(1.0f);
    }

    public final java.lang.String toString() {
        return "FixedScale(value=1.0)";
    }
}
