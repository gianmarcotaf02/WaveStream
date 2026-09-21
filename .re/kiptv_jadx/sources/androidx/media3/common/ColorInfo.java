package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final androidx.media3.common.ColorInfo SDR_BT709_LIMITED = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final androidx.media3.common.ColorInfo SRGB_BT709_FULL = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final java.lang.String FIELD_COLOR_SPACE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_COLOR_RANGE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_COLOR_TRANSFER = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_HDR_STATIC_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_LUMA_BITDEPTH = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_CHROMA_BITDEPTH = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    public static final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        public androidx.media3.common.ColorInfo build() {
            return new androidx.media3.common.ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }

        public androidx.media3.common.ColorInfo.Builder setChromaBitdepth(int i3) {
            this.chromaBitdepth = i3;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setColorRange(int i3) {
            this.colorRange = i3;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setColorSpace(int i3) {
            this.colorSpace = i3;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setColorTransfer(int i3) {
            this.colorTransfer = i3;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setHdrStaticInfo(byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setLumaBitdepth(int i3) {
            this.lumaBitdepth = i3;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        private Builder(androidx.media3.common.ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }
    }

    private static java.lang.String chromaBitdepthToString(int i3) {
        return i3 != -1 ? Y6.f.e(i3, "bit Chroma") : "NA";
    }

    private static java.lang.String colorRangeToString(int i3) {
        if (i3 == -1) {
            return "Unset color range";
        }
        if (i3 != 1) {
            return i3 != 2 ? com.google.android.gms.internal.play_billing.M0.l(i3, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static int colorSpaceToIsoColorPrimaries(int i3) {
        if (i3 != 2) {
            return i3 != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i3) {
        if (i3 != 2) {
            return i3 != 6 ? 1 : 9;
        }
        return 6;
    }

    private static java.lang.String colorSpaceToString(int i3) {
        if (i3 == -1) {
            return "Unset color space";
        }
        if (i3 == 6) {
            return "BT2020";
        }
        if (i3 != 1) {
            return i3 != 2 ? com.google.android.gms.internal.play_billing.M0.l(i3, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static int colorTransferToIsoTransferCharacteristics(int i3) {
        if (i3 == 1) {
            return 8;
        }
        if (i3 == 2) {
            return 13;
        }
        if (i3 == 6) {
            return 16;
        }
        if (i3 != 7) {
            return i3 != 10 ? 1 : 4;
        }
        return 18;
    }

    private static java.lang.String colorTransferToString(int i3) {
        if (i3 == -1) {
            return "Unset color transfer";
        }
        if (i3 == 10) {
            return "Gamma 2.2";
        }
        if (i3 == 1) {
            return "Linear";
        }
        if (i3 == 2) {
            return "sRGB";
        }
        if (i3 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i3 != 6) {
            return i3 != 7 ? com.google.android.gms.internal.play_billing.M0.l(i3, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static androidx.media3.common.ColorInfo fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i3 = colorInfo.colorSpace;
        if (i3 != -1 && i3 != 1 && i3 != 2) {
            return false;
        }
        int i9 = colorInfo.colorRange;
        if (i9 != -1 && i9 != 2) {
            return false;
        }
        int i10 = colorInfo.colorTransfer;
        if ((i10 != -1 && i10 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i11 = colorInfo.chromaBitdepth;
        if (i11 != -1 && i11 != 8) {
            return false;
        }
        int i12 = colorInfo.lumaBitdepth;
        return i12 == -1 || i12 == 8;
    }

    public static boolean isTransferHdr(androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo == null) {
            return false;
        }
        int i3 = colorInfo.colorTransfer;
        return i3 == 7 || i3 == 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoColorPrimariesToColorSpace(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 9) {
            return (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : -1;
        }
        return 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 4) {
            return 10;
        }
        if (i3 == 13) {
            return 2;
        }
        if (i3 == 16) {
            return 6;
        }
        if (i3 != 18) {
            return (i3 == 6 || i3 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static java.lang.String lumaBitdepthToString(int i3) {
        return i3 != -1 ? Y6.f.e(i3, "bit Luma") : "NA";
    }

    public androidx.media3.common.ColorInfo.Builder buildUpon() {
        return new androidx.media3.common.ColorInfo.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.ColorInfo.class == obj.getClass()) {
            androidx.media3.common.ColorInfo colorInfo = (androidx.media3.common.ColorInfo) obj;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && java.util.Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((java.util.Arrays.hashCode(this.hdrStaticInfo) + ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public java.lang.String toLogString() {
        java.lang.String str;
        java.lang.String invariant = isDataSpaceValid() ? androidx.media3.common.util.Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.lumaBitdepth + "/" + this.chromaBitdepth;
        } else {
            str = "NA/NA";
        }
        return p121o0.p.p(invariant, "/", str);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorInfo(");
        sb.append(colorSpaceToString(this.colorSpace));
        sb.append(", ");
        sb.append(colorRangeToString(this.colorRange));
        sb.append(", ");
        sb.append(colorTransferToString(this.colorTransfer));
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(", ");
        sb.append(lumaBitdepthToString(this.lumaBitdepth));
        sb.append(", ");
        return Y6.f.m(sb, chromaBitdepthToString(this.chromaBitdepth), ")");
    }

    private ColorInfo(int i3, int i9, int i10, byte[] bArr, int i11, int i12) {
        this.colorSpace = i3;
        this.colorRange = i9;
        this.colorTransfer = i10;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i11;
        this.chromaBitdepth = i12;
    }
}
