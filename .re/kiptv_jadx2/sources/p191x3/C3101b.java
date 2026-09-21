package p191x3;

import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.exoplayer.Renderer;
import com.google.common.util.concurrent.AbstractC1903s;
import java.util.ArrayList;
import java.util.Collections;
import p184w3.D;
import p184w3.i;
import p199y3.f;

public final class C3101b extends a {
    public static final Parcelable.Creator<C3101b> CREATOR;

    public static final z f31166x = new z(false);
    public static final A y = new A(0);

    public static final p199y3.a f31167z;

    public final String f31168h;

    public final ArrayList f31169i;
    public final boolean j;

    public final i f31170k;

    public final boolean f31171l;

    public final p199y3.a f31172m;

    public final boolean f31173n;

    public final double f31174o;

    public final boolean f31175p;

    public final boolean f31176q;

    public final boolean f31177r;

    public final ArrayList f31178s;

    public final boolean f31179t;

    public final boolean f31180u;

    public final z f31181v;

    public A f31182w;

    static {
        new f(f.f31828P, f.f31829Q, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, null, AbstractC1903s.N("smallIconDrawableResId"), AbstractC1903s.N("stopLiveStreamDrawableResId"), AbstractC1903s.N("pauseDrawableResId"), AbstractC1903s.N("playDrawableResId"), AbstractC1903s.N("skipNextDrawableResId"), AbstractC1903s.N("skipPrevDrawableResId"), AbstractC1903s.N("forwardDrawableResId"), AbstractC1903s.N("forward10DrawableResId"), AbstractC1903s.N("forward30DrawableResId"), AbstractC1903s.N("rewindDrawableResId"), AbstractC1903s.N("rewind10DrawableResId"), AbstractC1903s.N("rewind30DrawableResId"), AbstractC1903s.N("disconnectDrawableResId"), AbstractC1903s.N("notificationImageSizeDimenResId"), AbstractC1903s.N("castingToDeviceStringResId"), AbstractC1903s.N("stopLiveStreamStringResId"), AbstractC1903s.N("pauseStringResId"), AbstractC1903s.N("playStringResId"), AbstractC1903s.N("skipNextStringResId"), AbstractC1903s.N("skipPrevStringResId"), AbstractC1903s.N("forwardStringResId"), AbstractC1903s.N("forward10StringResId"), AbstractC1903s.N("forward30StringResId"), AbstractC1903s.N("rewindStringResId"), AbstractC1903s.N("rewind10StringResId"), AbstractC1903s.N("rewind30StringResId"), AbstractC1903s.N("disconnectStringResId"), null, false, false);
        f31167z = new p199y3.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new D(19);
    }

    public C3101b(String str, ArrayList arrayList, boolean z6, i iVar, boolean z9, p199y3.a aVar, boolean z10, double d4, boolean z11, boolean z12, boolean z13, ArrayList arrayList2, boolean z14, boolean z15, z zVar, A a2) {
        this.f31168h = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f31169i = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.j = z6;
        this.f31170k = iVar == null ? new i() : iVar;
        this.f31171l = z9;
        this.f31172m = aVar;
        this.f31173n = z10;
        this.f31174o = d4;
        this.f31175p = z11;
        this.f31176q = z12;
        this.f31177r = z13;
        this.f31178s = arrayList2;
        this.f31179t = z14;
        this.f31180u = z15;
        this.f31181v = zVar;
        this.f31182w = a2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 2, this.f31168h);
        G.a0(parcel, Collections.unmodifiableList(this.f31169i), 3);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        G.Y(parcel, 5, this.f31170k, i3);
        G.e0(parcel, 6, 4);
        parcel.writeInt(this.f31171l ? 1 : 0);
        G.Y(parcel, 7, this.f31172m, i3);
        G.e0(parcel, 8, 4);
        parcel.writeInt(this.f31173n ? 1 : 0);
        G.e0(parcel, 9, 8);
        parcel.writeDouble(this.f31174o);
        G.e0(parcel, 10, 4);
        parcel.writeInt(this.f31175p ? 1 : 0);
        G.e0(parcel, 11, 4);
        parcel.writeInt(this.f31176q ? 1 : 0);
        G.e0(parcel, 12, 4);
        parcel.writeInt(this.f31177r ? 1 : 0);
        G.a0(parcel, Collections.unmodifiableList(this.f31178s), 13);
        G.e0(parcel, 14, 4);
        parcel.writeInt(this.f31179t ? 1 : 0);
        G.e0(parcel, 15, 4);
        parcel.writeInt(0);
        G.e0(parcel, 16, 4);
        parcel.writeInt(this.f31180u ? 1 : 0);
        G.Y(parcel, 17, this.f31181v, i3);
        G.Y(parcel, 18, this.f31182w, i3);
        G.g0(parcel, iF0);
    }
}
