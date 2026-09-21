package androidx.media3.decoder;

public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i3, String str) {
        super(str);
        this.errorCode = i3;
    }
}
