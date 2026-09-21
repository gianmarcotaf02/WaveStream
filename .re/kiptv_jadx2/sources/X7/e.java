package X7;

public final class e extends RuntimeException {

    public final transient p100l6.h f10908h;

    public e(p100l6.h hVar) {
        this.f10908h = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return String.valueOf(this.f10908h);
    }
}
