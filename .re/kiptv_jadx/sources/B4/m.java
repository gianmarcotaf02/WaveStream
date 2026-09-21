package B4;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4.a f717a;

    public m(byte[] bArr) {
        if (!p121o0.p.a(1)) {
            throw new java.lang.IllegalStateException(new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f717a = C4.a.a(bArr);
    }

    public final void a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        long[] jArr;
        android.support.v4.media.session.q qVar;
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new java.security.GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] bArr4 = this.f717a.f889a;
        byte[] bArr5 = new byte[bArr4.length];
        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr3, 32, 64);
            int i3 = 31;
            while (i3 >= 0) {
                int i9 = bArrCopyOfRange[i3] & 255;
                int i10 = B4.k.f705b[i3] & 255;
                if (i9 != i10) {
                    if (i9 >= i10) {
                        break;
                    }
                    java.security.MessageDigest messageDigest = (java.security.MessageDigest) B4.q.f725d.f726a.b("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArr5);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jH = B4.k.h(bArrDigest, 0) & 2097151;
                    long jI = (B4.k.i(bArrDigest, 2) >> 5) & 2097151;
                    long jH2 = (B4.k.h(bArrDigest, 5) >> 2) & 2097151;
                    long jI2 = (B4.k.i(bArrDigest, 7) >> 7) & 2097151;
                    long jI3 = (B4.k.i(bArrDigest, 10) >> 4) & 2097151;
                    long jH3 = (B4.k.h(bArrDigest, 13) >> 1) & 2097151;
                    long jI4 = (B4.k.i(bArrDigest, 15) >> 6) & 2097151;
                    long jH4 = (B4.k.h(bArrDigest, 18) >> 3) & 2097151;
                    long jH5 = B4.k.h(bArrDigest, 21) & 2097151;
                    long jI5 = (B4.k.i(bArrDigest, 23) >> 5) & 2097151;
                    long jH6 = (B4.k.h(bArrDigest, 26) >> 2) & 2097151;
                    long jI6 = (B4.k.i(bArrDigest, 28) >> 7) & 2097151;
                    long jI7 = (B4.k.i(bArrDigest, 31) >> 4) & 2097151;
                    long jH7 = (B4.k.h(bArrDigest, 34) >> 1) & 2097151;
                    long jI8 = (B4.k.i(bArrDigest, 36) >> 6) & 2097151;
                    long jH8 = (B4.k.h(bArrDigest, 39) >> 3) & 2097151;
                    long jH9 = B4.k.h(bArrDigest, 42) & 2097151;
                    long jI9 = (B4.k.i(bArrDigest, 44) >> 5) & 2097151;
                    long jH10 = (B4.k.h(bArrDigest, 47) >> 2) & 2097151;
                    long jI10 = (B4.k.i(bArrDigest, 49) >> 7) & 2097151;
                    long jI11 = (B4.k.i(bArrDigest, 52) >> 4) & 2097151;
                    long jH11 = (B4.k.h(bArrDigest, 55) >> 1) & 2097151;
                    long jI12 = (B4.k.i(bArrDigest, 57) >> 6) & 2097151;
                    long jI13 = B4.k.i(bArrDigest, 60) >> 3;
                    long j = (jI13 * 666643) + jI6;
                    long j9 = (jI13 * 470296) + jI7;
                    long j10 = (jI13 * 654183) + jH7;
                    long j11 = jI8 - (jI13 * 997805);
                    long j12 = (jI13 * 136657) + jH8;
                    long j13 = jH9 - (jI13 * 683901);
                    long j14 = (jI12 * 666643) + jH6;
                    long j15 = (jI12 * 470296) + j;
                    long j16 = (jI12 * 654183) + j9;
                    long j17 = j10 - (jI12 * 997805);
                    long j18 = (jI12 * 136657) + j11;
                    long j19 = j12 - (jI12 * 683901);
                    long j20 = (jH11 * 666643) + jI5;
                    long j21 = (jH11 * 470296) + j14;
                    long j22 = (jH11 * 654183) + j15;
                    long j23 = j16 - (jH11 * 997805);
                    long j24 = (jH11 * 136657) + j17;
                    long j25 = j18 - (jH11 * 683901);
                    long j26 = (jI11 * 666643) + jH5;
                    long j27 = (jI11 * 470296) + j20;
                    long j28 = (jI11 * 654183) + j21;
                    long j29 = j22 - (jI11 * 997805);
                    long j30 = (jI11 * 136657) + j23;
                    long j31 = j24 - (jI11 * 683901);
                    long j32 = (jI10 * 666643) + jH4;
                    long j33 = (jI10 * 470296) + j26;
                    long j34 = (jI10 * 654183) + j27;
                    long j35 = j28 - (jI10 * 997805);
                    long j36 = (jI10 * 136657) + j29;
                    long j37 = j30 - (jI10 * 683901);
                    long j38 = (jH10 * 666643) + jI4;
                    long j39 = (jH10 * 470296) + j32;
                    long j40 = (jH10 * 654183) + j33;
                    long j41 = j34 - (jH10 * 997805);
                    long j42 = (jH10 * 136657) + j35;
                    long j43 = j36 - (jH10 * 683901);
                    long j44 = (j38 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j45 = j39 + j44;
                    long j46 = j38 - (j44 << 21);
                    long j47 = (j40 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j48 = j41 + j47;
                    long j49 = j40 - (j47 << 21);
                    long j50 = (j42 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j51 = j43 + j50;
                    long j52 = j42 - (j50 << 21);
                    long j53 = (j37 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j54 = j31 + j53;
                    long j55 = j37 - (j53 << 21);
                    long j56 = (j25 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j57 = j19 + j56;
                    long j58 = j25 - (j56 << 21);
                    long j59 = (j13 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j60 = jI9 + j59;
                    long j61 = j13 - (j59 << 21);
                    long j62 = (j45 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j63 = j49 + j62;
                    long j64 = j45 - (j62 << 21);
                    long j65 = (j48 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j66 = j52 + j65;
                    long j67 = j48 - (j65 << 21);
                    long j68 = (j51 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j69 = j55 + j68;
                    long j70 = j51 - (j68 << 21);
                    long j71 = (j54 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j72 = j58 + j71;
                    long j73 = j54 - (j71 << 21);
                    long j74 = (j57 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j75 = j61 + j74;
                    long j76 = j57 - (j74 << 21);
                    long j77 = (j60 * 666643) + jH3;
                    long j78 = (j60 * 470296) + j46;
                    long j79 = (j60 * 654183) + j64;
                    long j80 = j63 - (j60 * 997805);
                    long j81 = (j60 * 136657) + j67;
                    long j82 = j66 - (j60 * 683901);
                    long j83 = (j75 * 666643) + jI3;
                    long j84 = (j75 * 470296) + j77;
                    long j85 = (j75 * 654183) + j78;
                    long j86 = j79 - (j75 * 997805);
                    long j87 = (j75 * 136657) + j80;
                    long j88 = j81 - (j75 * 683901);
                    long j89 = (j76 * 666643) + jI2;
                    long j90 = (j76 * 470296) + j83;
                    long j91 = (j76 * 654183) + j84;
                    long j92 = (j76 * 136657) + j86;
                    long j93 = j87 - (j76 * 683901);
                    long j94 = (j72 * 666643) + jH2;
                    long j95 = (j72 * 470296) + j89;
                    long j96 = (j72 * 654183) + j90;
                    long j97 = (j72 * 136657) + (j85 - (j76 * 997805));
                    long j98 = (j73 * 666643) + jI;
                    long j99 = (j73 * 470296) + j94;
                    long j100 = (j73 * 654183) + j95;
                    long j101 = j96 - (j73 * 997805);
                    long j102 = (j73 * 136657) + (j91 - (j72 * 997805));
                    long j103 = j97 - (j73 * 683901);
                    long j104 = (j69 * 666643) + jH;
                    long j105 = (j69 * 470296) + j98;
                    long j106 = (j69 * 654183) + j99;
                    long j107 = j100 - (j69 * 997805);
                    long j108 = (j69 * 136657) + j101;
                    long j109 = j102 - (j69 * 683901);
                    long j110 = (j104 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j111 = j105 + j110;
                    long j112 = j104 - (j110 << 21);
                    long j113 = (j106 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j114 = j107 + j113;
                    long j115 = j106 - (j113 << 21);
                    long j116 = (j108 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j117 = j109 + j116;
                    long j118 = j108 - (j116 << 21);
                    long j119 = (j103 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j120 = (j92 - (j72 * 683901)) + j119;
                    long j121 = j103 - (j119 << 21);
                    long j122 = (j93 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j123 = j88 + j122;
                    long j124 = j93 - (j122 << 21);
                    long j125 = (j82 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j126 = j70 + j125;
                    long j127 = j82 - (j125 << 21);
                    long j128 = (j111 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j129 = j115 + j128;
                    long j130 = j111 - (j128 << 21);
                    long j131 = (j114 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j132 = j118 + j131;
                    long j133 = j114 - (j131 << 21);
                    long j134 = (j117 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j135 = j121 + j134;
                    long j136 = j117 - (j134 << 21);
                    long j137 = (j120 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j138 = j124 + j137;
                    long j139 = j120 - (j137 << 21);
                    long j140 = (j123 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j141 = j127 + j140;
                    long j142 = j123 - (j140 << 21);
                    long j143 = (j126 + androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                    long j144 = (j143 * 666643) + j112;
                    long j145 = (j143 * 136657) + j132;
                    long j146 = j144 >> 21;
                    long j147 = (j143 * 470296) + j130 + j146;
                    long j148 = j144 - (j146 << 21);
                    long j149 = j147 >> 21;
                    long j150 = (j143 * 654183) + j129 + j149;
                    long j151 = j147 - (j149 << 21);
                    long j152 = j150 >> 21;
                    long j153 = (j133 - (j143 * 997805)) + j152;
                    long j154 = j150 - (j152 << 21);
                    long j155 = j153 >> 21;
                    long j156 = j145 + j155;
                    long j157 = j153 - (j155 << 21);
                    long j158 = j156 >> 21;
                    long j159 = (j136 - (j143 * 683901)) + j158;
                    long j160 = j156 - (j158 << 21);
                    long j161 = j159 >> 21;
                    long j162 = j135 + j161;
                    long j163 = j159 - (j161 << 21);
                    long j164 = j162 >> 21;
                    long j165 = j139 + j164;
                    long j166 = j162 - (j164 << 21);
                    long j167 = j165 >> 21;
                    long j168 = j138 + j167;
                    long j169 = j165 - (j167 << 21);
                    long j170 = j168 >> 21;
                    long j171 = j142 + j170;
                    long j172 = j168 - (j170 << 21);
                    long j173 = j171 >> 21;
                    long j174 = j141 + j173;
                    long j175 = j171 - (j173 << 21);
                    long j176 = j174 >> 21;
                    long j177 = (j126 - (j143 << 21)) + j176;
                    long j178 = j174 - (j176 << 21);
                    long j179 = j177 >> 21;
                    long j180 = j177 - (j179 << 21);
                    long j181 = (666643 * j179) + j148;
                    long j182 = (654183 * j179) + j154;
                    long j183 = j157 - (997805 * j179);
                    long j184 = (136657 * j179) + j160;
                    long j185 = j163 - (j179 * 683901);
                    long j186 = j181 >> 21;
                    long j187 = (470296 * j179) + j151 + j186;
                    long j188 = j181 - (j186 << 21);
                    long j189 = j187 >> 21;
                    long j190 = j182 + j189;
                    long j191 = j187 - (j189 << 21);
                    long j192 = j190 >> 21;
                    long j193 = j183 + j192;
                    long j194 = j190 - (j192 << 21);
                    long j195 = j193 >> 21;
                    long j196 = j184 + j195;
                    long j197 = j193 - (j195 << 21);
                    long j198 = j196 >> 21;
                    long j199 = j185 + j198;
                    long j200 = j196 - (j198 << 21);
                    long j201 = j199 >> 21;
                    long j202 = j166 + j201;
                    long j203 = j199 - (j201 << 21);
                    long j204 = j202 >> 21;
                    long j205 = j169 + j204;
                    long j206 = j202 - (j204 << 21);
                    long j207 = j205 >> 21;
                    long j208 = j172 + j207;
                    long j209 = j205 - (j207 << 21);
                    long j210 = j208 >> 21;
                    long j211 = j175 + j210;
                    long j212 = j208 - (j210 << 21);
                    long j213 = j211 >> 21;
                    long j214 = j178 + j213;
                    long j215 = j211 - (j213 << 21);
                    long j216 = j214 >> 21;
                    long j217 = j180 + j216;
                    long j218 = j214 - (j216 << 21);
                    bArrDigest[0] = (byte) j188;
                    bArrDigest[1] = (byte) (j188 >> 8);
                    bArrDigest[2] = (byte) ((j188 >> 16) | (j191 << 5));
                    bArrDigest[3] = (byte) (j191 >> 3);
                    bArrDigest[4] = (byte) (j191 >> 11);
                    bArrDigest[5] = (byte) ((j191 >> 19) | (j194 << 2));
                    bArrDigest[6] = (byte) (j194 >> 6);
                    bArrDigest[7] = (byte) ((j194 >> 14) | (j197 << 7));
                    bArrDigest[8] = (byte) (j197 >> 1);
                    bArrDigest[9] = (byte) (j197 >> 9);
                    bArrDigest[10] = (byte) ((j197 >> 17) | (j200 << 4));
                    bArrDigest[11] = (byte) (j200 >> 4);
                    bArrDigest[12] = (byte) (j200 >> 12);
                    bArrDigest[13] = (byte) ((j200 >> 20) | (j203 << 1));
                    bArrDigest[14] = (byte) (j203 >> 7);
                    bArrDigest[15] = (byte) ((j203 >> 15) | (j206 << 6));
                    bArrDigest[16] = (byte) (j206 >> 2);
                    bArrDigest[17] = (byte) (j206 >> 10);
                    bArrDigest[18] = (byte) ((j206 >> 18) | (j209 << 3));
                    bArrDigest[19] = (byte) (j209 >> 5);
                    bArrDigest[20] = (byte) (j209 >> 13);
                    bArrDigest[21] = (byte) j212;
                    bArrDigest[22] = (byte) (j212 >> 8);
                    bArrDigest[23] = (byte) ((j212 >> 16) | (j215 << 5));
                    bArrDigest[24] = (byte) (j215 >> 3);
                    bArrDigest[25] = (byte) (j215 >> 11);
                    bArrDigest[26] = (byte) ((j215 >> 19) | (j218 << 2));
                    bArrDigest[27] = (byte) (j218 >> 6);
                    bArrDigest[28] = (byte) ((j218 >> 14) | (j217 << 7));
                    bArrDigest[29] = (byte) (j217 >> 1);
                    bArrDigest[30] = (byte) (j217 >> 9);
                    bArrDigest[31] = (byte) (j217 >> 17);
                    long[] jArr2 = new long[10];
                    long[] jArrG = B4.k.g(bArr5);
                    long[] jArr3 = new long[10];
                    jArr3[0] = 1;
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    long[] jArr8 = new long[10];
                    B4.k.n(jArr5, jArrG);
                    B4.k.j(jArr6, jArr5, B4.l.f710a);
                    B4.k.p(jArr5, jArr5, jArr3);
                    B4.k.q(jArr6, jArr6, jArr3);
                    long[] jArr9 = new long[10];
                    B4.k.n(jArr9, jArr6);
                    B4.k.j(jArr9, jArr9, jArr6);
                    B4.k.n(jArr2, jArr9);
                    B4.k.j(jArr2, jArr2, jArr6);
                    B4.k.j(jArr2, jArr2, jArr5);
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    long[] jArr12 = new long[10];
                    B4.k.n(jArr10, jArr2);
                    B4.k.n(jArr11, jArr10);
                    B4.k.n(jArr11, jArr11);
                    B4.k.j(jArr11, jArr2, jArr11);
                    B4.k.j(jArr10, jArr10, jArr11);
                    B4.k.n(jArr10, jArr10);
                    B4.k.j(jArr10, jArr11, jArr10);
                    B4.k.n(jArr11, jArr10);
                    for (int i11 = 1; i11 < 5; i11++) {
                        B4.k.n(jArr11, jArr11);
                    }
                    B4.k.j(jArr10, jArr11, jArr10);
                    B4.k.n(jArr11, jArr10);
                    for (int i12 = 1; i12 < 10; i12++) {
                        B4.k.n(jArr11, jArr11);
                    }
                    B4.k.j(jArr11, jArr11, jArr10);
                    B4.k.n(jArr12, jArr11);
                    for (int i13 = 1; i13 < 20; i13++) {
                        B4.k.n(jArr12, jArr12);
                    }
                    B4.k.j(jArr11, jArr12, jArr11);
                    B4.k.n(jArr11, jArr11);
                    for (int i14 = 1; i14 < 10; i14++) {
                        B4.k.n(jArr11, jArr11);
                    }
                    B4.k.j(jArr10, jArr11, jArr10);
                    B4.k.n(jArr11, jArr10);
                    for (int i15 = 1; i15 < 50; i15++) {
                        B4.k.n(jArr11, jArr11);
                    }
                    B4.k.j(jArr11, jArr11, jArr10);
                    B4.k.n(jArr12, jArr11);
                    for (int i16 = 1; i16 < 100; i16++) {
                        B4.k.n(jArr12, jArr12);
                    }
                    B4.k.j(jArr11, jArr12, jArr11);
                    B4.k.n(jArr11, jArr11);
                    for (int i17 = 1; i17 < 50; i17++) {
                        B4.k.n(jArr11, jArr11);
                    }
                    B4.k.j(jArr10, jArr11, jArr10);
                    B4.k.n(jArr10, jArr10);
                    B4.k.n(jArr10, jArr10);
                    B4.k.j(jArr2, jArr10, jArr2);
                    B4.k.j(jArr2, jArr2, jArr9);
                    B4.k.j(jArr2, jArr2, jArr5);
                    B4.k.n(jArr7, jArr2);
                    B4.k.j(jArr7, jArr7, jArr6);
                    B4.k.p(jArr8, jArr7, jArr5);
                    if (B4.k.a(jArr8)) {
                        B4.k.q(jArr8, jArr7, jArr5);
                        if (B4.k.a(jArr8)) {
                            throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        B4.k.j(jArr2, jArr2, B4.l.f712c);
                    }
                    if (!B4.k.a(jArr2) && ((bArr5[31] & 255) >> 7) != 0) {
                        throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((B4.k.d(jArr2)[0] & 1) == ((bArr5[31] & 255) >> 7)) {
                        for (int i18 = 0; i18 < 10; i18++) {
                            jArr2[i18] = -jArr2[i18];
                        }
                    }
                    B4.k.j(jArr4, jArr2, jArrG);
                    B4.i[] iVarArr = new B4.i[8];
                    iVarArr[0] = new B4.i(new B4.j(new android.support.v4.media.session.q(jArr2, jArrG, jArr3, 1), jArr4));
                    android.support.v4.media.session.q qVar2 = new android.support.v4.media.session.q(1);
                    long[] jArr13 = new long[10];
                    B4.j jVar = new B4.j(qVar2, jArr13);
                    long[] jArr14 = new long[10];
                    long[] jArr15 = (long[]) qVar2.f15617i;
                    B4.k.n(jArr15, jArr2);
                    long[] jArr16 = (long[]) qVar2.f15618k;
                    B4.k.n(jArr16, jArrG);
                    B4.k.n(jArr13, jArr3);
                    B4.k.q(jArr13, jArr13, jArr13);
                    long[] jArr17 = (long[]) qVar2.j;
                    B4.k.q(jArr17, jArr2, jArrG);
                    B4.k.n(jArr14, jArr17);
                    B4.k.q(jArr17, jArr16, jArr15);
                    B4.k.p(jArr16, jArr16, jArr15);
                    B4.k.p(jArr15, jArr14, jArr17);
                    B4.k.p(jArr13, jArr13, jArr16);
                    B4.j jVar2 = new B4.j(jVar);
                    for (int i19 = 1; i19 < 8; i19++) {
                        B4.k.b(jVar, jVar2, iVarArr[i19 - 1]);
                        iVarArr[i19] = new B4.i(new B4.j(jVar));
                    }
                    byte[] bArrM = B4.k.m(bArrDigest);
                    byte[] bArrM2 = B4.k.m(bArrCopyOfRange);
                    B4.j jVar3 = new B4.j(0);
                    B4.j jVar4 = new B4.j(1);
                    int i20 = 255;
                    while (i20 >= 0 && bArrM[i20] == 0 && bArrM2[i20] == 0) {
                        i20--;
                    }
                    while (true) {
                        jArr = jVar3.f703b;
                        qVar = jVar3.f702a;
                        if (i20 < 0) {
                            break;
                        }
                        long[] jArr18 = new long[10];
                        long[] jArr19 = new long[10];
                        long[] jArr20 = new long[10];
                        B4.k.j(jArr18, (long[]) qVar.f15617i, jArr);
                        long[] jArr21 = (long[]) qVar.j;
                        long[] jArr22 = (long[]) qVar.f15618k;
                        B4.k.j(jArr19, jArr21, jArr22);
                        B4.k.j(jArr20, jArr22, jArr);
                        long[] jArr23 = new long[10];
                        long[] jArr24 = (long[]) qVar.f15617i;
                        B4.k.n(jArr24, jArr18);
                        B4.k.n(jArr22, jArr19);
                        B4.k.n(jArr, jArr20);
                        B4.k.q(jArr, jArr, jArr);
                        B4.k.q(jArr21, jArr18, jArr19);
                        B4.k.n(jArr23, jArr21);
                        B4.k.q(jArr21, jArr22, jArr24);
                        B4.k.p(jArr22, jArr22, jArr24);
                        B4.k.p(jArr24, jArr23, jArr21);
                        B4.k.p(jArr, jArr, jArr22);
                        byte b9 = bArrM[i20];
                        if (b9 > 0) {
                            B4.j.a(jVar4, jVar3);
                            B4.k.b(jVar3, jVar4, iVarArr[bArrM[i20] / 2]);
                        } else if (b9 < 0) {
                            B4.j.a(jVar4, jVar3);
                            B4.k.o(jVar3, jVar4, iVarArr[(-bArrM[i20]) / 2]);
                        }
                        byte b10 = bArrM2[i20];
                        if (b10 > 0) {
                            B4.j.a(jVar4, jVar3);
                            B4.k.b(jVar3, jVar4, B4.l.f714e[bArrM2[i20] / 2]);
                        } else if (b10 < 0) {
                            B4.j.a(jVar4, jVar3);
                            B4.k.o(jVar3, jVar4, B4.l.f714e[(-bArrM2[i20]) / 2]);
                        }
                        i20--;
                    }
                    long[] jArr25 = new long[10];
                    long[] jArr26 = new long[10];
                    long[] jArr27 = new long[10];
                    B4.k.j(jArr25, (long[]) qVar.f15617i, jArr);
                    long[] jArr28 = (long[]) qVar.j;
                    long[] jArr29 = (long[]) qVar.f15618k;
                    B4.k.j(jArr26, jArr28, jArr29);
                    B4.k.j(jArr27, jArr29, jArr);
                    long[] jArr30 = new long[10];
                    long[] jArr31 = new long[10];
                    long[] jArr32 = new long[10];
                    long[] jArr33 = new long[10];
                    long[] jArr34 = new long[10];
                    long[] jArr35 = new long[10];
                    long[] jArr36 = new long[10];
                    long[] jArr37 = new long[10];
                    long[] jArr38 = new long[10];
                    long[] jArr39 = new long[10];
                    long[] jArr40 = new long[10];
                    long[] jArr41 = new long[10];
                    long[] jArr42 = new long[10];
                    B4.k.n(jArr33, jArr27);
                    B4.k.n(jArr42, jArr33);
                    B4.k.n(jArr41, jArr42);
                    B4.k.j(jArr34, jArr41, jArr27);
                    B4.k.j(jArr35, jArr34, jArr33);
                    B4.k.n(jArr41, jArr35);
                    B4.k.j(jArr36, jArr41, jArr34);
                    B4.k.n(jArr41, jArr36);
                    B4.k.n(jArr42, jArr41);
                    B4.k.n(jArr41, jArr42);
                    B4.k.n(jArr42, jArr41);
                    B4.k.n(jArr41, jArr42);
                    B4.k.j(jArr37, jArr41, jArr36);
                    B4.k.n(jArr41, jArr37);
                    B4.k.n(jArr42, jArr41);
                    for (int i21 = 2; i21 < 10; i21 += 2) {
                        B4.k.n(jArr41, jArr42);
                        B4.k.n(jArr42, jArr41);
                    }
                    B4.k.j(jArr38, jArr42, jArr37);
                    B4.k.n(jArr41, jArr38);
                    B4.k.n(jArr42, jArr41);
                    for (int i22 = 2; i22 < 20; i22 += 2) {
                        B4.k.n(jArr41, jArr42);
                        B4.k.n(jArr42, jArr41);
                    }
                    B4.k.j(jArr41, jArr42, jArr38);
                    B4.k.n(jArr42, jArr41);
                    B4.k.n(jArr41, jArr42);
                    for (int i23 = 2; i23 < 10; i23 += 2) {
                        B4.k.n(jArr42, jArr41);
                        B4.k.n(jArr41, jArr42);
                    }
                    B4.k.j(jArr39, jArr41, jArr37);
                    B4.k.n(jArr41, jArr39);
                    B4.k.n(jArr42, jArr41);
                    for (int i24 = 2; i24 < 50; i24 += 2) {
                        B4.k.n(jArr41, jArr42);
                        B4.k.n(jArr42, jArr41);
                    }
                    B4.k.j(jArr40, jArr42, jArr39);
                    B4.k.n(jArr42, jArr40);
                    B4.k.n(jArr41, jArr42);
                    for (int i25 = 2; i25 < 100; i25 += 2) {
                        B4.k.n(jArr42, jArr41);
                        B4.k.n(jArr41, jArr42);
                    }
                    B4.k.j(jArr42, jArr41, jArr40);
                    B4.k.n(jArr41, jArr42);
                    B4.k.n(jArr42, jArr41);
                    for (int i26 = 2; i26 < 50; i26 += 2) {
                        B4.k.n(jArr41, jArr42);
                        B4.k.n(jArr42, jArr41);
                    }
                    B4.k.j(jArr41, jArr42, jArr39);
                    B4.k.n(jArr42, jArr41);
                    B4.k.n(jArr41, jArr42);
                    B4.k.n(jArr42, jArr41);
                    B4.k.n(jArr41, jArr42);
                    B4.k.n(jArr42, jArr41);
                    B4.k.j(jArr30, jArr42, jArr35);
                    B4.k.j(jArr31, jArr25, jArr30);
                    B4.k.j(jArr32, jArr26, jArr30);
                    byte[] bArrD = B4.k.d(jArr32);
                    bArrD[31] = (byte) (bArrD[31] ^ ((B4.k.d(jArr31)[0] & 1) << 7));
                    for (int i27 = 0; i27 < 32; i27++) {
                        if (bArrD[i27] != bArr[i27]) {
                            break;
                        }
                    }
                    return;
                }
                i3--;
                bArr3 = bArr;
            }
        }
        throw new java.security.GeneralSecurityException("Signature check failed.");
    }
}
