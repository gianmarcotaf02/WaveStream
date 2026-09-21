package B3;

import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1818z;

public final class u implements F3.l {

    public final int f670h;

    public final String[] f671i;

    public u(x xVar, String[] strArr, int i3) {
        this.f670h = i3;
        this.f671i = strArr;
    }

    @Override
    public final void K(Object obj, Object obj2) {
        y yVar = (y) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f670h) {
            case 0:
                w wVar = new w(1, dVar);
                k kVar = (k) yVar.p();
                Parcel parcelY = kVar.Y();
                AbstractC1818z.d(parcelY, wVar);
                parcelY.writeStringArray(this.f671i);
                kVar.b0(parcelY, 6);
                break;
            default:
                w wVar2 = new w(2, dVar);
                k kVar2 = (k) yVar.p();
                Parcel parcelY2 = kVar2.Y();
                AbstractC1818z.d(parcelY2, wVar2);
                parcelY2.writeStringArray(this.f671i);
                kVar2.b0(parcelY2, 7);
                break;
        }
    }
}
