package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.TrackOutput;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final String schemeType;

    public TrackEncryptionBox(boolean z6, String str, int i3, byte[] bArr, int i9, int i10, byte[] bArr2) {
        AbstractC1864o0.L((bArr2 == null) ^ (i3 == 0));
        this.isEncrypted = z6;
        this.schemeType = str;
        this.perSampleIvSize = i3;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i9, i10);
    }

    private static int schemeToCryptoMode(String str) {
        if (str == null) {
            return 1;
        }
        byte b9 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    b9 = 0;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    b9 = 1;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    b9 = 2;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    b9 = 3;
                }
                break;
        }
        switch (b9) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
