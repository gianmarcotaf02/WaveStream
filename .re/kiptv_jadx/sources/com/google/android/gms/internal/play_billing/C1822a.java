package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1822a extends X3.a implements com.google.android.gms.internal.play_billing.InterfaceC1828c {
    public final int f0(int i3, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, 10);
        int i10 = parcelD0.readInt();
        parcelD0.recycle();
        return i10;
    }

    public final android.os.Bundle g0(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(9);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final android.os.Bundle h0(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(9);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, 12);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final android.os.Bundle i0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        parcelC0.writeString(null);
        android.os.Parcel parcelD0 = d0(parcelC0, 3);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle;
    }

    public final android.os.Bundle j0(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        parcelC0.writeString(null);
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, 8);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final android.os.Bundle k0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        android.os.Parcel parcelD0 = d0(parcelC0, 4);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle;
    }

    public final android.os.Bundle l0(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        parcelC0.writeString(str3);
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, 11);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle2;
    }

    public final android.os.Bundle m0(int i3, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(i3);
        parcelC0.writeString(str);
        parcelC0.writeString(str2);
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeInt(1);
        bundle2.writeToParcel(parcelC0, 0);
        android.os.Parcel parcelD0 = d0(parcelC0, org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE);
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcelD0);
        parcelD0.recycle();
        return bundle3;
    }

    public final void n0(java.lang.String str, android.os.Bundle bundle, Y2.I i3) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(18);
        parcelC0.writeString(str);
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeStrongBinder(i3);
        e0(parcelC0, 1301);
    }

    public final void o0(java.lang.String str, android.os.Bundle bundle, Y2.J j) {
        android.os.Parcel parcelC0 = c0();
        parcelC0.writeInt(12);
        parcelC0.writeString(str);
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1831d.f19314a;
        parcelC0.writeInt(1);
        bundle.writeToParcel(parcelC0, 0);
        parcelC0.writeStrongBinder(j);
        e0(parcelC0, 1201);
    }
}
