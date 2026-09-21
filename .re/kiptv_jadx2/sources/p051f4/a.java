package p051f4;

import E3.c;
import E3.g;
import E3.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p179v4.o;

public final class a extends com.google.android.gms.common.internal.a implements c {

    public final boolean f21699G;
    public final o H;

    public final Bundle f21700I;

    public final Integer f21701J;

    public a(Context context, Looper looper, o oVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, oVar, gVar, hVar);
        this.f21699G = true;
        this.H = oVar;
        this.f21700I = bundle;
        this.f21701J = (Integer) oVar.f29180i;
    }

    @Override
    public final int h() {
        return 12451000;
    }

    @Override
    public final boolean k() {
        return this.f21699G;
    }

    @Override
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override
    public final Bundle o() {
        o oVar = this.H;
        boolean zEquals = this.j.getPackageName().equals((String) oVar.f29179h);
        Bundle bundle = this.f21700I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oVar.f29179h);
        }
        return bundle;
    }

    @Override
    public final String q() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String r() {
        return "com.google.android.gms.signin.service.START";
    }
}
