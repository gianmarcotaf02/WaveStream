package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1831d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19314a = 0;

    static {
        com.google.android.gms.internal.play_billing.AbstractC1831d.class.getClassLoader();
    }

    public static android.os.Parcelable a(android.os.Parcel parcel) {
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }
}
