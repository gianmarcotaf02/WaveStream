import json
from pathlib import Path

a = json.loads(Path('graphify-out/.graphify_analysis.json').read_text(encoding='utf-8'))
ext = json.loads(Path('graphify-out/.graphify_extract.json').read_text(encoding='utf-8'))
labels = {n['id']: (n.get('label') or n['id']) for n in ext['nodes']}

comms = a['communities']
sizes = sorted(comms.items(), key=lambda kv: -len(kv[1]))
for cid, members in sizes[40:]:
    mem = sorted((labels.get(m, m) for m in members), key=lambda x: -len(x))
    print(f"C{cid} n={len(members)}: " + ' | '.join(mem[:8]))
