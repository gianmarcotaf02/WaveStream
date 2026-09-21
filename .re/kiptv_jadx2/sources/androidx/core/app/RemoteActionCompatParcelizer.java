package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C2.b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        C2.d dVarH = remoteActionCompat.f16005a;
        boolean z6 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f16005a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f16006b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2.c) bVar).f881e);
        }
        remoteActionCompat.f16006b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f16007c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2.c) bVar).f881e);
        }
        remoteActionCompat.f16007c = charSequence2;
        remoteActionCompat.f16008d = (PendingIntent) bVar.g(remoteActionCompat.f16008d, 4);
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

    public static void write(RemoteActionCompat remoteActionCompat, C2.b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f16005a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f16006b;
        bVar.i(2);
        Parcel parcel = ((C2.c) bVar).f881e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f16007c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f16008d, 4);
        boolean z6 = remoteActionCompat.f16009e;
        bVar.i(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z9 = remoteActionCompat.f16010f;
        bVar.i(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
