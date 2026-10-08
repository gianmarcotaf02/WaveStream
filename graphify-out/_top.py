import json
from pathlib import Path
from collections import Counter

p = Path('graphify-out/.graphify_detect.json')
d = json.loads(p.read_text(encoding='utf-8'))
root = d['scan_root'].replace(chr(92), '/').rstrip('/')

print('keys:', sorted(d.keys()))
print('--- code extensions ---')
print(Counter(Path(f).suffix.lower() for f in d['files']['code']).most_common())
print('--- documents ---')
for f in d['files']['document']:
    print('  ', f.replace(chr(92), '/'))
print('--- top-level keys present in files ---', list(d['files'].keys()))
print('total_files', d['total_files'], 'total_words', d['total_words'])
print('--- image extensions ---')
print(Counter(Path(f).suffix.lower() for f in d['files']['image']).most_common())
print('--- first 5 code ---')
for f in d['files']['code'][:5]:
    print('  ', f.replace(chr(92), '/'))
