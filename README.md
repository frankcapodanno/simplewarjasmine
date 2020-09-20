# Build
mvn clean package && docker build -t capodanno.click/simplewar .

# RUN

docker rm -f simplewar || true && docker run -d -p 8080:8080 -p 4848:4848 --name simplewar capodanno.click/simplewar "# simplewarjasmine" 
