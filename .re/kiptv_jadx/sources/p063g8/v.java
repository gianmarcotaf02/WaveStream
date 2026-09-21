package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements p063g8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.u f22401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f22403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22404d;

    public v(p063g8.u field, int i3, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(field, "field");
        this.f22401a = field;
        this.f22402b = i3;
        this.f22403c = num;
        int i9 = field.g;
        this.f22404d = i9;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "The minimum number of digits (", ") is negative").toString());
        }
        if (i9 < i3) {
            throw new java.lang.IllegalArgumentException(("The maximum number of digits (" + i9 + ") is less than the minimum number of digits (" + i3 + ')').toString());
        }
        if (num == null || num.intValue() > i3) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i3 + ')').toString());
    }

    @Override // p063g8.j
    public final h8.a a() {
        p063g8.r rVar = this.f22401a.f22395a;
        h8.a aVar = new h8.a();
        int i3 = this.f22402b;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "The minimum number of digits (", ") is negative").toString());
        }
        if (i3 <= 9) {
            return this.f22403c != null ? new h8.a() : aVar;
        }
        throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // p063g8.j
    public final p080i8.p b() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.f22402b);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.f22404d);
        p063g8.u uVar = this.f22401a;
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.S(numValueOf, numValueOf2, this.f22403c, uVar.f22395a, uVar.f22398d, false);
    }

    @Override // p063g8.j
    public final /* bridge */ /* synthetic */ p063g8.a c() {
        return this.f22401a;
    }
}
