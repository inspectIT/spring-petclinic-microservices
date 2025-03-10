# How to push new images to inspectIT

1. Build local Docker images for every submodule

``
mvn clean install -Dmaven.test.skip -P buildDocker
``

2. Set environment variables

``
export REPOSITORY_PREFIX=inspectit
``

``
export VERSION=<version>
``

3. Create Docker tags

``
sh tagImages.sh
``

4. Login to inspectIT Docker account

``
docker login --username=inspectit
``

5. Push Images to Dockerhub

``
sh pushImages.sh
``
