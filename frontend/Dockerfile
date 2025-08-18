FROM node:14

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN ln -s /app/node_modules /app/src/node_modules

RUN npm run build:css

EXPOSE 3000

CMD ["npx", "lite-server"]
