package K;

import J5.t2;
import M.d;
import M.f;
import M.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p011b1.L;
import p070h6.A;
import p136q.D;
import p194x6.j;

public abstract class b {

    public static final t2 f6637a = new t2(1);

    public static final a f6638b = new a(0);

    public static final void a(L.a aVar, Context context, final boolean z6, final String str, final long j) {
        L.a aVar2 = aVar;
        if (L.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f6637a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        f fVar = f.f7117b;
        aVar2.f7037a.a(fVar);
        int size = list.size();
        int i3 = 0;
        while (true) {
            D d4 = aVar2.f7037a;
            if (i3 >= size) {
                d4.a(fVar);
                return;
            }
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i3);
            d4.a(new d(new M.a(i3), resolveInfo.loadLabel(packageManager).toString(), 0, new j() {
                @Override
                public final Object invoke(Object obj) {
                    a aVar3 = b.f6638b;
                    Boolean boolValueOf = Boolean.valueOf(z6);
                    L l2 = new L(j);
                    aVar3.invoke(context2, resolveInfo, boolValueOf, str, l2);
                    ((g) obj).close();
                    return A.f22523a;
                }
            }));
            i3++;
            aVar2 = aVar;
            context2 = context;
        }
    }
}
