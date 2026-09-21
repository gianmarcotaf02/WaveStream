package H3;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Z3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.google.android.gms.common.internal.a aVar, android.os.Looper looper) {
        super(looper, 1);
        java.util.Objects.requireNonNull(aVar);
        this.f4005b = aVar;
    }

    @Override // Z3.d, android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Boolean bool;
        H3.o oVar;
        com.google.android.gms.common.internal.a aVar = this.f4005b;
        if (aVar.f18711D.get() != message.arg1) {
            int i3 = message.what;
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (oVar = (H3.o) message.obj) != null) {
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
            H3.o oVar2 = (H3.o) message.obj;
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
            if (!aVar.f18709B && !android.text.TextUtils.isEmpty(aVar.q()) && !android.text.TextUtils.isEmpty(null)) {
                try {
                    java.lang.Class.forName(aVar.q());
                    if (!aVar.f18709B) {
                        aVar.x(3, null);
                        return;
                    }
                } catch (java.lang.ClassNotFoundException unused) {
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
            java.lang.Object obj = message.obj;
            D3.b bVar3 = new D3.b(message.arg2, obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) obj : null, null);
            aVar.f18721q.a(bVar3);
            aVar.t(bVar3);
            return;
        }
        if (i10 == 6) {
            aVar.x(5, null);
            H3.g gVar = aVar.f18726v;
            if (gVar != null) {
                ((E3.g) gVar.f3974a).J(message.arg2);
            }
            java.lang.System.currentTimeMillis();
            aVar.w(5, 1, null);
            return;
        }
        if (i10 == 2 && !aVar.isConnected()) {
            H3.o oVar3 = (H3.o) message.obj;
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i11);
            android.util.Log.wtf("GmsClient", sb.toString(), new java.lang.Exception());
            return;
        }
        H3.o oVar4 = (H3.o) message.obj;
        synchronized (oVar4) {
            try {
                bool = oVar4.f3993a;
                if (oVar4.f3994b) {
                    java.lang.String string = oVar4.toString();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    android.util.Log.w("GmsClient", sb2.toString());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = oVar4.f3998f;
            int i12 = oVar4.f3996d;
            if (i12 != 0) {
                aVar5.x(1, null);
                android.os.Bundle bundle = oVar4.f3997e;
                oVar4.b(new D3.b(i12, bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
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
