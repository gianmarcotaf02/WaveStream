package p140q4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.datastore.preferences.protobuf.AbstractC1503j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26630c;

    public c(byte[] bArr, int i3, int i9) throws java.security.InvalidKeyException {
        this.f26630c = i9;
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f16219b = p140q4.a.c(bArr);
        this.f16218a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int[] c(int[] iArr, int i3) {
        switch (this.f26630c) {
            case 0:
                if (iArr.length != 3) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f16219b;
                int[] iArr4 = p140q4.a.f26626a;
                java.lang.System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                java.lang.System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i3;
                java.lang.System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = (int[]) this.f16219b;
                int[] iArr8 = p140q4.a.f26626a;
                java.lang.System.arraycopy(iArr8, 0, iArr6, 0, iArr8.length);
                java.lang.System.arraycopy(iArr7, 0, iArr6, iArr8.length, 8);
                iArr6[12] = iArr[0];
                iArr6[13] = iArr[1];
                iArr6[14] = iArr[2];
                iArr6[15] = iArr[3];
                p140q4.a.b(iArr6);
                iArr6[4] = iArr6[12];
                iArr6[5] = iArr6[13];
                iArr6[6] = iArr6[14];
                iArr6[7] = iArr6[15];
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr6, 8);
                java.lang.System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                java.lang.System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i3;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int i() {
        switch (this.f26630c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
