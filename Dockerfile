FROM node
ENV MONGO_DB_USERNAME=admin \
    MONGO_DB_PWD=password

# so it will run in the container not the local machine
RUN mkdir -p /home/app

# state the source then destination
COPY . /home/app

# cmd is an entrypoint command
CMD [ "node","server.js" ]