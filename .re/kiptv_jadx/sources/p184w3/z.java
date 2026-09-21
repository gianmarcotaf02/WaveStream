package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements F3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29952h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p184w3.C f29953i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ z(p184w3.C c9, java.lang.String str) {
        this.f29953i = c9;
        this.j = str;
    }

    @Override // F3.l
    public final void K(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f29952h) {
            case 0:
                B3.D d4 = (B3.D) obj;
                p059g4.d dVar = (p059g4.d) obj2;
                H3.q.i("Not active connection", this.f29953i.f29799F != 1);
                B3.h hVar = (B3.h) d4.p();
                java.lang.String str = this.j;
                android.os.Parcel parcelY = hVar.Y();
                parcelY.writeString(str);
                hVar.b0(parcelY, 12);
                B3.h hVar2 = (B3.h) d4.p();
                android.os.Parcel parcelY2 = hVar2.Y();
                parcelY2.writeString(str);
                hVar2.b0(parcelY2, 11);
                dVar.b(null);
                return;
            default:
                p184w3.C c9 = this.f29953i;
                java.lang.String str2 = this.j;
                B3.D d6 = (B3.D) obj;
                p059g4.d dVar2 = (p059g4.d) obj2;
                H3.q.i("Not connected to device", c9.f29799F == 3);
                B3.h hVar3 = (B3.h) d6.p();
                android.os.Parcel parcelY3 = hVar3.Y();
                parcelY3.writeString(str2);
                hVar3.b0(parcelY3, 5);
                synchronized (c9.f29808s) {
                    try {
                        if (c9.f29805p != null) {
                            dVar2.a(H3.q.k(new com.google.android.gms.common.api.Status(androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, null, null, null)));
                            return;
                        } else {
                            c9.f29805p = dVar2;
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ z(p184w3.C c9, java.lang.String str, p199y3.g gVar) {
        this.f29953i = c9;
        this.j = str;
    }
}
