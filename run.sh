#!/bin/sh

# Run the image interactively with tag 'microservice' and forward traffic coming in on port 80 to 8080 of the container
docker run -i -p 80:8080 -t microservice
