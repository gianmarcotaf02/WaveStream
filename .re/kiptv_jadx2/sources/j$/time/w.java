package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;

public final class w extends ZoneId {

    public static final int f23832d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    public final String f23833b;

    public final transient j$.time.zone.f f23834c;

    public static w Y(String str, boolean z6) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i3 == 0) && ((cCharAt < '0' || cCharAt > '9' || i3 == 0) && ((cCharAt != '~' || i3 == 0) && ((cCharAt != '.' || i3 == 0) && ((cCharAt != '_' || i3 == 0) && ((cCharAt != '+' || i3 == 0) && (cCharAt != '-' || i3 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
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
            return new w(str, fVarA);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public w(String str, j$.time.zone.f fVar) {
        this.f23833b = str;
        this.f23834c = fVar;
    }

    @Override
    public final String s() {
        return this.f23833b;
    }

    @Override
    public final j$.time.zone.f r() {
        j$.time.zone.f fVar = this.f23834c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f23833b);
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final void W(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f23833b);
    }
}
