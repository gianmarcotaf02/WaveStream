package Z2;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

public abstract class A extends AbstractC1181b0 implements Z {

    public ArrayList f12636h = new ArrayList();

    public Boolean f12637i;
    public Matrix j;

    public int f12638k;

    public String f12639l;

    @Override
    public final void a(AbstractC1185d0 abstractC1185d0) throws D0 {
        if (abstractC1185d0 instanceof U) {
            this.f12636h.add(abstractC1185d0);
            return;
        }
        throw new D0("Gradient elements cannot contain " + abstractC1185d0 + " elements.");
    }

    @Override
    public final List b() {
        return this.f12636h;
    }
}
