package v;

public final class Y implements p188x0.O {

    public static final Y f28909b = new Y(0);

    public static final Y f28910c = new Y(1);

    public final int f28911a;

    public Y(int i3) {
        this.f28911a = i3;
    }

    @Override
    public final p188x0.z a(long j, p113n1.n nVar, p113n1.c cVar) {
        switch (this.f28911a) {
            case 0:
                float fK0 = cVar.k0(H.f28851a);
                return new p188x0.G(new p181w0.b(0.0f, -fK0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fK0));
            default:
                float fK1 = cVar.k0(H.f28851a);
                return new p188x0.G(new p181w0.b(-fK1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fK1, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
