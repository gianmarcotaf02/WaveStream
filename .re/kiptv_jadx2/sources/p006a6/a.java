package p006a6;

public final class a implements d {

    public d f15410a;

    public static void a(d dVar, d dVar2) {
        a aVar = (a) dVar;
        if (aVar.f15410a != null) {
            throw new IllegalStateException();
        }
        aVar.f15410a = dVar2;
    }

    @Override
    public final Object get() {
        d dVar = this.f15410a;
        if (dVar != null) {
            return dVar.get();
        }
        throw new IllegalStateException();
    }
}
