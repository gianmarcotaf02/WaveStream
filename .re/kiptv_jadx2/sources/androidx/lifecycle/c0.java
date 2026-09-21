package androidx.lifecycle;

public final class c0 implements Runnable {

    public final C1542y f16342h;

    public final EnumC1532n f16343i;
    public boolean j;

    public c0(C1542y registry, EnumC1532n event) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(event, "event");
        this.f16342h = registry;
        this.f16343i = event;
    }

    @Override
    public final void run() {
        if (this.j) {
            return;
        }
        this.f16342h.e(this.f16343i);
        this.j = true;
    }
}
