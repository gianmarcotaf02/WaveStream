package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends V7.a0 implements V7.l0 {
    @Override // V7.l0
    public final java.lang.Object getValue() {
        java.lang.Integer numValueOf;
        synchronized (this) {
            java.lang.Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            numValueOf = java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((this.f10436p + ((long) ((int) ((m() + ((long) this.f10438r)) - this.f10436p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i3) {
        synchronized (this) {
            java.lang.Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            o(java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((this.f10436p + ((long) ((int) ((m() + ((long) this.f10438r)) - this.f10436p)))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
