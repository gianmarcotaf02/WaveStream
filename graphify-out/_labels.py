import json
from pathlib import Path
from collections import Counter

a = json.loads(Path('graphify-out/.graphify_analysis.json').read_text(encoding='utf-8'))
ext = json.loads(Path('graphify-out/.graphify_extract.json').read_text(encoding='utf-8'))
labels = {}
for n in ext['nodes']:
    labels[n['id']] = n.get('label') or n['id']

comms = a['communities']
cohesion = a['cohesion']
sizes = sorted(comms.items(), key=lambda kv: -len(kv[1]))

for cid, members in sizes[:40]:
    mem = [labels.get(m, m) for m in members]
    # longest labels first = more descriptive
    mem_sorted = sorted(mem, key=lambda x: -len(x))
    print(f"### C{cid} (n={len(members)}, coh={cohesion.get(cid)})")
    print('   ', ' | '.join(mem_sorted[:18]))
print('--- god nodes ---')
for g in a['gods'][:15]:
    print('  ', g)
