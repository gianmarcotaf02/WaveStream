package H3;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

public final class t extends Z3.d {

    public final com.google.android.gms.common.internal.a f4005b;

    public t(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        Objects.requireNonNull(aVar);
        this.f4005b = aVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        o oVar;
        com.google.android.gms.common.internal.a aVar = this.f4005b;
        if (aVar.f18711D.get() != message.arg1) {
            int i3 = message.what;
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (oVar = (o) message.obj) != null) {
                synchronized (oVar) {
                    oVar.f3993a = null;
                }
                com.google.android.gms.common.internal.a aVar2 = oVar.f3995c;
                synchronized (aVar2.f18723s) {
                    aVar2.f18723s.remove(oVar);
                }
                return;
            }
            return;
        }
        int i9 = message.what;
        if ((i9 == 1 || i9 == 7 || i9 == 4 || i9 == 5) && !aVar.d()) {
            o oVar2 = (o) message.obj;
            if (oVar2 != null) {
                synchronized (oVar2) {
                    oVar2.f3993a = null;
                }
                com.google.android.gms.common.internal.a aVar3 = oVar2.f3995c;
                synchronized (aVar3.f18723s) {
                    aVar3.f18723s.remove(oVar2);
                }
                return;
            }
            return;
        }
        int i10 = message.what;
        if (i10 == 4) {
            aVar.f18708A = new D3.b(message.arg2, null, null);
            if (!aVar.f18709B && !TextUtils.isEmpty(aVar.q()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.q());
                    if (!aVar.f18709B) {
                        aVar.x(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            D3.b bVar = aVar.f18708A;
            if (bVar == null) {
                bVar = new D3.b(8, null, null);
            }
            aVar.f18721q.a(bVar);
            aVar.t(bVar);
            return;
        }
        if (i10 == 5) {
            D3.b bVar2 = aVar.f18708A;
            if (bVar2 == null) {
                bVar2 = new D3.b(8, null, null);
            }
            aVar.f18721q.a(bVar2);
            aVar.t(bVar2);
            return;
        }
        if (i10 == 3) {
            Object obj = message.obj;
            D3.b bVar3 = new D3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            aVar.f18721q.a(bVar3);
            aVar.t(bVar3);
            return;
        }
        if (i10 == 6) {
            aVar.x(5, null);
            g gVar = aVar.f18726v;
            if (gVar != null) {
                ((E3.g) gVar.f3974a).J(message.arg2);
            }
            System.currentTimeMillis();
            aVar.w(5, 1, null);
            return;
        }
        if (i10 == 2 && !aVar.isConnected()) {
            o oVar3 = (o) message.obj;
            if (oVar3 != null) {
                synchronized (oVar3) {
                    oVar3.f3993a = null;
                }
                com.google.android.gms.common.internal.a aVar4 = oVar3.f3995c;
                synchronized (aVar4.f18723s) {
                    aVar4.f18723s.remove(oVar3);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 2 && i11 != 1 && i11 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i11);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        o oVar4 = (o) message.obj;
        synchronized (oVar4) {
            try {
                bool = oVar4.f3993a;
                if (oVar4.f3994b) {
                    String string = oVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = oVar4.f3998f;
            int i12 = oVar4.f3996d;
            if (i12 != 0) {
                aVar5.x(1, null);
                Bundle bundle = oVar4.f3997e;
                oVar4.b(new D3.b(i12, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!oVar4.a()) {
                aVar5.x(1, null);
                oVar4.b(new D3.b(8, null, null));
            }
        }
        synchronized (oVar4) {
            oVar4.f3994b = true;
        }
        synchronized (oVar4) {
            oVar4.f3993a = null;
        }
        com.google.android.gms.common.internal.a aVar6 = oVar4.f3995c;
        synchronized (aVar6.f18723s) {
            aVar6.f18723s.remove(oVar4);
        }
    }
}
