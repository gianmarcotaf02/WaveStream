package G4;

public final class a implements d {

    public final int f3787a;

    public a(int i3) {
        this.f3787a = i3;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f3787a != aVar.f3787a) {
            return false;
        }
        Object obj2 = c.f3789h;
        aVar.getClass();
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (14552422 ^ this.f3787a) + (c.f3789h.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3787a + "intEncoding=" + c.f3789h + ')';
    }
}
