package p100l6;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import kotlin.jvm.internal.m;

public abstract class a implements f {
    private final g key;

    public a(g key) {
        m.e(key, "key");
        this.key = key;
    }

    @Override
    public <R> R fold(R r9, p194x6.m mVar) {
        return (R) AbstractC1833d1.s(this, r9, mVar);
    }

    @Override
    public <E extends f> E get(g gVar) {
        return (E) AbstractC1833d1.t(this, gVar);
    }

    @Override
    public g getKey() {
        return this.key;
    }

    @Override
    public h minusKey(g gVar) {
        return AbstractC1833d1.G(this, gVar);
    }

    @Override
    public h plus(h hVar) {
        return AbstractC1833d1.H(this, hVar);
    }
}
