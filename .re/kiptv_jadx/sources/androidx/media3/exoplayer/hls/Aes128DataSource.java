package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
class Aes128DataSource implements androidx.media3.datasource.DataSource {
    private javax.crypto.CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final androidx.media3.datasource.DataSource upstream;

    public Aes128DataSource(androidx.media3.datasource.DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.cipherInputStream != null) {
            this.cipherInputStream = null;
            this.upstream.close();
        }
    }

    public javax.crypto.Cipher getCipherInstance() {
        return javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // androidx.media3.datasource.DataSource
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(androidx.media3.datasource.DataSpec dataSpec) {
        try {
            javax.crypto.Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new javax.crypto.spec.SecretKeySpec(this.encryptionKey, "AES"), new javax.crypto.spec.IvParameterSpec(this.encryptionIv));
                androidx.media3.datasource.DataSourceInputStream dataSourceInputStream = new androidx.media3.datasource.DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new javax.crypto.CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e6) {
                throw new java.lang.RuntimeException(e6);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e9) {
            throw new java.lang.RuntimeException(e9);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i3, int i9) throws java.io.IOException {
        this.cipherInputStream.getClass();
        int i10 = this.cipherInputStream.read(bArr, i3, i9);
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }
}
