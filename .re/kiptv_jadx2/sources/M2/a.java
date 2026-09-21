package M2;

import E2.C;
import E2.p;
import M8.A;
import S2.o;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

public final class a {

    public final int f7121a;

    public a(int i3) {
        this.f7121a = i3;
    }

    public final C a(Object obj, o oVar) {
        switch (this.f7121a) {
            case 0:
                return p.j(((Uri) obj).toString());
            case 1:
                return p.a(((File) obj).getPath());
            case 2:
                return p.a(((A) obj).f7208h.r());
            case 3:
                Context context = oVar.f9284a;
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return p.j("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return p.j((String) obj);
        }
    }
}
