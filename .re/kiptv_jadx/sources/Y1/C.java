package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Y1.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y1.D f11153b;

    public C(Y1.D d4, int i3) {
        this.f11153b = d4;
        this.f11152a = i3;
    }

    @Override // Y1.B
    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        Y1.D d4 = this.f11153b;
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = d4.f11186w;
        int i3 = this.f11152a;
        if (abstractComponentCallbacksC1029n == null || i3 >= 0 || !abstractComponentCallbacksC1029n.l().N()) {
            return d4.O(arrayList, arrayList2, i3, 1);
        }
        return false;
    }
}
