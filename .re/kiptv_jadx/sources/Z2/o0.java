package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends Z2.Y {
    @Override // Z2.Y, Z2.Z
    public final void a(Z2.AbstractC1185d0 abstractC1185d0) throws Z2.D0 {
        if (abstractC1185d0 instanceof Z2.n0) {
            this.f12851i.add(abstractC1185d0);
            return;
        }
        throw new Z2.D0("Text content elements cannot contain " + abstractC1185d0 + " elements.");
    }
}
