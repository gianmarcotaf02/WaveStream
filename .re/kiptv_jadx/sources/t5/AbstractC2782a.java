package t5;

/* JADX INFO: renamed from: t5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2782a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.List f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f28121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Set f28122c;

    static {
        java.util.List listB0 = p078i6.p.B0(new t5.C2785b("people", "avatars.group.people", "People", p078i6.p.B0("avatar1", "avatar2", "avatar3", "avatar4", "avatar5", "avatar6", "avatar7", "avatar8", "avatar9", "avatar10", "avatar11", "avatar12", "avatar13", "avatar14", "avatar15", "avatar16", "avatar17", "avatar18", "avatar19", "avatar20", "avatar21", "avatar22", "avatar23", "avatar24"), false), new t5.C2785b("animals", "avatars.group.animals", "Animals", p078i6.p.B0("animals-bear", "animals-cat", "animals-dog", "animals-dolphin", "animals-eagle", "animals-elephant", "animals-fox", "animals-gorilla", "animals-lion", "animals-monkey", "animals-owl", "animals-panda", "animals-shark", "animals-squirrel", "animals-tiger", "animals-wolf"), false), new t5.C2785b("AOT", null, "Attack on Titan", p078i6.p.B0("AOT-annietitan", "AOT-armin", "AOT-eren", "AOT-erentitan", "AOT-erwin", "AOT-levi", "AOT-mikasa", "AOT-reinertitan", "AOT-ymir", "AOT-zeketitan"), true), new t5.C2785b("BlueL", null, "Blue Lock", p078i6.p.B0("BlueL-bachira", "BlueL-chigiri", "BlueL-isagi", "BlueL-kaiser", "BlueL-nagi", "BlueL-rin", "BlueL-ryosuke", "BlueL-sae", "BlueL-shido"), true), new t5.C2785b("DNote", null, "Death Note", p078i6.p.B0("DNote-L", "DNote-light", "DNote-misa", "DNote-misora", "DNote-near", "DNote-rem", "DNote-ryuk", "DNote-watari"), true), new t5.C2785b("DB", null, "Dragon Ball", p078i6.p.B0("DB-broly", "DB-bulma", "DB-buu", "DB-c18", "DB-cell", "DB-chichi", "DB-crilin", "DB-freezer", "DB-gohan", "DB-goku", "DB-majinV", "DB-vegeta", "DB-videl"), true), new t5.C2785b("HxH", null, "Hunter × Hunter", p078i6.p.B0("HxH-chrollo", "HxH-ging", "HxH-gon", "HxH-hisoka", "HxH-illumi", "HxH-killua", "HxH-kite", "HxH-kurapika", "HxH-leorio", "HxH-meruem", "HxH-netero", "HxH-pitou", "HxH-silva", "HxH-zeno"), true), new t5.C2785b("Naru", null, "Naruto", p078i6.p.B0("Naru-gaara", "Naru-hitachi", "Naru-jiraiya", "Naru-kakashi", "Naru-naruto", "Naru-sakura", "Naru-sasuke", "Naru-tsunade"), true), new t5.C2785b("1Pc", null, "One Piece", p078i6.p.B0("1Pc-brook", "1Pc-chopper", "1Pc-luffy", "1Pc-nami", "1Pc-nicorobin", "1Pc-sanji", "1Pc-shanks", "1Pc-zoro"), true), new t5.C2785b("Solo", null, "Solo Leveling", p078i6.p.B0("Solo-ant", "Solo-baruka", "Solo-cha", "Solo-gina", "Solo-igris", "Solo-jinwoo", "Solo-yonhoo"), true), new t5.C2785b("HP", null, "Harry Potter", p078i6.p.B0("HP-dobby", "HP-draco", "HP-hagri", "HP-harry", "HP-hermio", "HP-pitone", "HP-ron", "HP-silent", "HP-voldem"), true), new t5.C2785b("football", "avatars.group.football", "Football", p078i6.p.B0("football-achraf", "football-alex", "football-antoine", "football-arda", "football-cold", "football-declan", "football-dinho", "football-erling", "football-jude", "football-kenan", "football-kvara", "football-kylian", "football-lamine", "football-lauti", "football-leo", "football-lewy", "football-luka", "football-maurito", "football-mcfratm", "football-michael", "football-momo", "football-oney", "football-osi", "football-ous", "football-paulo", "football-rafa", "football-raphinha", "football-ricky", "football-sium", "football-turk", "football-victor", "football-vini"), true), new t5.C2785b("BrBa", null, "Breaking Bad", p078i6.p.B0("BrBa-guard", "BrBa-gus", "BrBa-hank", "BrBa-hector", "BrBa-jane", "BrBa-jesse", "BrBa-mike", "BrBa-saul", "BrBa-skyler", "BrBa-todd", "BrBa-tuco", "BrBa-walter", "BrBa-wwjr"), true), new t5.C2785b("GOT", null, "Game of Thrones", p078i6.p.B0("GOT-arya", "GOT-bran", "GOT-brienne", "GOT-daenerys", "GOT-jon", "GOT-ned", "GOT-regina", "GOT-samwell", "GOT-sandor", "GOT-sansa", "GOT-tyrion"), true), new t5.C2785b("himym", null, "How I Met Your Mother", p078i6.p.B0("himym-barney", "himym-capitano", "himym-james", "himym-kevin", "himym-lily", "himym-marshall", "himym-nora", "himym-robin", "himym-stella", "himym-ted", "himym-tracy", "himym-zoey"), true), new t5.C2785b("Papel", null, "La Casa de Papel", p078i6.p.B0("Papel-berlino", "Papel-denver", "Papel-helsinki", "Papel-nairobi", "Papel-prof", "Papel-raquel", "Papel-rio", "Papel-tokyo"), true), new t5.C2785b("Peaky", null, "Peaky Blinders", p078i6.p.B0("Peaky-ada", "Peaky-arthur", "Peaky-finn", "Peaky-grace", "Peaky-john", "Peaky-lizzie", "Peaky-michaelg", "Peaky-polly", "Peaky-tommy"), true), new t5.C2785b("Ville", null, "Smallville", p078i6.p.B0("Ville-chloe", "Ville-clark", "Ville-jonathan", "Ville-kara", "Ville-lana", "Ville-lex", "Ville-lionel", "Ville-lois", "Ville-martha", "Ville-tess"), true), new t5.C2785b("strthings", null, "Stranger Things", p078i6.p.B0("strthings-billy", "strthings-dust", "strthings-eddie", "strthings-hop", "strthings-john", "strthings-joyce", "strthings-lucas", "strthings-max", "strthings-mike", "strthings-nancy", "strthings-robin", "strthings-steve", "strthings-undi", "strthings-vek", "strthings-vekhuman", "strthings-will"), true), new t5.C2785b("Boys", null, "The Boys", p078i6.p.B0("Boys-abisso", "Boys-atrain", "Boys-butcher", "Boys-hughie", "Boys-kimiko", "Boys-marie", "Boys-noir", "Boys-patriota", "Boys-soldatino", "Boys-starlight"), true), new t5.C2785b("OC", null, "The O.C.", p078i6.p.B0("OC-julie", "OC-kaitlin", "OC-kristen", "OC-marissa", "OC-ryan", "OC-sandy", "OC-seth", "OC-summer"), true), new t5.C2785b("Vikings", null, "Vikings", p078i6.p.B0("Vikings-aslaug", "Vikings-athelstan", "Vikings-bjorn", "Vikings-ecbert", "Vikings-floki", "Vikings-hvitserk", "Vikings-ivar", "Vikings-lagertha", "Vikings-ragnar", "Vikings-rollo", "Vikings-ubbe"), true));
        f28120a = listB0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listB0.iterator();
        while (it.hasNext()) {
            p078i6.u.M0(arrayList, ((t5.C2785b) it.next()).f28132e);
        }
        f28121b = p078i6.o.R1(arrayList);
        java.util.List list = f28120a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((t5.C2785b) obj).f28131d) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            p078i6.u.M0(arrayList3, ((t5.C2785b) it2.next()).f28132e);
        }
        f28122c = p078i6.o.R1(arrayList3);
    }
}
