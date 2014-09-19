Example of how to run a micro service from within a Docker container.

OSX
---
- Install boot2docker
- Start boot2docker
- Run the EXPORT command mentioned after startup
- Remember the IP address mentioned here as well (this is the IP address needed to access the microservice eventually)

Create image
------------
Run the ```build.sh``` script

The image will be tagged as 'microservice' and will expose port 8080.

Run the image
-------------
Run the ```run.sh``` script

This will start a container from the microservice image and will open up port 80 (which will be mapped to port 8080 
of the container).

In a browser go to ```http://<IP address>/microservice```
