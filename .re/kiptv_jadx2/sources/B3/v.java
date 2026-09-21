package B3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.cast.S;
import org.videolan.libvlc.MediaPlayer;

public final class v extends N3.a {

    public final int f672m;

    public v(int i3) {
        this.f672m = i3;
    }

    @Override
    public E3.c l(Context context, Looper looper, p179v4.o oVar, Object obj, E3.g gVar, E3.h hVar) {
        switch (this.f672m) {
            case 0:
                return new y(context, looper, 161, oVar, gVar, hVar);
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                return super.l(context, looper, oVar, obj, gVar, hVar);
            case 5:
                return new p014b4.D(context, looper, 148, oVar, gVar, hVar);
            case 6:
                return new S(context, looper, oVar, (F3.s) gVar, (F3.s) hVar);
            case 7:
                oVar.getClass();
                Integer num = (Integer) oVar.f29180i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new p051f4.a(context, looper, oVar, bundle, gVar, hVar);
            case 8:
                throw p121o0.p.i(obj);
            case 9:
                return new X3.i(context, looper, oVar, (p139q3.b) obj, (F3.s) gVar, (F3.s) hVar);
            case 10:
                return new p166t3.e(context, looper, oVar, (GoogleSignInOptions) obj, (F3.s) gVar, (F3.s) hVar);
            case 11:
                p184w3.e eVar = (p184w3.e) obj;
                H3.q.h(eVar, "Setting the API options is required.");
                return new D(context, looper, oVar, eVar.f29847h, 0, eVar.j, eVar.f29849k, (F3.s) gVar, (F3.s) hVar);
            case 12:
                p184w3.e eVar2 = (p184w3.e) obj;
                H3.q.h(eVar2, "Setting the API options is required.");
                return new C(context, looper, oVar, eVar2.f29847h, 0, eVar2.f29848i, eVar2.j, (F3.s) gVar, (F3.s) hVar);
        }
    }

    @Override
    public E3.c m(Context context, Looper looper, p179v4.o oVar, Object obj, F3.s sVar, F3.s sVar2) {
        switch (this.f672m) {
            case 1:
                return new J3.c(context, looper, oVar, (H3.j) obj, sVar, sVar2);
            case 2:
                return new X3.k(context, looper, oVar, sVar, sVar2);
            case 3:
                return new X3.d(context, looper, oVar, sVar, sVar2);
            case 4:
                return new Y3.d(context, looper, MediaPlayer.Event.Opening, oVar, sVar, sVar2);
            default:
                return super.m(context, looper, oVar, obj, sVar, sVar2);
        }
    }
}
