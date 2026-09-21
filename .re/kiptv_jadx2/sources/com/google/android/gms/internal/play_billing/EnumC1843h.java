package com.google.android.gms.internal.play_billing;

import androidx.media3.common.util.Log;
import java.util.Arrays;

public enum EnumC1843h {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    public static final A j;

    public final int f19334h;

    static {
        B8.h hVar = new B8.h((char) 0, 10);
        hVar.j = new Object[8];
        hVar.f861i = 0;
        for (EnumC1843h enumC1843h : values()) {
            Integer numValueOf = Integer.valueOf(enumC1843h.f19334h);
            int i3 = hVar.f861i + 1;
            Object[] objArr = (Object[]) hVar.j;
            int length = objArr.length;
            int i9 = i3 + i3;
            if (i9 > length) {
                if (i9 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i9) {
                        int iHighestOneBit = Integer.highestOneBit(i9 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Log.LOG_LEVEL_OFF;
                    }
                }
                hVar.j = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) hVar.j;
            int i10 = hVar.f861i;
            int i11 = i10 + i10;
            objArr2[i11] = numValueOf;
            objArr2[i11 + 1] = enumC1843h;
            hVar.f861i = i10 + 1;
        }
        C1870s c1870s = (C1870s) hVar.f862k;
        if (c1870s != null) {
            throw c1870s.a();
        }
        A a2 = A.a(hVar.f861i, (Object[]) hVar.j, hVar);
        C1870s c1870s2 = (C1870s) hVar.f862k;
        if (c1870s2 != null) {
            throw c1870s2.a();
        }
        j = a2;
    }

    EnumC1843h(int i3) {
        this.f19334h = i3;
    }
}
