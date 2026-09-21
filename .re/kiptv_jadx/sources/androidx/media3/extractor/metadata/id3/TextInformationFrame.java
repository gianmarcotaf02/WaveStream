package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public final java.lang.String description;

    @java.lang.Deprecated
    public final java.lang.String value;
    public final p076i4.AbstractC2186b0 values;

    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        super(str);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!list.isEmpty());
        this.description = str2;
        p076i4.AbstractC2186b0 abstractC2186b0U = p076i4.AbstractC2186b0.u(list);
        this.values = abstractC2186b0U;
        this.value = (java.lang.String) abstractC2186b0U.get(0);
    }

    private static java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.TextInformationFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (androidx.media3.extractor.metadata.id3.TextInformationFrame) obj;
            if (java.util.Objects.equals(this.id, textInformationFrame.id) && java.util.Objects.equals(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iA = B2.a.a(527, 31, this.id);
        java.lang.String str = this.description;
        return this.values.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.id;
        str.getClass();
        byte b9 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b9 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b9 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b9 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b9 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b9 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b9 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b9 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b9 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b9 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b9 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b9 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b9 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b9 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b9 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b9 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b9 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b9 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b9 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b9 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b9 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b9 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b9 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b9 = 22;
                }
                break;
        }
        try {
            switch (b9) {
                case 0:
                case 10:
                    builder.setAlbumTitle((java.lang.CharSequence) this.values.get(0));
                    break;
                case 1:
                case 11:
                    builder.setComposer((java.lang.CharSequence) this.values.get(0));
                    break;
                case 2:
                case 13:
                    java.lang.String str2 = (java.lang.String) this.values.get(0);
                    builder.setRecordingMonth(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    builder.setArtist((java.lang.CharSequence) this.values.get(0));
                    break;
                case 4:
                case 19:
                    builder.setAlbumArtist((java.lang.CharSequence) this.values.get(0));
                    break;
                case 5:
                case 20:
                    builder.setConductor((java.lang.CharSequence) this.values.get(0));
                    break;
                case 6:
                case 21:
                    java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split((java.lang.String) this.values.get(0), "/");
                    builder.setTrackNumber(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 17:
                    builder.setTitle((java.lang.CharSequence) this.values.get(0));
                    break;
                case 8:
                case 16:
                    builder.setWriter((java.lang.CharSequence) this.values.get(0));
                    break;
                case 9:
                case 22:
                    builder.setRecordingYear(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.values.get(0))));
                    break;
                case 12:
                    java.lang.Integer numK = com.google.crypto.tink.shaded.protobuf.q0.K((java.lang.String) this.values.get(0));
                    if (numK != null) {
                        java.lang.String strResolveV1Genre = androidx.media3.extractor.metadata.id3.Id3Util.resolveV1Genre(numK.intValue());
                        if (strResolveV1Genre != null) {
                            builder.setGenre(strResolveV1Genre);
                        }
                    } else {
                        builder.setGenre((java.lang.CharSequence) this.values.get(0));
                    }
                    break;
                case 14:
                    java.util.List<java.lang.Integer> id3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate((java.lang.String) this.values.get(0));
                    int size = id3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(id3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(id3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(id3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    java.util.List<java.lang.Integer> id3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate((java.lang.String) this.values.get(0));
                    int size2 = id3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(id3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(id3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(id3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @java.lang.Deprecated
    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, p076i4.AbstractC2186b0.y(str3));
    }
}
