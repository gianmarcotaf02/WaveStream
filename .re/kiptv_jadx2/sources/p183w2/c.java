package p183w2;

import android.security.keystore.KeyGenParameterSpec;

public abstract class c {

    public static final Object f29789a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f29789a = new Object();
    }
}
