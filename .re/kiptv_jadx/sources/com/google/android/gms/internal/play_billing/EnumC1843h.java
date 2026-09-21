package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1843h {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final com.google.android.gms.internal.play_billing.A j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19334h;

    static {
        B8.h hVar = new B8.h((char) 0, 10);
        hVar.j = new java.lang.Object[8];
        hVar.f861i = 0;
        for (com.google.android.gms.internal.play_billing.EnumC1843h enumC1843h : values()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(enumC1843h.f19334h);
            int i3 = hVar.f861i + 1;
            java.lang.Object[] objArr = (java.lang.Object[]) hVar.j;
            int length = objArr.length;
            int i9 = i3 + i3;
            if (i9 > length) {
                if (i9 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i9) {
                        int iHighestOneBit = java.lang.Integer.highestOneBit(i9 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                    }
                }
                hVar.j = java.util.Arrays.copyOf(objArr, length);
            }
            java.lang.Object[] objArr2 = (java.lang.Object[]) hVar.j;
            int i10 = hVar.f861i;
            int i11 = i10 + i10;
            objArr2[i11] = numValueOf;
            objArr2[i11 + 1] = enumC1843h;
            hVar.f861i = i10 + 1;
        }
        com.google.android.gms.internal.play_billing.C1870s c1870s = (com.google.android.gms.internal.play_billing.C1870s) hVar.f862k;
        if (c1870s != null) {
            throw c1870s.a();
        }
        com.google.android.gms.internal.play_billing.A a2 = com.google.android.gms.internal.play_billing.A.a(hVar.f861i, (java.lang.Object[]) hVar.j, hVar);
        com.google.android.gms.internal.play_billing.C1870s c1870s2 = (com.google.android.gms.internal.play_billing.C1870s) hVar.f862k;
        if (c1870s2 != null) {
            throw c1870s2.a();
        }
        j = a2;
    }

    EnumC1843h(int i3) {
        this.f19334h = i3;
    }
}
