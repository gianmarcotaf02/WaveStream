import json, urllib.request
API_KEY = "5f275659e4e6975d78d510255857dbf8"
url = f"https://api.themoviedb.org/3/trending/tv/week?api_key={API_KEY}&language=it-IT&page=1"
with urllib.request.urlopen(url, timeout=15) as r:
    data = json.loads(r.read())
items = data["results"]
print(f"TMDB trending TV: {len(items)} items")
for i, item in enumerate(items[:10]):
    print(f"  {i+1}. {item['name']} (id={item['id']})")
