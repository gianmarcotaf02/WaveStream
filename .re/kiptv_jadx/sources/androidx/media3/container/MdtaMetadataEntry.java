package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final java.lang.String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final java.lang.String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i3) {
        this(str, bArr, 0, i3);
    }

    private static java.lang.String getFormattedValueForAuxiliaryTracksMap(java.util.List<java.lang.Integer> list) {
        java.lang.StringBuilder sbV = p121o0.p.v("track types = ");
        new p068h4.k(java.lang.String.valueOf(',')).a(sbV, list.iterator());
        return sbV.toString();
    }

    private static void validateData(java.lang.String str, byte[] bArr, int i3) {
        byte b9;
        str.getClass();
        boolean z6 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i3 == 23 && bArr.length == 4) {
                    z6 = true;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
                break;
            case "auxiliary.tracks.interleaved":
                if (i3 == 75 && bArr.length == 1 && ((b9 = bArr[0]) == 0 || b9 == 1)) {
                    z6 = true;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i3 == 78 && bArr.length == 8) {
                    z6 = true;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
                break;
            case "auxiliary.tracks.map":
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 == 0);
                break;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.container.MdtaMetadataEntry.class == obj.getClass()) {
            androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && java.util.Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<java.lang.Integer> getAuxiliaryTrackTypesFromMap() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b9 = this.value[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < b9; i3++) {
            arrayList.add(java.lang.Integer.valueOf(this.value[i3 + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((((java.util.Arrays.hashCode(this.value) + B2.a.a(527, 31, this.key)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    public java.lang.String toString() {
        java.lang.String formattedValueForAuxiliaryTracksMap;
        int i3 = this.typeIndicator;
        if (i3 != 0) {
            if (i3 == 1) {
                formattedValueForAuxiliaryTracksMap = androidx.media3.common.util.Util.fromUtf8Bytes(this.value);
            } else if (i3 == 23) {
                byte[] bArr = this.value;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.K("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                formattedValueForAuxiliaryTracksMap = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.crypto.tink.shaded.protobuf.q0.u(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i3 == 67) {
                byte[] bArr2 = this.value;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.K("array too small: %s < %s", bArr2.length, 4, bArr2.length >= 4);
                formattedValueForAuxiliaryTracksMap = java.lang.String.valueOf(com.google.crypto.tink.shaded.protobuf.q0.u(bArr2[0], bArr2[1], bArr2[2], bArr2[3]));
            } else if (i3 == 75) {
                formattedValueForAuxiliaryTracksMap = java.lang.String.valueOf(this.value[0] & 255);
            } else if (i3 != 78) {
                formattedValueForAuxiliaryTracksMap = androidx.media3.common.util.Util.toHexString(this.value);
            } else {
                formattedValueForAuxiliaryTracksMap = java.lang.String.valueOf(new androidx.media3.common.util.ParsableByteArray(this.value).readUnsignedLongToLong());
            }
        } else if (this.key.equals(KEY_AUXILIARY_TRACKS_MAP)) {
            formattedValueForAuxiliaryTracksMap = getFormattedValueForAuxiliaryTracksMap(getAuxiliaryTrackTypesFromMap());
        } else {
            formattedValueForAuxiliaryTracksMap = androidx.media3.common.util.Util.toHexString(this.value);
        }
        return B2.a.o(new java.lang.StringBuilder("mdta: key="), this.key, ", value=", formattedValueForAuxiliaryTracksMap);
    }

    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i3, int i9) {
        validateData(str, bArr, i9);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i3;
        this.typeIndicator = i9;
    }
}
