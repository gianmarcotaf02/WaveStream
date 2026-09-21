package androidx.media3.extractor.metadata.id3;

import androidx.media3.extractor.ts.PsExtractor;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.Z;

public final class Id3Util {
    private static final AbstractC2186b0 STANDARD_GENRES;

    static {
        Z z6 = AbstractC2186b0.f22868i;
        Object[] objArr = new Object[PsExtractor.AUDIO_STREAM];
        objArr[0] = "Blues";
        objArr[1] = "Classic Rock";
        objArr[2] = "Country";
        objArr[3] = "Dance";
        objArr[4] = "Disco";
        objArr[5] = "Funk";
        objArr[6] = "Grunge";
        objArr[7] = "Hip-Hop";
        objArr[8] = "Jazz";
        objArr[9] = "Metal";
        objArr[10] = "New Age";
        objArr[11] = "Oldies";
        System.arraycopy(new String[]{"Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"}, 0, objArr, 12, 180);
        AbstractC2230y.b(objArr, PsExtractor.AUDIO_STREAM);
        STANDARD_GENRES = AbstractC2186b0.r(objArr, PsExtractor.AUDIO_STREAM);
    }

    private Id3Util() {
    }

    public static String resolveV1Genre(int i3) {
        if (i3 < 0) {
            return null;
        }
        AbstractC2186b0 abstractC2186b0 = STANDARD_GENRES;
        if (i3 < abstractC2186b0.size()) {
            return (String) abstractC2186b0.get(i3);
        }
        return null;
    }
}
