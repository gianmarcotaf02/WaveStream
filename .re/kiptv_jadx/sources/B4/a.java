package B4;

/* JADX INFO: loaded from: classes.dex */
public final class a extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f678a;

    public /* synthetic */ a(int i3) {
        this.f678a = i3;
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        switch (this.f678a) {
            case 0:
                try {
                    return (javax.crypto.Cipher) B4.q.f723b.f726a.b("AES/CTR/NoPadding");
                } catch (java.security.GeneralSecurityException e6) {
                    throw new java.lang.IllegalStateException(e6);
                }
            case 1:
                try {
                    return (javax.crypto.Cipher) B4.q.f723b.f726a.b("AES/ECB/NOPADDING");
                } catch (java.security.GeneralSecurityException e9) {
                    throw new java.lang.IllegalStateException(e9);
                }
            case 2:
                try {
                    return (javax.crypto.Cipher) B4.q.f723b.f726a.b("AES/CTR/NOPADDING");
                } catch (java.security.GeneralSecurityException e10) {
                    throw new java.lang.IllegalStateException(e10);
                }
            case 3:
                java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 4:
                return new java.util.Random();
            case 5:
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(x8.b.f31720e);
                return simpleDateFormat;
            case 6:
                return java.lang.Boolean.FALSE;
            case 7:
                return 0L;
            case 8:
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new java.lang.IllegalStateException("no Looper on this thread");
                }
                R0.X x9 = new R0.X(choreographer, com.google.android.gms.internal.play_billing.AbstractC1833d1.o(looperMyLooper));
                return x9.plus(x9.f8863r);
            case 9:
                try {
                    return (javax.crypto.Cipher) B4.q.f723b.f726a.b("AES/GCM/NoPadding");
                } catch (java.security.GeneralSecurityException e11) {
                    throw new java.lang.IllegalStateException(e11);
                }
            default:
                try {
                    return (javax.crypto.Cipher) B4.q.f723b.f726a.b("AES/GCM-SIV/NoPadding");
                } catch (java.security.GeneralSecurityException e12) {
                    throw new java.lang.IllegalStateException(e12);
                }
        }
    }
}
