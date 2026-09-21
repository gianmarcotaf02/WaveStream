package p100l6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements p100l6.f {
    private final p100l6.g key;

    public a(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        this.key = key;
    }

    @Override // p100l6.h
    public <R> R fold(R r9, p194x6.m mVar) {
        return (R) com.google.android.gms.internal.play_billing.AbstractC1833d1.s(this, r9, mVar);
    }

    @Override // p100l6.h
    public <E extends p100l6.f> E get(p100l6.g gVar) {
        return (E) com.google.android.gms.internal.play_billing.AbstractC1833d1.t(this, gVar);
    }

    @Override // p100l6.f
    public p100l6.g getKey() {
        return this.key;
    }

    @Override // p100l6.h
    public p100l6.h minusKey(p100l6.g gVar) {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.G(this, gVar);
    }

    @Override // p100l6.h
    public p100l6.h plus(p100l6.h hVar) {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.H(this, hVar);
    }
}
