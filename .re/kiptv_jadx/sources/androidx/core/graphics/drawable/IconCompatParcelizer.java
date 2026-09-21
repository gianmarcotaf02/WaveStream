package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(C2.b bVar) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.f16077a = bVar.f(iconCompat.f16077a, 1);
        byte[] bArr = iconCompat.f16079c;
        if (bVar.e(2)) {
            android.os.Parcel parcel = ((C2.c) bVar).f881e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f16079c = bArr;
        iconCompat.f16080d = bVar.g(iconCompat.f16080d, 3);
        iconCompat.f16081e = bVar.f(iconCompat.f16081e, 4);
        iconCompat.f16082f = bVar.f(iconCompat.f16082f, 5);
        iconCompat.g = (android.content.res.ColorStateList) bVar.g(iconCompat.g, 6);
        java.lang.String string = iconCompat.f16084i;
        if (bVar.e(7)) {
            string = ((C2.c) bVar).f881e.readString();
        }
        iconCompat.f16084i = string;
        java.lang.String string2 = iconCompat.j;
        if (bVar.e(8)) {
            string2 = ((C2.c) bVar).f881e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f16083h = android.graphics.PorterDuff.Mode.valueOf(iconCompat.f16084i);
        switch (iconCompat.f16077a) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.f16080d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                iconCompat.f16078b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.f16080d;
                if (parcelable2 != null) {
                    iconCompat.f16078b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f16079c;
                iconCompat.f16078b = bArr3;
                iconCompat.f16077a = 3;
                iconCompat.f16081e = 0;
                iconCompat.f16082f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(iconCompat.f16079c, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.f16078b = str;
                if (iconCompat.f16077a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f16078b = iconCompat.f16079c;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, C2.b bVar) {
        bVar.getClass();
        iconCompat.f16084i = iconCompat.f16083h.name();
        switch (iconCompat.f16077a) {
            case -1:
                iconCompat.f16080d = (android.os.Parcelable) iconCompat.f16078b;
                break;
            case 1:
            case 5:
                iconCompat.f16080d = (android.os.Parcelable) iconCompat.f16078b;
                break;
            case 2:
                iconCompat.f16079c = ((java.lang.String) iconCompat.f16078b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f16079c = (byte[]) iconCompat.f16078b;
                break;
            case 4:
            case 6:
                iconCompat.f16079c = iconCompat.f16078b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f16077a;
        if (-1 != i3) {
            bVar.j(i3, 1);
        }
        byte[] bArr = iconCompat.f16079c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            android.os.Parcel parcel = ((C2.c) bVar).f881e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.f16080d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i9 = iconCompat.f16081e;
        if (i9 != 0) {
            bVar.j(i9, 4);
        }
        int i10 = iconCompat.f16082f;
        if (i10 != 0) {
            bVar.j(i10, 5);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        java.lang.String str = iconCompat.f16084i;
        if (str != null) {
            bVar.i(7);
            ((C2.c) bVar).f881e.writeString(str);
        }
        java.lang.String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.i(8);
            ((C2.c) bVar).f881e.writeString(str2);
        }
    }
}
