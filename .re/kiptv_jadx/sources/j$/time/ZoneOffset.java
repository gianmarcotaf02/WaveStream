package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoneOffset extends j$.time.ZoneId implements j$.time.temporal.TemporalAccessor, j$.time.temporal.n, java.lang.Comparable<j$.time.ZoneOffset>, java.io.Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient java.lang.String f23581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23577d = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23578e = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    public static final j$.time.ZoneOffset UTC = ofTotalSeconds(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.ZoneOffset f23579f = ofTotalSeconds(-64800);
    public static final j$.time.ZoneOffset g = ofTotalSeconds(64800);

    @Override // java.lang.Comparable
    public final int compareTo(j$.time.ZoneOffset zoneOffset) {
        return zoneOffset.f23580b - this.f23580b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    public static j$.time.ZoneOffset Y(java.lang.String str) {
        int iB0;
        int iB1;
        int iB2;
        char cCharAt;
        java.util.Objects.requireNonNull(str, "offsetId");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) f23578e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 3, false);
                } else if (length == 6) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 4, true);
                } else if (length == 7) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 3, false);
                    iB2 = b0(str, 5, false);
                } else if (length == 9) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 4, true);
                    iB2 = b0(str, 7, true);
                } else {
                    throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iB2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return ofHoursMinutesSeconds(-iB0, -iB1, -iB2);
            }
            return ofHoursMinutesSeconds(iB0, iB1, iB2);
        }
        iB0 = b0(str, 1, false);
        iB1 = 0;
        iB2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return ofHoursMinutesSeconds(-iB0, -iB1, -iB2);
        }
        return ofHoursMinutesSeconds(iB0, iB1, iB2);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f r() {
        return new j$.time.zone.f(this);
    }

    public static int b0(java.lang.String str, int i3, boolean z6) {
        if (z6 && str.charAt(i3 - 1) != ':') {
            throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((java.lang.Object) str));
        }
        char cCharAt = str.charAt(i3);
        char cCharAt2 = str.charAt(i3 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((java.lang.Object) str));
    }

    public static j$.time.ZoneOffset from(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) temporalAccessor.b(j$.time.temporal.r.f23805d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new j$.time.DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static j$.time.ZoneOffset ofHoursMinutesSeconds(int i3, int i9, int i10) {
        if (i3 < -18 || i3 > 18) {
            throw new j$.time.DateTimeException("Zone offset hours not in valid range: value " + i3 + " is not in the range -18 to 18");
        }
        if (i3 > 0) {
            if (i9 < 0 || i10 < 0) {
                throw new j$.time.DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i3 < 0) {
            if (i9 > 0 || i10 > 0) {
                throw new j$.time.DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i9 > 0 && i10 < 0) || (i9 < 0 && i10 > 0)) {
            throw new j$.time.DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i9 < -59 || i9 > 59) {
            throw new j$.time.DateTimeException("Zone offset minutes not in valid range: value " + i9 + " is not in the range -59 to 59");
        }
        if (i10 < -59 || i10 > 59) {
            throw new j$.time.DateTimeException("Zone offset seconds not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (java.lang.Math.abs(i3) == 18 && (i9 | i10) != 0) {
            throw new j$.time.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return ofTotalSeconds((i9 * 60) + (i3 * 3600) + i10);
    }

    public static j$.time.ZoneOffset ofTotalSeconds(int i3) {
        if (i3 < -64800 || i3 > 64800) {
            throw new j$.time.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i3 % org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f23577d;
            j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new j$.time.ZoneOffset(i3));
            j$.time.ZoneOffset zoneOffset2 = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
            f23578e.putIfAbsent(zoneOffset2.f23581c, zoneOffset2);
            return zoneOffset2;
        }
        return new j$.time.ZoneOffset(i3);
    }

    public ZoneOffset(int i3) {
        java.lang.String string;
        this.f23580b = i3;
        if (i3 == 0) {
            string = "Z";
        } else {
            int iAbs = java.lang.Math.abs(i3);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i9 = iAbs / 3600;
            int i10 = (iAbs / 60) % 60;
            sb.append(i3 < 0 ? "-" : "+");
            sb.append(i9 < 10 ? "0" : "");
            sb.append(i9);
            sb.append(i10 < 10 ? ":0" : ":");
            sb.append(i10);
            int i11 = iAbs % 60;
            if (i11 != 0) {
                sb.append(i11 < 10 ? ":0" : ":");
                sb.append(i11);
            }
            string = sb.toString();
        }
        this.f23581c = string;
    }

    public int getTotalSeconds() {
        return this.f23580b;
    }

    @Override // j$.time.ZoneId
    public final java.lang.String s() {
        return this.f23581c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f23580b;
        }
        if (qVar == null) {
            return super.l(qVar).a(f(qVar), qVar);
        }
        throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f23580b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.r.f23805d || temporalQuery == j$.time.temporal.r.f23806e) ? this : super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.f23580b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneOffset) {
            if (this.f23580b == ((j$.time.ZoneOffset) obj).f23580b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f23580b;
    }

    @Override // j$.time.ZoneId
    public java.lang.String toString() {
        return this.f23581c;
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 8, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void W(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeByte(8);
        d0(objectOutput);
    }

    public final void d0(java.io.DataOutput dataOutput) throws java.io.IOException {
        int i3 = this.f23580b;
        int i9 = i3 % org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0 ? i3 / org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR : 127;
        dataOutput.writeByte(i9);
        if (i9 == 127) {
            dataOutput.writeInt(i3);
        }
    }

    public static j$.time.ZoneOffset c0(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b9 = objectInput.readByte();
        return b9 == 127 ? ofTotalSeconds(objectInput.readInt()) : ofTotalSeconds(b9 * 900);
    }
}
