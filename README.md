# Project

This is a simple template to create a JAVA EE 8 Projekt in Maven that use Jasmine-Framework. 
Is builded on the airhacks JAVA EE template and use Pajara as webserver.
If you want to run this projekt without installing Pajara please install docker and follow the instruction in Run Section.
I programming using Netbeans but is a Maven Projekt and it's possible to import in other IDEs.

# Build

mvn clean package && docker build -t capodanno.click/simplewar .

# RUN

docker rm -f simplewar || true && docker run -d -p 8080:8080 -p 4848:4848 --name simplewar capodanno.click/simplewar "# simplewarjasmine"
