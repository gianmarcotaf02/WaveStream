package p015b5;

import V4.P;
import android.util.Log;
import com.kiptv.core.local.datastore.LocalProgressEntry;
import com.kiptv.core.model.WatchProgress;
import kotlin.jvm.internal.m;
import p005a5.i9;
import p109m6.a;
import p117n6.c;

public final class D {
    private static final y Companion = new y();

    public final P f17933a;

    public final i9 f17934b;

    public D(P watchProgressDataStore, i9 watchProgressRepository) {
        m.e(watchProgressDataStore, "watchProgressDataStore");
        m.e(watchProgressRepository, "watchProgressRepository");
        this.f17933a = watchProgressDataStore;
        this.f17934b = watchProgressRepository;
    }

    public final Object a(LocalProgressEntry localProgressEntry, c cVar) {
        B b9;
        if (cVar instanceof B) {
            b9 = (B) cVar;
            int i3 = b9.f17923k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f17923k = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new B(this, cVar);
            }
        } else {
            b9 = new B(this, cVar);
        }
        B b10 = b9;
        Object objL = b10.f17922i;
        a aVar = a.f25430h;
        int i9 = b10.f17923k;
        WatchProgress watchProgress = null;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objL);
                if (localProgressEntry.f19652d <= 0 && !localProgressEntry.f19657k) {
                    return null;
                }
                i9 i9Var = this.f17934b;
                String str = localProgressEntry.f19649a;
                Integer num = localProgressEntry.g;
                Integer num2 = localProgressEntry.f19655h;
                String str2 = localProgressEntry.f19654f;
                b10.f17921h = localProgressEntry;
                b10.f17923k = 1;
                objL = i9Var.l(num, num2, str, str2, b10);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localProgressEntry = b10.f17921h;
                com.google.common.util.concurrent.P.u0(objL);
            }
            watchProgress = (WatchProgress) objL;
        } catch (Exception e6) {
            Log.d("WatchProgressMigration", "Remote lookup failed for " + localProgressEntry.f19649a + ": " + e6.getMessage());
        }
        if (watchProgress == null) {
            return new z(localProgressEntry.f19652d, localProgressEntry.f19653e, localProgressEntry.f19657k, false);
        }
        int i10 = localProgressEntry.f19652d;
        int i11 = watchProgress.j;
        return new z(Math.max(i10, i11), Math.max(localProgressEntry.f19653e, watchProgress.f20618k), localProgressEntry.f19657k || watchProgress.f20620m, !(i10 >= i11));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p117n6.c r34) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b5.D.b(n6.c):java.lang.Object");
    }
}
