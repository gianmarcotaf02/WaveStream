package io.sentry.util;

import java.util.UUID;

public final class UUIDGenerator {
    public static long randomHalfLengthUUID() {
        byte[] bArr = new byte[8];
        SentryRandom.current().nextBytes(bArr);
        byte b9 = (byte) (bArr[6] & 15);
        bArr[6] = b9;
        bArr[6] = (byte) (b9 | 64);
        long j = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            j = (j << 8) | ((long) (bArr[i3] & 255));
        }
        return j;
    }

    public static UUID randomUUID() {
        byte[] bArr = new byte[16];
        SentryRandom.current().nextBytes(bArr);
        byte b9 = (byte) (bArr[6] & 15);
        bArr[6] = b9;
        bArr[6] = (byte) (b9 | 64);
        byte b10 = (byte) (bArr[8] & 63);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | (-128));
        long j = 0;
        long j9 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            j9 = (j9 << 8) | ((long) (bArr[i3] & 255));
        }
        for (int i9 = 8; i9 < 16; i9++) {
            j = (j << 8) | ((long) (bArr[i9] & 255));
        }
        return new UUID(j9, j);
    }
}
