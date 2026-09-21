package p199y3;

import B3.C0089b;
import E3.k;
import Z3.d;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import p121o0.p;

public final class n {

    public final int f31879a;

    public final c f31880b;

    public n(c cVar, int i3) {
        this.f31879a = i3;
        this.f31880b = cVar;
    }

    public final void a(k kVar) {
        k kVar2 = (k) kVar;
        switch (this.f31879a) {
            case 0:
                c cVar = this.f31880b;
                cVar.getClass();
                Status status = kVar2.getStatus();
                int i3 = status.f18690h;
                if (i3 != 0) {
                    StringBuilder sbT = p.t(i3, "Error fetching queue item ids, statusCode=", ", statusMessage=");
                    sbT.append(status.f18691i);
                    C0089b c0089b = cVar.f31807a;
                    Log.w(c0089b.f617a, c0089b.d(sbT.toString(), new Object[0]));
                }
                cVar.f31816l = null;
                if (!cVar.f31813h.isEmpty()) {
                    d dVar = cVar.f31814i;
                    o oVar = cVar.j;
                    dVar.removeCallbacks(oVar);
                    dVar.postDelayed(oVar, 500L);
                }
                break;
            default:
                c cVar2 = this.f31880b;
                cVar2.getClass();
                Status status2 = kVar2.getStatus();
                int i9 = status2.f18690h;
                if (i9 != 0) {
                    StringBuilder sbT2 = p.t(i9, "Error fetching queue items, statusCode=", ", statusMessage=");
                    sbT2.append(status2.f18691i);
                    C0089b c0089b2 = cVar2.f31807a;
                    Log.w(c0089b2.f617a, c0089b2.d(sbT2.toString(), new Object[0]));
                }
                cVar2.f31815k = null;
                if (!cVar2.f31813h.isEmpty()) {
                    d dVar2 = cVar2.f31814i;
                    o oVar2 = cVar2.j;
                    dVar2.removeCallbacks(oVar2);
                    dVar2.postDelayed(oVar2, 500L);
                }
                break;
        }
    }
}
