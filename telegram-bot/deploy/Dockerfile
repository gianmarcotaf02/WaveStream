FROM node:24-alpine

WORKDIR /app

# Il bot non ha dipendenze runtime: bastano sorgenti e template di config.
COPY package.json ./
COPY config.example.json ./
COPY src ./src

RUN mkdir -p /app/data

ENV NODE_ENV=production \
    LOG_LEVEL=info

# Il token arriva da TELEGRAM_BOT_TOKEN (vedi docker-compose.yml);
# in alternativa monta config.json come volume.
CMD ["node", "src/bot.mjs"]
