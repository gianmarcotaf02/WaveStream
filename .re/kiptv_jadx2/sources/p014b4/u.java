package p014b4;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class u extends AbstractC1659a implements Serializable {

    public final MessageDigest f17907l;

    public final int f17908m;

    public final boolean f17909n;

    public final String f17910o;

    public u() {
        boolean z6;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f17907l = messageDigest;
            this.f17908m = messageDigest.getDigestLength();
            this.f17910o = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z6 = true;
            } catch (CloneNotSupportedException unused) {
                z6 = false;
            }
            this.f17909n = z6;
        } catch (NoSuchAlgorithmException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String toString() {
        return this.f17910o;
    }
}
