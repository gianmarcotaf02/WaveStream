package D2;

import D1.AbstractC0220e0;
import com.google.common.util.concurrent.P;
import java.util.List;

public class h extends AbstractC0220e0 {
    public static final g j;

    public final String f2086i;

    static {
        List listI0 = P.i0(new f());
        d dVar = new d();
        dVar.f2083a = a.f2081a;
        dVar.f2084b = listI0;
        j = new g(dVar, "");
    }

    public h(d dVar, String str) {
        super(dVar);
        this.f2086i = str;
    }

    public String E0() {
        return this.f2086i;
    }
}
