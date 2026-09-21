package B4;

import R0.X;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

public final class a extends ThreadLocal {

    public final int f678a;

    public a(int i3) {
        this.f678a = i3;
    }

    @Override
    public final Object initialValue() {
        switch (this.f678a) {
            case 0:
                try {
                    return (Cipher) q.f723b.f726a.b("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 1:
                try {
                    return (Cipher) q.f723b.f726a.b("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 2:
                try {
                    return (Cipher) q.f723b.f726a.b("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 3:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 4:
                return new Random();
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(x8.b.f31720e);
                return simpleDateFormat;
            case 6:
                return Boolean.FALSE;
            case 7:
                return 0L;
            case 8:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                X x9 = new X(choreographer, AbstractC1833d1.o(looperMyLooper));
                return x9.plus(x9.f8863r);
            case 9:
                try {
                    return (Cipher) q.f723b.f726a.b("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            default:
                try {
                    return (Cipher) q.f723b.f726a.b("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
        }
    }
}
