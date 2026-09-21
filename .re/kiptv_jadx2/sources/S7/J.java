package S7;

public final class J extends Exception {

    public final Throwable f9547h;

    public J(Throwable th, AbstractC0906w abstractC0906w, p100l6.h hVar) {
        super("Coroutine dispatcher " + abstractC0906w + " threw an exception, context = " + hVar, th);
        this.f9547h = th;
    }

    @Override
    public final Throwable getCause() {
        return this.f9547h;
    }
}
