package S4;

/* JADX INFO: renamed from: S4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0874m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.List f9411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.List f9412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.List f9413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.Set f9414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.List f9415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O7.o f9416f;

    static {
        O7.p[] pVarArr = O7.p.f8061h;
        f9411a = p078i6.p.B0(new O7.o("^(?:Film|Cinema|Movie|Cine|Kino|Filme|Pelicula|Cinéma)\\s*(?:Prima Visione|First Run|Première)?\\s*[:\\-–—]\\s*", 0), new O7.o("^(?:PRIMA TV|Prima Visione|PREMIÈRE|ESTRENO|PREMIERE|ANTEPRIMA)\\s*[:\\-–—]?\\s*", 0), new O7.o("^(?:REPLICA|RERUN|REDIFFUSION|WIEDERHOLUNG)\\s*[:\\-–—]?\\s*", 0), new O7.o("^(?:NEW!?|NUOVO!?|LIVE!?|DIRETTA!?)\\s*[:\\-–—]?\\s*", 0));
        f9412b = p078i6.p.B0(new O7.o("\\s*S\\d{1,2}\\s*E\\d{1,3}.*$", 0), new O7.o("\\s*[-–—]?\\s*(?:Stagione|Season|Staffel|Saison|Temporada)\\s*\\d+\\s*(?:Ep\\.?|Episodio|Episode|Folge|Épisode)\\s*\\d+.*$", 0), new O7.o("\\s*[-–—]?\\s*(?:Ep\\.?|Episodio|Episode|Folge|Épisode)\\s*\\d+.*$", 0), new O7.o("\\s*\\(\\s*(?:Ep\\.?|Episodio|Episode)\\s*\\d+\\s*\\)", 0), new O7.o("\\s*[-–—]?\\s*(?:Pt\\.?|Part|Parte|Teil)\\s*\\d+\\s*$", 0));
        f9413c = p078i6.p.B0(new O7.o("\\s+delle\\s+\\d{1,2}(?:[:.]\\d{2})?\\s*$", 0), new O7.o("\\s+ore\\s+\\d{1,2}(?:[:.]\\d{2})?\\s*$", 0), new O7.o("\\s+h\\.?\\s*\\d{1,2}(?:[:.]\\d{2})?\\s*$", 0), new O7.o("\\s+[-–—]?\\s*\\d{1,2}:\\d{2}\\s*$"));
        f9414d = p078i6.m.F0(new java.lang.String[]{"tg1", "tg2", "tg3", "tg4", "tg5", "tgcom", "tgla7", "tg24", "telegiornale", "notiziario", "newscast", "journal", "journaal", "nachrichten", "telediario", "telejornal", "meteo", "weather", "météo", "wetter", "tiempo", "televendita", "televendite", "infomercial", "teleshopping", "qvc", "santa messa", "angelus", "rosario", "liturgia", "guida tv", "palinsesto", "programmi della sera", "monoscopio", "test card", "segnale orario"});
        f9415e = p078i6.p.B0("telegiornale", "notiziario", "newscast", "televendita", "teleshopping", "infomercial", "santa messa");
        f9416f = new O7.o("^[A-Z][\\w\\s]+\\s+(?:vs?\\.?|[-–—])\\s+[A-Z][\\w\\s]+$", 0);
    }
}
