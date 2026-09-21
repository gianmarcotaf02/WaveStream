package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements java.io.Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f23592b;

    public E() {
    }

    public E(byte b9, java.lang.Object obj) {
        this.f23591a = b9;
        this.f23592b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b9 = this.f23591a;
        java.lang.Object obj = this.f23592b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                objectOutput.writeUTF(((j$.time.chrono.AbstractC2494a) obj).s());
                return;
            case 2:
                j$.time.chrono.C2499f c2499f = (j$.time.chrono.C2499f) obj;
                objectOutput.writeObject(c2499f.f23602a);
                objectOutput.writeObject(c2499f.f23603b);
                return;
            case 3:
                j$.time.chrono.k kVar = (j$.time.chrono.k) obj;
                objectOutput.writeObject(kVar.f23611a);
                objectOutput.writeObject(kVar.f23612b);
                objectOutput.writeObject(kVar.f23613c);
                return;
            case 4:
                j$.time.chrono.x xVar = (j$.time.chrono.x) obj;
                xVar.getClass();
                objectOutput.writeInt(xVar.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(xVar.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(xVar.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((j$.time.chrono.y) obj).f23640a);
                return;
            case 6:
                j$.time.chrono.q qVar = (j$.time.chrono.q) obj;
                objectOutput.writeObject(qVar.f23624a);
                objectOutput.writeInt(qVar.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(qVar.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(qVar.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                j$.time.chrono.C c9 = (j$.time.chrono.C) obj;
                c9.getClass();
                objectOutput.writeInt(c9.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(c9.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(c9.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j$.time.chrono.I i3 = (j$.time.chrono.I) obj;
                i3.getClass();
                objectOutput.writeInt(i3.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(i3.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(i3.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                j$.time.chrono.C2500g c2500g = (j$.time.chrono.C2500g) obj;
                objectOutput.writeUTF(c2500g.f23605a.s());
                objectOutput.writeInt(c2500g.f23606b);
                objectOutput.writeInt(c2500g.f23607c);
                objectOutput.writeInt(c2500g.f23608d);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.lang.Object objO;
        byte b9 = objectInput.readByte();
        this.f23591a = b9;
        switch (b9) {
            case 1:
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.chrono.AbstractC2494a.f23598a;
                objO = j$.time.chrono.l.O(objectInput.readUTF());
                break;
            case 2:
                objO = ((j$.time.chrono.ChronoLocalDate) objectInput.readObject()).M((j$.time.LocalTime) objectInput.readObject());
                break;
            case 3:
                objO = ((j$.time.chrono.InterfaceC2497d) objectInput.readObject()).H((j$.time.ZoneOffset) objectInput.readObject()).I((j$.time.ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.LocalDate localDate = j$.time.chrono.x.f23634d;
                int i3 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                j$.time.chrono.v.f23632c.getClass();
                objO = new j$.time.chrono.x(j$.time.LocalDate.of(i3, b10, b11));
                break;
            case 5:
                j$.time.chrono.y yVar = j$.time.chrono.y.f23638d;
                objO = j$.time.chrono.y.s(objectInput.readByte());
                break;
            case 6:
                j$.time.chrono.o oVar = (j$.time.chrono.o) objectInput.readObject();
                int i9 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                oVar.getClass();
                objO = new j$.time.chrono.q(oVar, i9, b12, b13);
                break;
            case 7:
                int i10 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                j$.time.chrono.A.f23587c.getClass();
                objO = new j$.time.chrono.C(j$.time.LocalDate.of(i10 + 1911, b14, b15));
                break;
            case 8:
                int i11 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                j$.time.chrono.G.f23594c.getClass();
                objO = new j$.time.chrono.I(j$.time.LocalDate.of(i11 - 543, b16, b17));
                break;
            case 9:
                int i12 = j$.time.chrono.C2500g.f23604e;
                objO = new j$.time.chrono.C2500g(j$.time.chrono.l.O(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
        this.f23592b = objO;
    }

    private java.lang.Object readResolve() {
        return this.f23592b;
    }
}
