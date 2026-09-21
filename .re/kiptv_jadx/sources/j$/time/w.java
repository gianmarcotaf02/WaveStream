package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends j$.time.ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23832d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f23834c;

    public static j$.time.w Y(java.lang.String str, boolean z6) {
        j$.time.zone.f fVarA;
        java.util.Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i3 == 0) && ((cCharAt < '0' || cCharAt > '9' || i3 == 0) && ((cCharAt != '~' || i3 == 0) && ((cCharAt != '.' || i3 == 0) && ((cCharAt != '_' || i3 == 0) && ((cCharAt != '+' || i3 == 0) && (cCharAt != '-' || i3 == 0))))))))) {
                    throw new j$.time.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e6) {
                if (z6) {
                    throw e6;
                }
                fVarA = null;
            }
            return new j$.time.w(str, fVarA);
        }
        throw new j$.time.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public w(java.lang.String str, j$.time.zone.f fVar) {
        this.f23833b = str;
        this.f23834c = fVar;
    }

    @Override // j$.time.ZoneId
    public final java.lang.String s() {
        return this.f23833b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f r() {
        j$.time.zone.f fVar = this.f23834c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f23833b);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 7, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void W(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f23833b);
    }
}
