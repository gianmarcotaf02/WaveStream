package p105m2;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.session.i;
import java.util.Objects;
import p007a7.z;
import p008a8.c;

public abstract class AbstractC2622u {

    public final Context f25363h;

    public final c f25364i;
    public final i j = new i(this);

    public C2604b f25365k;

    public C2618p f25366l;

    public boolean f25367m;

    public z f25368n;

    public boolean f25369o;

    public AbstractC2622u(Context context, c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f25363h = context;
        if (cVar != null) {
            this.f25364i = cVar;
        } else {
            this.f25364i = new c(14, new ComponentName(context, getClass()));
        }
    }

    public AbstractC2620s c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract AbstractC2621t d(String str);

    public AbstractC2621t e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(C2618p c2618p);

    public final void g(z zVar) {
        C.b();
        if (this.f25368n != zVar) {
            this.f25368n = zVar;
            if (this.f25369o) {
                return;
            }
            this.f25369o = true;
            this.j.sendEmptyMessage(1);
        }
    }

    public final void h(C2618p c2618p) {
        C.b();
        if (Objects.equals(this.f25366l, c2618p)) {
            return;
        }
        this.f25366l = c2618p;
        if (this.f25367m) {
            return;
        }
        this.f25367m = true;
        this.j.sendEmptyMessage(2);
    }
}
