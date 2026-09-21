package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
public final class Mp3InfoReplayGain implements androidx.media3.common.Metadata.Entry {
    public androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField field1;
    public androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField field2;
    public final float peak;

    public static final class GainField {
        public static final int NAME_AUDIOPHILE = 2;
        public static final int NAME_RADIO = 1;
        public static final int ORIGINATOR_ARTIST = 1;
        public static final int ORIGINATOR_REPLAYGAIN = 3;
        public static final int ORIGINATOR_SIMPLE_RMS = 4;
        public static final int ORIGINATOR_UNSET = 0;
        public static final int ORIGINATOR_USER = 2;
        public final float gain;
        public final int name;
        public final int originator;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Name {
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Originator {
        }

        private GainField(int i3, int i9, float f9) {
            this.name = i3;
            this.originator = i9;
            this.gain = f9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField parse(int i3) {
            int i9 = (i3 >> 13) & 7;
            if (i9 == 0) {
                return null;
            }
            return new androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField(i9, (i3 >> 10) & 7, ((i3 & 511) * ((i3 & 512) != 0 ? -1 : 1)) / 10.0f);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField)) {
                return false;
            }
            androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField = (androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField) obj;
            return this.name == gainField.name && this.originator == gainField.originator && java.lang.Float.compare(this.gain, gainField.gain) == 0;
        }

        public int hashCode() {
            return java.lang.Float.hashCode(this.gain) + (((this.name * 31) + this.originator) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainField{name=");
            sb.append(this.name);
            sb.append(", originator=");
            sb.append(this.originator);
            sb.append(", gain=");
            return p121o0.p.q(sb, this.gain, '}');
        }
    }

    private Mp3InfoReplayGain(float f9, androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField, androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField2) {
        this.peak = f9;
        this.field1 = gainField;
        this.field2 = gainField2;
    }

    public static androidx.media3.extractor.mp3.Mp3InfoReplayGain parse(float f9, int i3, int i9) {
        androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField = androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField.parse(i3);
        androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField2 = androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField.parse(i9);
        if (f9 <= 0.0f && gainField == null && gainField2 == null) {
            return null;
        }
        return new androidx.media3.extractor.mp3.Mp3InfoReplayGain(f9, gainField, gainField2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.extractor.mp3.Mp3InfoReplayGain)) {
            return false;
        }
        androidx.media3.extractor.mp3.Mp3InfoReplayGain mp3InfoReplayGain = (androidx.media3.extractor.mp3.Mp3InfoReplayGain) obj;
        return java.lang.Float.compare(this.peak, mp3InfoReplayGain.peak) == 0 && java.util.Objects.equals(this.field1, mp3InfoReplayGain.field1) && java.util.Objects.equals(this.field2, mp3InfoReplayGain.field2);
    }

    public int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.peak) * 31;
        androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField = this.field1;
        int iHashCode2 = (iHashCode + (gainField != null ? gainField.hashCode() : 0)) * 31;
        androidx.media3.extractor.mp3.Mp3InfoReplayGain.GainField gainField2 = this.field2;
        return iHashCode2 + (gainField2 != null ? gainField2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ReplayGain Xing/Info: peak=" + this.peak + ", field 1=" + this.field1 + ", field 2=" + this.field2;
    }
}
