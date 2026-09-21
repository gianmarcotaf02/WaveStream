package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends Z2.AbstractC1181b0 implements Z2.Z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f12636h = new java.util.ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f12637i;
    public android.graphics.Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f12639l;

    @Override // Z2.Z
    public final void a(Z2.AbstractC1185d0 abstractC1185d0) throws Z2.D0 {
        if (abstractC1185d0 instanceof Z2.U) {
            this.f12636h.add(abstractC1185d0);
            return;
        }
        throw new Z2.D0("Gradient elements cannot contain " + abstractC1185d0 + " elements.");
    }

    @Override // Z2.Z
    public final java.util.List b() {
        return this.f12636h;
    }
}
