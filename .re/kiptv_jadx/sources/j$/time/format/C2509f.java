package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2509f extends j$.time.format.j {
    public final boolean g;

    @Override // j$.time.format.j
    public final boolean b(j$.time.format.v vVar) {
        return vVar.f23739c && this.f23699b == this.f23700c && !this.g;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        int i9 = (vVar.f23739c || b(vVar)) ? this.f23699b : 0;
        int i10 = (vVar.f23739c || b(vVar)) ? this.f23700c : 9;
        int length = charSequence.length();
        if (i3 != length) {
            j$.time.format.DateTimeFormatter dateTimeFormatter = vVar.f23737a;
            if (this.g) {
                char cCharAt = charSequence.charAt(i3);
                dateTimeFormatter.f23666c.getClass();
                if (cCharAt == '.') {
                    i3++;
                } else if (i9 > 0) {
                    return ~i3;
                }
            }
            int i11 = i3;
            int i12 = i9 + i11;
            if (i12 > length) {
                return ~i11;
            }
            int iMin = java.lang.Math.min(i10 + i11, length);
            int i13 = 0;
            int i14 = i11;
            while (i14 < iMin) {
                int i15 = i14 + 1;
                char cCharAt2 = charSequence.charAt(i14);
                dateTimeFormatter.f23666c.getClass();
                int i16 = cCharAt2 - '0';
                if (i16 < 0 || i16 > 9) {
                    i16 = -1;
                }
                if (i16 < 0) {
                    if (i15 >= i12) {
                        break;
                    }
                    return ~i11;
                }
                i13 = (i13 * 10) + i16;
                i14 = i15;
            }
            java.math.BigDecimal bigDecimalMovePointLeft = new java.math.BigDecimal(i13).movePointLeft(i14 - i11);
            j$.time.temporal.u uVarB = this.f23698a.B();
            java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(uVarB.f23808a);
            return vVar.g(this.f23698a, bigDecimalMovePointLeft.multiply(java.math.BigDecimal.valueOf(uVarB.f23811d).subtract(bigDecimalValueOf).add(java.math.BigDecimal.ONE)).setScale(0, java.math.RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i11, i14);
        }
        if (i9 > 0) {
            return ~i3;
        }
        return i3;
    }

    public C2509f(j$.time.temporal.a aVar, int i3, int i9, boolean z6) {
        this(aVar, i3, i9, z6, 0);
        java.util.Objects.requireNonNull(aVar, "field");
        j$.time.temporal.u uVar = aVar.f23783b;
        if (uVar.f23808a != uVar.f23809b || uVar.f23810c != uVar.f23811d) {
            throw new java.lang.IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        if (i3 < 0 || i3 > 9) {
            throw new java.lang.IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i3);
        }
        if (i9 < 1 || i9 > 9) {
            throw new java.lang.IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i9);
        }
        if (i9 >= i3) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i9 + " < " + i3);
    }

    public C2509f(j$.time.temporal.q qVar, int i3, int i9, boolean z6, int i10) {
        super(qVar, i3, i9, j$.time.format.E.NOT_NEGATIVE, i10);
        this.g = z6;
    }

    @Override // j$.time.format.j
    public final j$.time.format.j d() {
        if (this.f23702e == -1) {
            return this;
        }
        return new j$.time.format.C2509f(this.f23698a, this.f23699b, this.f23700c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j$.time.format.j e(int i3) {
        return new j$.time.format.C2509f(this.f23698a, this.f23699b, this.f23700c, this.g, this.f23702e + i3);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC2508e
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        j$.time.temporal.q qVar = this.f23698a;
        java.lang.Long lA = xVar.a(qVar);
        if (lA == null) {
            return false;
        }
        j$.time.format.B b9 = xVar.f23747b.f23666c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarB = qVar.B();
        uVarB.b(jLongValue, qVar);
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(uVarB.f23808a);
        java.math.BigDecimal bigDecimalAdd = java.math.BigDecimal.valueOf(uVarB.f23811d).subtract(bigDecimalValueOf).add(java.math.BigDecimal.ONE);
        java.math.BigDecimal bigDecimalSubtract = java.math.BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.FLOOR;
        java.math.BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z6 = this.g;
        int i3 = this.f23699b;
        if (iScale != 0) {
            java.lang.String strSubstring = bigDecimal.setScale(java.lang.Math.min(java.lang.Math.max(bigDecimal.scale(), i3), this.f23700c), roundingMode).toPlainString().substring(2);
            b9.getClass();
            if (z6) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i3 <= 0) {
            return true;
        }
        if (z6) {
            b9.getClass();
            sb.append('.');
        }
        for (int i9 = 0; i9 < i3; i9++) {
            b9.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.j
    public final java.lang.String toString() {
        return "Fraction(" + this.f23698a + "," + this.f23699b + "," + this.f23700c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
