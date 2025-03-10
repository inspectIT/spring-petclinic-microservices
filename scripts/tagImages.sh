#!/bin/bash
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-config-server ${REPOSITORY_PREFIX}/spring-petclinic-config-server:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-discovery-server ${REPOSITORY_PREFIX}/spring-petclinic-discovery-server:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-api-gateway ${REPOSITORY_PREFIX}/spring-petclinic-api-gateway:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-visits-service ${REPOSITORY_PREFIX}/spring-petclinic-visits-service:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-vets-service ${REPOSITORY_PREFIX}/spring-petclinic-vets-service:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-customers-service ${REPOSITORY_PREFIX}/spring-petclinic-customers-service:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-admin-server ${REPOSITORY_PREFIX}/spring-petclinic-admin-server:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-soap-client ${REPOSITORY_PREFIX}/spring-petclinic-soap-client:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-soap-service ${REPOSITORY_PREFIX}/spring-petclinic-soap-service:${VERSION}
docker tag ${REPOSITORY_PREFIX}/spring-petclinic-genai-service ${REPOSITORY_PREFIX}/spring-petclinic-genai-service:${VERSION}
