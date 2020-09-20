FROM airhacks/glassfish
COPY ./target/simplewar.war ${DEPLOYMENT_DIR}
