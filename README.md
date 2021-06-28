# public-arc-poc-philtest
App to be deployed to AKS as a test of our migration practices

## Notes
1. Establish an Artifactory API key by following the instructions at https://confluence.gapinc.com/display/CICD/How+to+update+gradle+and+npm+to+use+Artifactory+with+authentication
2. Add your API key to gradle.properties using:
`cat <<EOF >> ~/.gradle/gradle.properties`
`artifactory_username=pglebow`                    
`artifactory_password=<YOUR API KEY THAT YOU GENERATED>`
`EOF`
3. Create a `sonar-project.properties` file in the project root
   - If the project is new, it must be manually added to Sonar
4. Create a `codefresh.properties` file in the project root
5. You must use a gradle wrapper - execute `gradle wrapper`
   - NOTE: many `.gitignore` files exclude jars and the `wrapper` command will create a jar in `./gradle/wrapper` which must be checked in.
6. `gradle build`
7. The `Dockerfile` cannot be layered as of this writing.  Create a basic one and place it in the project root.
8. Build your docker image:
   - `mkdir -p build/dependency`
   - `cd build/dependency`
   - `jar -xvf ../libs/*.jar`
   - `cd ../..` 
   - `docker build -t public-arc-poc-philtest .`
9. Run using docker: `docker run -p 8080:8080 public-arc-poc-philtest`
10. Test using `curl http://localhost:8080` or a browser

## Publish to Docker Hub
1. `docker tag public-arc-poc-philtest:latest pglebow/public-arc-poc-philtest:latest`
1. `docker push pglebow/public-arc-poc-philtest:latest`
1. `docker pull pglebow/public-arc-poc-philtest:latest`
1. `docker run -p 8080:8080 pglebow/public-arc-poc-philtest:latest`
