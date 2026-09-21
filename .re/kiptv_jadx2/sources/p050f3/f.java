package p050f3;

import S2.a;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

public final class f {

    public final a f21693a;

    public final d f21694b;

    public final HashMap f21695c;

    public f(Context context, d dVar) {
        a aVar = new a(context);
        this.f21695c = new HashMap();
        this.f21693a = aVar;
        this.f21694b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f21695c.containsKey(str)) {
            return (h) this.f21695c.get(str);
        }
        CctBackendFactory cctBackendFactoryC = this.f21693a.C(str);
        if (cctBackendFactoryC == null) {
            return null;
        }
        d dVar = this.f21694b;
        h hVarCreate = cctBackendFactoryC.create(new b(dVar.f21688a, dVar.f21689b, dVar.f21690c, str));
        this.f21695c.put(str, hVarCreate);
        return hVarCreate;
    }
}
