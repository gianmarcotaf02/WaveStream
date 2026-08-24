import json, urllib.request, sys, io
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')

API_KEY = "5f275659e4e6975d78d510255857dbf8"
BASE = "https://api.themoviedb.org/3"

# Test trending TV
url = f"{BASE}/trending/tv/week?api_key={API_KEY}&language=it-IT&page=1"
print(f"GET {url}")
with urllib.request.urlopen(url, timeout=15) as r:
    data = json.loads(r.read())

results = data["results"]
print(f"\nTotal trending TV: {len(results)}\n")
for i, item in enumerate(results[:15]):
    mid = item["id"]
    name = item["name"]
    orig = item.get("original_name", "")
    vote = item.get("vote_average", 0)
    date = item.get("first_air_date", "?")
    poster = item.get("poster_path", "")
    backdr = item.get("backdrop_path", "")
    genres = item.get("genre_ids", [])
    print(f"  {i+1:2d}. id={mid}  vote={vote:.1f}  date={date}  genres={genres}")
    print(f"      name={name}")
    if orig != name:
        print(f"      orig={orig}")
    print(f"      poster={'YES' if poster else 'NO'}  backdrop={'YES' if backdr else 'NO'}")
    print()

# Test trending movies too
url2 = f"{BASE}/trending/movie/week?api_key={API_KEY}&language=it-IT&page=1"
print(f"\nGET {url2}")
with urllib.request.urlopen(url2, timeout=15) as r:
    data2 = json.loads(r.read())

results2 = data2["results"]
print(f"\nTotal trending movies: {len(results2)}\n")
for i, item in enumerate(results2[:10]):
    mid = item["id"]
    name = item["title"]
    vote = item.get("vote_average", 0)
    date = item.get("release_date", "?")
    print(f"  {i+1:2d}. id={mid}  vote={vote:.1f}  date={date}  title={name}")
