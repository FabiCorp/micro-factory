find . -name "pom.xml" -exec mvn clean package -Dmaven.test.skip=true -f '{}' \;
