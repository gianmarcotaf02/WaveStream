package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.videolan.libvlc.media.MediaPlayer;

public final class C1822a extends X3.a implements InterfaceC1828c {
    public final int f0(int i3, String str, String str2, Bundle bundle) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i9 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, 10);
        int i10 = parcelD0.readInt();
        parcelD0.recycle();
        return i10;
    }

    public final Bundle g0(Bundle bundle, String str, String str2) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(9);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i3 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, MediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final Bundle h0(Bundle bundle, String str, String str2) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(9);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i3 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final Bundle i0(String str, String str2, String str3) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        parcelC0.writeString(null);
        Parcel parcelD0 = d0(parcelC0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle;
    }

    public final Bundle j0(int i3, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        parcelC0.writeString(null);
        int i9 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final Bundle k0(String str, String str2, String str3) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        Parcel parcelD0 = d0(parcelC0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle;
    }

    public final Bundle l0(int i3, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        int i9 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final Bundle m0(int i3, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i9 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeInt(1);
        bundle2.writeToParcel(parcelC0, 0);
        Parcel parcelD0 = d0(parcelC0, MediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle3;
    }

    public final void n0(String str, Bundle bundle, Y2.I i3) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(18);
        parcelC0.writeString(str);
        int i9 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeStrongBinder(i3);
        e0(parcelC0, 1301);
    }

    public final void o0(String str, Bundle bundle, Y2.J j) {
        Parcel parcelC0 = c0();
        parcelC0.writeInt(12);
        parcelC0.writeString(str);
        int i3 = AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeStrongBinder(j);
        e0(parcelC0, 1201);
    }
}
