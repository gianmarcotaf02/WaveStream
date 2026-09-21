package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(C2.b bVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        C2.d dVarH = remoteActionCompat.f16005a;
        boolean z6 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f16005a = (androidx.core.graphics.drawable.IconCompat) dVarH;
        java.lang.CharSequence charSequence = remoteActionCompat.f16006b;
        if (bVar.e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2.c) bVar).f881e);
        }
        remoteActionCompat.f16006b = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.f16007c;
        if (bVar.e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2.c) bVar).f881e);
        }
        remoteActionCompat.f16007c = charSequence2;
        remoteActionCompat.f16008d = (android.app.PendingIntent) bVar.g(remoteActionCompat.f16008d, 4);
        boolean z9 = remoteActionCompat.f16009e;
        if (bVar.e(5)) {
            z9 = ((C2.c) bVar).f881e.readInt() != 0;
        }
        remoteActionCompat.f16009e = z9;
        boolean z10 = remoteActionCompat.f16010f;
        if (!bVar.e(6)) {
            z6 = z10;
        } else if (((C2.c) bVar).f881e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f16010f = z6;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, C2.b bVar) {
        bVar.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.f16005a;
        bVar.i(1);
        bVar.l(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.f16006b;
        bVar.i(2);
        android.os.Parcel parcel = ((C2.c) bVar).f881e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.f16007c;
        bVar.i(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f16008d, 4);
        boolean z6 = remoteActionCompat.f16009e;
        bVar.i(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z9 = remoteActionCompat.f16010f;
        bVar.i(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
