package Y4;

public final class A2 extends E2 {

    public final String f11539h;

    public A2(String str) {
        super(str);
        this.f11539h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A2) && kotlin.jvm.internal.m.a(this.f11539h, ((A2) obj).f11539h);
    }

    @Override
    public final String getMessage() {
        return this.f11539h;
    }

    public final int hashCode() {
        return this.f11539h.hashCode();
    }

    @Override
    public final String toString() {
        return Y6.f.m(new StringBuilder("NetworkError(message="), this.f11539h, ")");
    }
}
