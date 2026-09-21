package H3;

/* JADX INFO: loaded from: classes.dex */
public final class w extends H3.o {
    public final android.os.IBinder g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.google.android.gms.common.internal.a aVar, int i3, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(aVar, i3, bundle);
        java.util.Objects.requireNonNull(aVar);
        this.f4010h = aVar;
        this.g = iBinder;
    }

    @Override // H3.o
    public final boolean a() {
        android.os.IBinder iBinder = this.g;
        try {
            H3.q.g(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f4010h;
            if (!aVar.q().equals(interfaceDescriptor)) {
                java.lang.String strQ = aVar.q();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strQ.length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strQ);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                android.util.Log.w("GmsClient", sb.toString());
                return false;
            }
            android.os.IInterface iInterfaceL = aVar.l(iBinder);
            if (iInterfaceL == null || !(aVar.w(2, 4, iInterfaceL) || aVar.w(3, 4, iInterfaceL))) {
                return false;
            }
            aVar.f18708A = null;
            aVar.n();
            H3.g gVar = aVar.f18726v;
            if (gVar == null) {
                return true;
            }
            ((E3.g) gVar.f3974a).onConnected();
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // H3.o
    public final void b(D3.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f4010h;
        H3.g gVar = aVar.f18727w;
        if (gVar != null) {
            ((E3.h) gVar.f3974a).m(bVar);
        }
        aVar.t(bVar);
    }
}
