package androidx.lifecycle;

public final class B implements Runnable {

    public final F f16272h;

    public B(F f9) {
        this.f16272h = f9;
    }

    @Override
    public final void run() {
        Object obj;
        synchronized (this.f16272h.f16279a) {
            obj = this.f16272h.f16284f;
            this.f16272h.f16284f = F.f16278k;
        }
        this.f16272h.i(obj);
    }
}
