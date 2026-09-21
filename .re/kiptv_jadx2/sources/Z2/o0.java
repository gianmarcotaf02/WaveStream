package Z2;

public abstract class o0 extends Y {
    @Override
    public final void a(AbstractC1185d0 abstractC1185d0) throws D0 {
        if (abstractC1185d0 instanceof n0) {
            this.f12851i.add(abstractC1185d0);
            return;
        }
        throw new D0("Text content elements cannot contain " + abstractC1185d0 + " elements.");
    }
}
