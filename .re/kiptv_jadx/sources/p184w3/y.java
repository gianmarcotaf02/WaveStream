package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements F3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p184w3.C f29950i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f29951k;

    public /* synthetic */ y(p184w3.C c9, java.lang.String str, java.lang.String str2, int i3) {
        this.f29949h = i3;
        this.f29950i = c9;
        this.j = str;
        this.f29951k = str2;
    }

    @Override // F3.l
    public final void K(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f29949h) {
            case 0:
                B3.D d4 = (B3.D) obj;
                p059g4.d dVar = (p059g4.d) obj2;
                p184w3.C c9 = this.f29950i;
                H3.q.i("Not connected to device", c9.f29799F == 3);
                B3.h hVar = (B3.h) d4.p();
                android.os.Parcel parcelY = hVar.Y();
                parcelY.writeString(this.j);
                parcelY.writeString(this.f29951k);
                int i3 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
                parcelY.writeInt(0);
                hVar.b0(parcelY, 14);
                synchronized (c9.f29807r) {
                    try {
                        if (c9.f29804o != null) {
                            c9.h(2477);
                        }
                        c9.f29804o = dVar;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                java.lang.String str = this.j;
                java.lang.String str2 = this.f29951k;
                B3.D d6 = (B3.D) obj;
                p059g4.d dVar2 = (p059g4.d) obj2;
                p184w3.C c10 = this.f29950i;
                java.util.HashMap map = c10.f29795B;
                long jIncrementAndGet = c10.f29806q.incrementAndGet();
                H3.q.i("Not connected to device", c10.f29799F == 3);
                try {
                    map.put(java.lang.Long.valueOf(jIncrementAndGet), dVar2);
                    B3.h hVar2 = (B3.h) d6.p();
                    android.os.Parcel parcelY2 = hVar2.Y();
                    parcelY2.writeString(str);
                    parcelY2.writeString(str2);
                    parcelY2.writeLong(jIncrementAndGet);
                    hVar2.b0(parcelY2, 9);
                    return;
                } catch (android.os.RemoteException e6) {
                    map.remove(java.lang.Long.valueOf(jIncrementAndGet));
                    dVar2.a(e6);
                    return;
                }
        }
    }
}
