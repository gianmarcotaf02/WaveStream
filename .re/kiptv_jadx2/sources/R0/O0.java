package R0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import p136q.AbstractC2668l;

public final class O0 {

    public final SemanticsConfiguration f8837a;

    public final p136q.x f8838b;

    public O0(Y0.p pVar, AbstractC2668l abstractC2668l) {
        this.f8837a = pVar.f11094d;
        this.f8838b = new p136q.x(Y0.p.j(4, pVar).size());
        List listJ = Y0.p.j(4, pVar);
        int size = listJ.size();
        for (int i3 = 0; i3 < size; i3++) {
            Y0.p pVar2 = (Y0.p) listJ.get(i3);
            if (abstractC2668l.a(pVar2.g)) {
                this.f8838b.a(pVar2.g);
            }
        }
    }
}
